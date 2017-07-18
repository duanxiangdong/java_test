package com.test.reflect;

import java.lang.reflect.Method;

/**
 * author       xiangdong.duan
 * Date         2017/7/18
 * version      1.0
 * description  反射测试
 */
public class TestReflect {

    public static void main(String[] args) throws Exception {
        Class<?> clz = Class.forName("com.test.reflect.Man");
        Object o = clz.newInstance();
        Method m = clz.getMethod("canDo", Integer.class);
        Boolean reValue = (Boolean) m.invoke(o, 18);
        if (reValue) {

        }
    }
}