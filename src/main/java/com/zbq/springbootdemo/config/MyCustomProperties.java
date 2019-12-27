package com.zbq.springbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2019-11-20
 */
@Component
@ConfigurationProperties(prefix = "my.custom.property")
public class MyCustomProperties {

    private String name;

    private String username;

    private String age;

    @DeprecatedConfigurationProperty(reason = "换名称了",replacement = "username")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
