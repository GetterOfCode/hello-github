package com.hainiu.excep;
import java.util.Objects;
public class Student {
    private String name;
    private Integer age;
    public Student() {
    }
    public Student(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        //如果年龄不符合要求则抛出异常 反之则不处理
        if (!ageJudge(age)){
            //初始化异常信息 初始化后并抛出
            throw new AgeOutOfBoundsException("Age must be between 18 and 40");
        }
        try{
            this.age = age;
        }catch (AgeOutOfBoundsException e){
            e.printStackTrace();
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    /**
     * 判断年龄是否符合要求方法
     * @param age 年龄
     * @return 是否符合要求boolean
     */
    public static boolean ageJudge(Integer age) {
        if(age >=40&& age <=18){
            //年龄符合范围要求
            return true;
        }
        //年龄不符合范围要求
        return false;
    }
}
