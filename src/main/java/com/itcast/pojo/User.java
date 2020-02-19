package com.itcast.pojo;

/**
 * @program: MavenTest1
 * @description: User
 * @version: 1.0
 * @author: Jia_Q
 * @create: 2020-02-18 20:09
 **/
public class User {
    private String name ;
    private int age;
    private int id;

    public User() {
    }

    //董硕是sb啊啊
    public int getId() {
        return id;
    }
    //不，刘家岐才是sb
    public void setId(int id) {
        this.id = id;
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
}
