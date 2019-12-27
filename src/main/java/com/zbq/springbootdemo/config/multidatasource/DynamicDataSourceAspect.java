package com.zbq.springbootdemo.config.multidatasource;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
@Aspect
@Component
public class DynamicDataSourceAspect {

    @Before("@annotation(dataSourceName)")
    public void beforeSwitchDataSource(DataSourceName dataSourceName){
        // 切换数据源
        DataSourceNameContextHolder.setDataSourceName(dataSourceName.value());
    }

    @After("@annotation(com.zbq.springbootdemo.config.multidatasource.DataSourceName)")
    public void afterSwitchDataSource(){
        DataSourceNameContextHolder.resetDataSourceName();
    }
}

