package com.tuling.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created on 2021/3/21.
 *
 * @author shenyawei
 */
public class Person implements InitializingBean, DisposableBean {

    private Integer id;
    private String name;
    private String gender;
    private Date birthday;
    private List<String> hobbles;
    private Map<Integer, String> course;
    private Wife wife;

    public Person() {
        System.out.println("Person已加载");
    }

    public Person(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", hobbles=" + hobbles +
                ", course=" + course +
                ", wife=" + wife +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbles() {
        return hobbles;
    }

    public void setHobbles(List<String> hobbles) {
        this.hobbles = hobbles;
    }

    public Map<Integer, String> getCourse() {
        return course;
    }

    public void setCourse(Map<Integer, String> course) {
        this.course = course;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public static Person createPersonFactory() {
        Child child = new Child();
        child.setName("son");
        return child;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Person销毁");
    }

    public void personByConfig() {
        System.out.println("Persion过程");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person创建");
    }
}
