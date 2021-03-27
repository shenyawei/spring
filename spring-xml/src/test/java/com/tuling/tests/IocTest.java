package com.tuling.tests;


import com.tuling.beans.Person;
import com.tuling.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2021/3/20.
 *
 * @author shenyawei
 */
public class IocTest {

    ApplicationContext ioc;

    @Before
    public void before() {
        //加载Spring容器，负责实例化、配置和组装Bean
        //ApplicationContext spring的顶层核心借口
        //ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
        //容器初始化时就会加载所有的bean
        ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        System.out.println("Spring容器已加载");
    }

    @Test
    public void test01() {
        //通过类获取实例
        //User bean = ioc.getBean(User.class);
        //通过名字获取，需要强转
        //User bean = (User)ioc.getBean("user");
        //通过名字和类获取
        User bean = ioc.getBean("user", User.class);
        System.out.println(bean);

    }

    @Test
    public void test02() {
        //alias 通过别名获取实例
        //User bean = ioc.getBean("tuling", User.class);
        //name 别名获取实例
        User bean = ioc.getBean("user000", User.class);
        System.out.println(bean);
    }

    @Test
    public void test03() {
        // setter的依赖注入
        // 对应setter方法名，来设置变量
        User bean = ioc.getBean("user-setter", User.class);
        System.out.println(bean);
    }

    @Test
    public void test04() {
        // 构造函数constructor的依赖注入
        User bean = ioc.getBean("user-constructor", User.class);
        System.out.println(bean);
    }

    @Test
    public void test05() {
        // 复杂类型注入
        Person bean = ioc.getBean("person", Person.class);
        System.out.println(bean);
    }

}
