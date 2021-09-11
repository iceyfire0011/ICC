package com.icc.dto;

import com.icc.model.Country;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class User{
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNo;
    private String address;
    private String role;
    private Timestamp dateOfBirth;
    private Country country;
}
