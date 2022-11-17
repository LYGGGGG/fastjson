package com.y.domain;

/*
@author YG
@create 2022/11/17   13:48
*/

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String name;
    private int age;

    @JSONField(format = "YYYY-MM-dd HH:mm:ss")
    private Date createTime;
}
