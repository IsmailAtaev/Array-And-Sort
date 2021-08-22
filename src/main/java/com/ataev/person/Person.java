package com.ataev.person;

public class Person implements Comparable<Person> {
    private Integer age;
    private String name;

    public Person() {
        super();
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age && !this.name.equals(o.name)) {
            return 1;
        } else if (this.age.equals(o.age) && this.name.equals(o.name)) {
            return 0;
        } else
            return -1;
    }
}