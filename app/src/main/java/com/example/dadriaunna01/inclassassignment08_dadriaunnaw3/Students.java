package com.example.dadriaunna01.inclassassignment08_dadriaunnaw3;

/**
 * Created by cmltdstudent on 4/4/17.
 */

public class Students {

    private boolean passing;
    private String name;
    private int age;

    public Students(boolean passing, String name, int age) {
        this.passing = passing;
        this.name = name;
        this.age = age;
    }

    public boolean isPassing() {
        return passing;
    }

    public void setPassing(boolean passing) {
        this.passing = passing;
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
        return "Students{" +
                "passing=" + passing +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
