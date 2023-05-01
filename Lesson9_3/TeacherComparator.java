package Lesson9_3;

import java.util.Comparator;


public class TeacherComparator implements Comparator<Teacher> {
 
    public int compare(Teacher teacher, Teacher anotherTeacher) {
        if (teacher.getNumberOfGroups() > anotherTeacher.getNumberOfGroups()) {
            return -1;

        } else if (teacher.getNumberOfGroups() < anotherTeacher.getNumberOfGroups()) {
            return 1;
        }
        return 0;
    }
}
