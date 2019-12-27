package com.zbq.springbootdemo.config.multidatasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
public class DynamicDataSourceRouter extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceNameContextHolder.getDataSourceName();
    }

    @Override
    public void setLogWriter(PrintWriter pw) throws SQLException {
        super.setLogWriter(pw);
    }
}
