package com.test.reflect;

/**
 * author       xiangdong.duan
 * Date         2017/7/18
 * version      1.0
 * description
 */
public class Man {

    public Boolean canDo(Integer n){
        if (n < 18) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }
}
