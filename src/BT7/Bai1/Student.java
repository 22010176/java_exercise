package BT7.Bai1;

import java.util.HashMap;

public class Student extends Person {
    private HashMap<String, Integer> courses;

    public Student(String name, String address) {
        super(name, address);
        courses = new HashMap<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.put(course, grade);
    }

    public void printGrades() {
        System.out.println(courses.values().toString());
    }

    public double getAverageGrade() {
        double x = 0;
        for (int a : courses.values())
            x += a;
        return x / courses.size();
    }

    public HashMap<String, Integer> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student: " + super.toString();
    }
}
