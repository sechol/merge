package com.zoro.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: SpringCloud
 * @description: a
 * @author: Zoro Li
 * @create: 2019-10-08 10:16
 */
/*SpringCloud中公共模块里的实体类都需要序列化，
因为在其他模组调用公共模块时需要将实体类序列号之后进行传输*/
@Entity
@Table(name = "t_student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private String username;
    @Column(name = "age")
    private int age;
    @Column(length = 20)
    private String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}