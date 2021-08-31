package com.ICC.Model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Country extends BaseModel{
    private String countryName;
}
