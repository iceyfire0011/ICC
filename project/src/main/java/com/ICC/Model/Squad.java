package com.ICC.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Squad extends BaseModel{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId")
    private Team team;
    @OneToMany(fetch = FetchType.LAZY)
    private List<User> users;
}
