package com.icc.propertyConstant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ResultConstant{
    WIN("WIN"),
    LOSE("LOSE"),
    DRAW("DRAW");
    @Getter
    private String value;
}
