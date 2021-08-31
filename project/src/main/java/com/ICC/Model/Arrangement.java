package com.ICC.Model;

import com.ICC.propertyConstant.ArrangementConstant;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Arrangement extends BaseModel{
    private String arrangementName;
    private ArrangementConstant arrangementType;
}
