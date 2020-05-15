package com.entity;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2020-05-14 16:09:28
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = -25196427410460044L;
    
    private Integer dId;
    
    private String dName;
    
    private String dRemark;


    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public String getDRemark() {
        return dRemark;
    }

    public void setDRemark(String dRemark) {
        this.dRemark = dRemark;
    }

}