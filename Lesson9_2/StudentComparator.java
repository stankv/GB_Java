package Lesson9_2;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student student, Student anotherStudent) {    //компаратор (сравниваем по длине фамилии)
        if (student.getAverage() > anotherStudent.getAverage()) return -1;
        if (student.getAverage() < anotherStudent.getAverage()) return 1;
        if (student.getlastName().length() > anotherStudent.getlastName().length()) return -1;
        if (student.getlastName().length() < anotherStudent.getlastName().length()) return 1;
        return 0;
    }
}
