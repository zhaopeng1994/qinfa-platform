package com.qinfagroup.platform.generator.core;

import com.qinfagroup.platform.generator.entity.ColumnEntity;
import com.qinfagroup.platform.generator.entity.GeneratorConfigEntity;
import com.qinfagroup.platform.generator.entity.TableEntity;
import com.qinfagroup.platform.generator.model.DataTableDto;
import com.qinfagroup.platform.generator.model.GeneratorAttributeRequestVo;
import com.qinfagroup.platform.generator.util.DateUtils;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 代码生成器
 *
 * @author peng.zhao
 */
public class CodeGenerator {


    /**
     * 代码生成
     * @param dataTableDto 数据表
     * @param zipOutputStream zip文件输出流
     */
    public static void generateCode(DataTableDto dataTableDto, ZipOutputStream zipOutputStream) {
        GeneratorAttributeRequestVo generatorAttribute = dataTableDto.getGeneratorAttribute();
        TableEntity table = dataTableDto.getTable();

        // 模板数据封装
        Map<String, Object> data = new HashMap<>();
        data.put("tableName", table.getTableName());
        data.put("comments", getSampleComments(table.getComments()));

    }

    private static String getSampleComments(String comments) {
        return StringUtils.endsWith(comments, "表") ? StringUtils.substringBeforeLast(comments,"表") : comments;
    }




    /*public static void generatorCode(Map<String, String> table,
                                     List<Map<String, String>> columns, ZipOutputStream zip) {
        //配置信息
        Configuration config = getConfig();
        boolean hasBigDecimal = false;
        boolean hasLocalDateTime = false;
        boolean hasLocalDate = false;
        boolean hasList = false;
        boolean hasEntitySuperClass = false;
        //表信息
        TableEntity tableEntity = new TableEntity();
        tableEntity.setTableName(table.get("tableName"));
        tableEntity.setComments(table.get("tableComment"));
        //表名转换成Java类名
        String className = tableToJava(tableEntity.getTableName(), config.getStringArray("tablePrefix"));
        tableEntity.setClassName(className);
        tableEntity.setClassname(StringUtils.uncapitalize(className));

        String entitySuperClass = config.getString("entitySuperClass"), entitySuperClassName = "";
        if (StringUtils.isNotBlank(entitySuperClass)) {
            hasEntitySuperClass = true;
            entitySuperClassName = entitySuperClass.substring(entitySuperClass.lastIndexOf(".") + 1);
        }

        //列信息
        List<ColumnEntity> columsList = new ArrayList<>();
        for (Map<String, String> column : columns) {
            ColumnEntity columnEntity = new ColumnEntity();
            columnEntity.setColumnName(column.get("columnName"));
            columnEntity.setDataType(column.get("dataType"));
            columnEntity.setComments(column.get("columnComment"));
            columnEntity.setExtra(column.get("extra"));

            //列名转换成Java属性名
            String attrName = columnToJava(columnEntity.getColumnName());
            columnEntity.setAttrName(attrName);
            columnEntity.setAttrname(StringUtils.uncapitalize(attrName));

            //列的数据类型，转换成Java类型
            String attrType = config.getString(columnEntity.getDataType(), columnToJava(columnEntity.getDataType()));
            columnEntity.setAttrType(attrType);

            //是否主键
            if ("PRI".equalsIgnoreCase(column.get("columnKey")) && tableEntity.getPk() == null) {
                tableEntity.setPk(columnEntity);
            }

            if (hasEntitySuperClass) {
                Map<String, String> superClassFields = getSuperClassFields(entitySuperClass);
                if (superClassFields.containsKey(columnEntity.getAttrname()) && superClassFields.get(columnEntity.getAttrname()).endsWith(attrType)) {
                    continue;
                }
            }

            if (!hasBigDecimal && "BigDecimal".equals(attrType)) {
                hasBigDecimal = true;
            }
            if (!hasLocalDateTime && "LocalDateTime".equals(attrType)) {
                hasLocalDateTime = true;
            }
            if (!hasLocalDate && "LocalDate".equals(attrType)) {
                hasLocalDate = true;
            }
            if (!hasList && "array".equals(columnEntity.getExtra())) {
                hasList = true;
            }

            columsList.add(columnEntity);
        }
        tableEntity.setColumns(columsList);

        //没主键，则第一个字段为主键
        if (tableEntity.getPk() == null) {
            tableEntity.setPk(tableEntity.getColumns().get(0));
        }

        //设置velocity资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);

        String mainPath = config.getString("mainPath");
        mainPath = StringUtils.isBlank(mainPath) ? "com.qinfagroup.platform" : mainPath;

        //封装模板数据
        Map<String, Object> map = new HashMap<>();
        map.put("tableName", tableEntity.getTableName());
        map.put("comments", tableEntity.getComments());
        map.put("pk", tableEntity.getPk());
        map.put("className", tableEntity.getClassName());
        map.put("classname", tableEntity.getClassname());
        map.put("pathName", tableEntity.getClassname());
        map.put("columns", tableEntity.getColumns());
        map.put("hasBigDecimal", hasBigDecimal);
        map.put("hasLocalDateTime", hasLocalDateTime);
        map.put("hasLocalDate", hasLocalDate);
        map.put("hasList", hasList);
        map.put("hasEntitySuperClass", hasEntitySuperClass);
        map.put("entitySuperClass", entitySuperClass);
        map.put("entitySuperClassName", entitySuperClassName);
        map.put("mainPath", mainPath);
        map.put("package", config.getString("package"));
        map.put("moduleName", config.getString("moduleName"));
        map.put("author", config.getString("author"));
        map.put("email", config.getString("email"));
        map.put("datetime", DateUtils.format(new Date(), DateUtils.DATE_TIME_PATTERN));
        VelocityContext context = new VelocityContext(map);

        //获取模板列表
        List<String> templates = getTemplates();
        for (String template : templates) {
            //渲染模板
            StringWriter sw = new StringWriter();
            Template tpl = Velocity.getTemplate(template, "UTF-8");
            tpl.merge(context, sw);

            try {
                //添加到zip
                zip.putNextEntry(new ZipEntry(getFileName(template, tableEntity.getClassName(), config.getString("package"), config.getString("moduleName"))));
                IOUtils.write(sw.toString(), zip, "UTF-8");
                IOUtils.closeQuietly(sw);
                zip.closeEntry();
            } catch (IOException e) {
                throw new RuntimeException("渲染模板失败，表名：" + tableEntity.getTableName(), e);
            }
        }
    }*/

}
