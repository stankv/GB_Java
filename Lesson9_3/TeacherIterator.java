package Lesson9_3;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher> {
    private int counter;
    private List<Teacher> teachers;

    public TeacherIterator(List<Teacher> teachers) {
        this.counter = 0;
        this.teachers = teachers;
    }


    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        return teachers.get(counter++);
    }
}

