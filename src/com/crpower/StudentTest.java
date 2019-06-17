package com.crpower;

public class StudentTest {
    public static void main(String[] args) {
        //JAVA的一行代码太长，怎么换行？直接Enter换行
        Student student = new Student("wangyan",
                13, "man",
                "1234522", "shenz",
                "wangyan@154.com");
        student.eat();
        System.out.println(student.getAddress());
        Student[] students = {new Student("wangyan",
                13, "man",
                "1234522", "shenz",
                "wangyan@154.com"),
                new Student("wang", 13,
                        "man", "1234522",
                        "shenz", "wangyan@154.com")};
        for (Student s : students) {
            s.eat();
            System.out.println(s.getName() + s.getAddress() + s.getEmail()
                    + s.getGender() + s.getPhone() + s.getAge());
        }
    }
}
