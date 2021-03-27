package com.tuling.test;

import com.tuling.beans.User;
import com.tuling.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2021/3/23.
 *
 * @author shenyawei
 */
public class IocTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
    }
}
