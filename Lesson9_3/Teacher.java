package Lesson9_3;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String lastName;
    private List<StudentGroup> groups;


    Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.groups = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Name: %s  LastName: %s  Number of Groups: %d", name, lastName, groups.size());
    }


    public String getName() {
        return name;
    }

    public String getlastName() {
        return lastName;
    }

    public void addGroup(StudentGroup studentGroup) {
        groups.add(studentGroup);
    }

    public void delGroup(StudentGroup studentGroup) {
        groups.remove(studentGroup);
    }

    public int getNumberOfGroups() {
        return groups.size();
    }

}
