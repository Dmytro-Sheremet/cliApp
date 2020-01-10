package com.ds.testask.departmentdemo.entity;

import java.util.stream.Stream;

public enum Position {
    HEAD("HEAD", "Head"),
    LECTOR("LECTOR", "Lector");

    private String alias;
    private String title;

    Position(String alias, String title) {
        this.alias = alias;
        this.title = title;
    }

    public static Position byAlias(String positionAlias) {
        return Stream.of(values())
                .filter(position -> position.alias.equals(positionAlias))
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
