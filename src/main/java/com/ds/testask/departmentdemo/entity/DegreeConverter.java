package com.ds.testask.departmentdemo.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class DegreeConverter implements AttributeConverter<Degree, String> {
    @Override
    public String convertToDatabaseColumn(Degree attribute) {
        return attribute.getAlias();
    }

    @Override
    public Degree convertToEntityAttribute(String dbData) {
        return Degree.byAlias(dbData);
    }
}
