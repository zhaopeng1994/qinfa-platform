package com.qinfagroup.platform.generator.model;

import com.qinfagroup.platform.generator.entity.ColumnEntity;
import com.qinfagroup.platform.generator.entity.TableEntity;

import java.util.List;

/**
 * 数据表数据传输类
 * @author peng.zhao
 */
public class DataTableDto {

    private TableEntity table;

    private List<ColumnEntity> columns;

    private GeneratorAttributeRequestVo generatorAttribute;

    public TableEntity getTable() {
        return table;
    }

    public void setTable(TableEntity table) {
        this.table = table;
    }

    public List<ColumnEntity> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnEntity> columns) {
        this.columns = columns;
    }

    public GeneratorAttributeRequestVo getGeneratorAttribute() {
        return generatorAttribute;
    }

    public void setGeneratorAttribute(GeneratorAttributeRequestVo generatorAttribute) {
        this.generatorAttribute = generatorAttribute;
    }
}
