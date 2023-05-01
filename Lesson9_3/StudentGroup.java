package Lesson9_3;

import java.util.List;

public class StudentGroup {
    List<Student> students;
    private Teacher teacher;
    int groupNumber;

    StudentGroup(int groupNumber, Teacher teacher) {
        this.groupNumber = groupNumber;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void delStudent(Student student) {
        students.remove(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
