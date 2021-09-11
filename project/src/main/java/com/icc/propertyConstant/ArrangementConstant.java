package com.icc.propertyConstant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ArrangementConstant{
    TEST("test"),
    ONE_DAY("ONE_DAY"),
    T20("T20");
    @Getter
    private String value;
}
