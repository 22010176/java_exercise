package BT7.Bai1;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (courses.indexOf(course) != -1)
            return false;
        courses.add(course);
        return true;
    }

    public boolean removeCourse(String course) {
        if (courses.indexOf(course) == -1)
            return false;
        courses.remove(courses.indexOf(course));
        return true;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Teacher: " + super.toString();
    }
}
