package com.ds.testask.departmentdemo.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PositionConverter implements AttributeConverter<Position, String> {
    @Override
    public String convertToDatabaseColumn(Position attribute) {
        return attribute.getAlias();
    }

    @Override
    public Position convertToEntityAttribute(String dbData) {
        return Position.byAlias(dbData);
    }
}
