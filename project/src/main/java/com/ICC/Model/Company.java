package com.ICC.Model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Company extends BaseModel{
    private String companyName;
}
