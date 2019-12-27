package com.zbq.springbootdemo.common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangboqing
 * @date 2019-11-17
 */
//@MyAnnotation
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Param1 {
    private String name;
}
