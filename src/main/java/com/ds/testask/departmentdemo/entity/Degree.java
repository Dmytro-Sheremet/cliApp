package com.ds.testask.departmentdemo.entity;

import javax.persistence.Entity;
import java.util.stream.Stream;


public enum Degree {

    ASSISTANT("ASSISTANT", "Assistant"),
    ASSOCIATE_PROFESSOR("ASSOCIATE PROFESSOR", "Associate Professor"),
    PROFESSOR("PROFESSOR", "Professor");

    public String alias;
    public String title;

    Degree(String alias, String title) {
        this.alias = alias;
        this.title = title;
    }

    public static Degree byAlias(String degreeAlias) {

        return Stream.of(values())
                .filter(degree -> degree.alias.equals(degreeAlias))
                .findAny()
                .orElse(null);
    }

    public String getAlias() {
        return alias;
    }

    public String getTitle() {
        return title;
    }


}
