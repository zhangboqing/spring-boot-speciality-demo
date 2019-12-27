package com.zbq.springbootdemo.config.multidatasource;

import java.lang.annotation.*;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface DataSourceName {

    /**
     * 指定数据源名称
     * @return dataSourceName
     */
    String value() default "primary";
}
