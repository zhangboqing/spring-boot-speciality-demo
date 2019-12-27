package com.zbq.springbootdemo.service;

import com.zbq.springbootdemo.dao.UserDao;
import com.zbq.springbootdemo.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangboqing
 * @date 2019-11-21
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getNewestOne() {
        return userDao.getNewstOne();
    }

    @Override
    public User getNewestOne2() {
        return userDao.getNewstOne2();
    }
}
