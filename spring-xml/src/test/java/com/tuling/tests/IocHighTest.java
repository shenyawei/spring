package com.tuling.tests;

import com.alibaba.druid.pool.DruidDataSource;
import com.tuling.beans.Person;
import com.tuling.beans.Wife;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2021/3/22.
 *
 * @author shenyawei
 */
public class IocHighTest {

    AbstractApplicationContext ioc;

    @Before
    public void before() {
        //加载Spring容器，负责实例化、配置和组装Bean
        //ApplicationContext spring的顶层核心借口
        //ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
        //容器初始化时就会加载所有的bean
        ioc = new ClassPathXmlApplicationContext("spring-ioc-high.xml");
        System.out.println("Spring容器已加载");
    }

    @Test
    public void test01() {
        Wife wife = ioc.getBean("wife", Wife.class);
        System.out.println(wife);
    }


    @Test
    public void test02() {
        Person person = ioc.getBean("person", Person.class);
        Person person1 = ioc.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test03() {
        Person person = ioc.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test04() {
        DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }

    @After
    public void after() {
        ioc.close();
    }

}
