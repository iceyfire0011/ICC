package com.icc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Data
@Entity
public class User extends BaseModel{
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNo;
    private String address;
    private String role;
    private Timestamp dateOfBirth;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId")
    private Country country;

}
