

package com.qinfagroup.platform.generator.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qinfagroup.platform.generator.util.Query;
import com.qinfagroup.platform.generator.dao.GeneratorDao;
import com.qinfagroup.platform.generator.util.GenUtils;
import com.qinfagroup.platform.generator.util.PageUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/**
 * 代码生成服务类
 * @author peng.zhao
 */
@Service
public class SysGeneratorService {

    @Autowired
    private GeneratorDao generatorDao;

    /**
     * 分页查询所有数据表
     */
    public PageUtils queryList(Query query) {
        Page<?> page = PageHelper.startPage(query.getPage(), query.getLimit());
        List<Map<String, Object>> list = generatorDao.queryList(query);
        int total = (int) page.getTotal();
//        if (generatorDao instanceof MongoDBGeneratorDao) {
//            total = MongoDBCollectionFactory.getCollectionTotal(query);
//        }
        return new PageUtils(list, total, query.getLimit(), query.getPage());
    }

    public Map<String, String> queryTable(String tableName) {
        return generatorDao.queryTable(tableName);
    }

    public List<Map<String, String>> queryColumns(String tableName) {
        return generatorDao.queryColumns(tableName);
    }


    public byte[] generatorCode(String[] tableNames) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);
        for (String tableName : tableNames) {
            //查询表信息
            Map<String, String> table = queryTable(tableName);
            //查询列信息
            List<Map<String, String>> columns = queryColumns(tableName);
            //生成代码
            GenUtils.generatorCode(table, columns, zip);
        }
//        if (MongoManager.isMongo()) {
//            GenUtils.generatorMongoCode(tableNames, zip);
//        }
        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }
}
