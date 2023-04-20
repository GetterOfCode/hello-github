package com.hainiu;

import java.util.Objects;

public class Worker implements Comparable<Worker>{
    private String name;
    private Integer age;
    private Integer salary;

    public Worker() {
    }

    public Worker(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Worker worker = (Worker) o;
//        return Objects.equals(name, worker.name) && Objects.equals(age, worker.age) && Objects.equals(salary, worker.salary);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, salary);
//    }

    @Override
    public int compareTo(Worker o) {
        int i = o.salary - this.salary;
        if (i == 0){
            i = this.age-o.age;
        }
        if (i == 0){
            this.name.compareTo(o.name);
        }
        return i;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
