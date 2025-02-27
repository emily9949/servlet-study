package com.sumin.listener.section02.sessionListener;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class userDTO implements HttpSessionBindingListener {
    private String name;
    private int age;

    public userDTO() {
    }

    public userDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("userDTO 객체가 담김");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("userDTO 객체가 제거됨");
    }
}
