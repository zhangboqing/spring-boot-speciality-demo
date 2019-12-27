package com.zbq.springbootdemo.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangboqing
 * @date 2019-11-21
 */
@Data
public class User {
    private Long uid;
    private String phone;
    private Date createTime;
    private Date updateTime;
}
