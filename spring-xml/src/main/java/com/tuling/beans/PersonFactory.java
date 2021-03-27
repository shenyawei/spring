package com.tuling.beans;

import java.util.Date;

/**
 * Created on 2021/3/22.
 *
 * @author shenyawei
 */
public class PersonFactory {
    public Person createPersonFactoryMethod() {
        Child child = new Child();
        child.setName("sonson");
        return child;
    }

    public static Date getNowDate() {
        return new Date();
    }
}
