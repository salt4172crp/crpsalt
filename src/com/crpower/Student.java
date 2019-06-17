package com.crpower;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public Student() {
    }

    public Student(String name, int age, String gender, String phone, String address, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(this.getName() + " is eating food");
    }

    public void drink() {
        System.out.println(this.getName() + " is drinking water");
    }

    public void play() {
        System.out.println(this.getName() + " is playing game");
    }

    public void sleep() {
        System.out.println(this.getName() + " is sleeping");
    }
}
