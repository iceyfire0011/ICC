package com.ICC.Model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class PerformanceType extends BaseModel{

    private String pTName;

}
