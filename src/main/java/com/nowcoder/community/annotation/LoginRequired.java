package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 声明注解作用对象
@Target(ElementType.METHOD)
// 声明注解作用时间
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {



}
