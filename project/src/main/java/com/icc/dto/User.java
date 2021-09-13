package com.icc.dto;


import lombok.Data;
import lombok.Generated;

import java.sql.Timestamp;
import java.util.List;

@Data
public class User extends BaseDTO{
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNo;
    private String address;
    private String role;
    private Timestamp dateOfBirth;
    private Country country;
    private List<Country> countryList;
}
