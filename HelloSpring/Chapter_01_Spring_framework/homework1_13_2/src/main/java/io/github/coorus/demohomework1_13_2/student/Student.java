package io.github.coorus.demohomework1_13_2.student;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
//@ToString
public class Student {
    //2.用IOC管理学生对象，所有学生信息从配置文件获取（学号、姓名、年龄、性别）
    private String id;
    private String name;
    private int age;
    private int sex;

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + ", sex=" + sex + "}";
    }

}
