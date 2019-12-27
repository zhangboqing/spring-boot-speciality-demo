package com.zbq.springbootdemo.config.multidatasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.NamedThreadLocal;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
@Slf4j
public class DataSourceNameContextHolder {

    private static final ThreadLocal<String> dataSourceNameContextHolder = new NamedThreadLocal<>("DataSourceContext");

    /** 默认数据源名称 */
    public static final String DEFAULT_DATASOURCE_NAME = "primary";

    public static void setDataSourceName(String dataSourceName) {
        log.info("切换到[{}]数据源", dataSourceName);
        dataSourceNameContextHolder.set(dataSourceName);
    }

    public static String getDataSourceName() {

        return dataSourceNameContextHolder.get() != null ? dataSourceNameContextHolder.get() : DEFAULT_DATASOURCE_NAME;
    }

    public static void resetDataSourceName() {
        dataSourceNameContextHolder.remove();
    }
}

