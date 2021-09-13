package com.icc.propertyConstant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CountryConstant{
    AFGHANISTAN("Afghanistan"),
    AUSTRALIA("Australia"),
    BANGLADESH("Bangladesh"),
    CANADA("Canada"),
    ENGLAND("England"),
    HOLLAND("Holland"),
    INDIA("India"),
    IRELAND("Ireland"),
    KENYA("Kenya"),
    NEW_ZEALAND("New_Zealand"),
    NEPAL("Nepal"),
    PAKISTAN("Pakistan"),
    SRI_LANKA("Sri Lanka"),
    WEST_INDIES("West Indies");

    @Getter
    private String value;
}
