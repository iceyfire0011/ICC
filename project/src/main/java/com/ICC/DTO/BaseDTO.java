package com.ICC.DTO;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BaseDTO{
    private UUID id;
    private String createdBy;
    private Timestamp createdAt;
    private String modifiedBy;
    private Timestamp modifiedAt;
    private String status;

}
