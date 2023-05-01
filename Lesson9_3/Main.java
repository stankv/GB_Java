/**
 * К коду с семинара добавить класс Teacher и возможность итерации и компорации для него. 
 * Так же для учебной группы добавить преподавателя(У группы может быть только один преподаватель, 
 * у преподавателя сколько угодно групп)
 */

package Lesson9_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Петров", 1, 5));
        students.add(new Student("Василий", "Соловьев", 1, 4));
        students.add(new Student("Михаил", "Марков", 2, 5));
        students.add(new Student("Екатерина", "Ветрова", 1, 3));
        students.add(new Student("Владислав", "Листьев", 2, 2));
        students.add(new Student("Мария", "Петрова", 1, 5));

        Collections.sort(students, new StudentComparator());
        
        StudentsGroupIterator group = new StudentsGroupIterator(students);
        while(group.hasNext()) {
            System.out.println(group.next());
        }

        System.out.println("-------------------------------------------------");


        List<Teacher> teachers = new ArrayList<>();
        
        Teacher teacher1 = new Teacher("Игорь", "Чесноков");
        Teacher teacher2 = new Teacher("Нина", "Иванова");
        Teacher teacher3 = new Teacher("Виктор", "Волков");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        StudentGroup group1 = new StudentGroup(1, teacher1);
        StudentGroup group2 = new StudentGroup(2, teacher1);
        StudentGroup group3 = new StudentGroup(3, teacher3);
        StudentGroup group4 = new StudentGroup(4, teacher2);
        StudentGroup group5 = new StudentGroup(5, teacher3);
        StudentGroup group6 = new StudentGroup(6, teacher3);

        teacher1.addGroup(group1);
        teacher1.addGroup(group2);
        teacher3.addGroup(group3);
        teacher2.addGroup(group4);
        teacher3.addGroup(group5);
        teacher3.addGroup(group6);


        Collections.sort(teachers, new TeacherComparator());

        TeacherIterator teacherIterator = new TeacherIterator(teachers);
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next().toString());
        }
    }
}
