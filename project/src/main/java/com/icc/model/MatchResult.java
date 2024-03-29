package com.icc.model;

import com.icc.propertyConstant.ResultConstant;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class MatchResult extends BaseModel{
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "matchId")
    private Match match;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "squadId")
    private Squad squad;
    private ResultConstant result;
    private float point;
}
