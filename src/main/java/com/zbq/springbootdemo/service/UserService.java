package com.zbq.springbootdemo.service;

import com.zbq.springbootdemo.domain.entity.User;

/**
 * @author zhangboqing
 * @date 2019-11-21
 */
public interface UserService {
    User getNewestOne();
    User getNewestOne2();
}
