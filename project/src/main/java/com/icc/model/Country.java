package com.icc.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Country extends BaseModel{
    private String countryName;
}
