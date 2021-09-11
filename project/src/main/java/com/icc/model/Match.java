package com.icc.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Match extends BaseModel{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arrangementId")
    private Arrangement arrangement;
}
