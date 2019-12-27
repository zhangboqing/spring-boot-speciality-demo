package com.zbq.springbootdemo.dao;

import com.zbq.springbootdemo.config.multidatasource.DataSourceName;
import com.zbq.springbootdemo.domain.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author zhangboqing
 * @date 2019-11-21
 */
@Repository
public interface UserDao {

    @DataSourceName("secondary")
    @Select("select * from user order by create_time desc limit 1 ")
    public User getNewstOne();

    // 默认是primary，所以可以不指定
//    @DataSourceName("primary")
    @Select("select * from user order by create_time desc limit 1 ")
    public User getNewstOne2();
}
