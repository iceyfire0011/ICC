package com.icc.propertyConstant;

import lombok.*;

@AllArgsConstructor
public enum StatusConstant{
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    MODIFIED("MODIFIED"),
    DELETED("DELETED"),
    PENDING("PENDING"),
    STARTED("STARTED"),
    FINISHED("FINISHED"),
    CANCELED("CANCELED");

    @Getter
    private String value;
}
