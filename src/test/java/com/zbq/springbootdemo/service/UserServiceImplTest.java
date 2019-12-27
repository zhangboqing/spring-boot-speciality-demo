package com.zbq.springbootdemo.service;

import com.zbq.springbootdemo.dao.UserDao;
import com.zbq.springbootdemo.domain.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhangboqing
 * @date 2019-11-21
 */
@SpringBootTest
@Slf4j
class UserServiceImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    void getNewestOne() {
        User newestOne = userDao.getNewstOne();
        User newestOne2 = userDao.getNewstOne2();
        log.info(newestOne.toString());
        log.info(newestOne2.toString());
    }
}