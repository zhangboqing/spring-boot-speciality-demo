package com.zbq.springbootdemo.speciality.dynamicRegisterBean.DeferredImportSelector;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author zhangboqing
 * @Date 2019/12/30
 */
@Configuration
@AutoConfigureBefore({MyDeferredImportSelectorConfiguration.class})
public class MyDeferrdImportSelectorServiceAutoConfiguraion {

//    @Bean
//    public  MyDeferrdImportSelectorService createMyDeferrdImportSelectorService() {
//        MyDeferrdImportSelectorService myDeferrdImportSelectorService = new MyDeferrdImportSelectorService();
//        return myDeferrdImportSelectorService;
//    }
}
