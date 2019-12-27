package com.zbq.springbootdemo.config.multidatasource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
@Configuration
// 自定义数据源一定要排除SpringBoot自动配置数据源，不然会出现循环引用的问题，The dependencies of some of the beans in the application context form a cycle
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class DataSourceConfig {


    @Bean(name = "primary")
    @ConfigurationProperties(prefix = "spring.datasource.primary.hikari")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondary")
    @ConfigurationProperties(prefix = "spring.datasource.secondary.hikari")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源
     * 通过AOP+注解实现动态切换
     *
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dataSource() {
        DynamicDataSourceRouter dynamicDataSource = new DynamicDataSourceRouter();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(primaryDataSource());
        // 配置多数据源
        Map<Object, Object> dataSourceMap = new HashMap(5);
        dataSourceMap.put("primary", primaryDataSource());
        dataSourceMap.put("secondary", secondaryDataSource());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    /**
     * 配置@Transactional注解事物
     *
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}
