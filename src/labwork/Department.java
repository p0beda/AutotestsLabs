package labwork;

import java.util.ArrayList;

public class Department {

    public String name;
    public ArrayList<Instructor> instructorList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public Instructor addInstructor(String name, Department department) {
        System.out.println();
        Instructor instructor = new Instructor(name);
        instructorList.add(instructor);
        System.out.println("На " + department.name + " появился новый преподаватель: " + instructor.name);

        return instructor;
    }

    public void removeInstructor(Instructor instructor, Department department) {
        System.out.println();
        System.out.println("С " + department.name + " был уволен преподаватель " + instructor.name);
        instructorList.remove(instructor);
    }

    public void getInstructor(Instructor instructor) {
        System.out.println();
        System.out.println(instructor.name);
    }

    public void getAllInstructor(Department department) {
        System.out.println();
        int i = 0;
        System.out.println("Список преподавателей:");
        for (Instructor instructor : instructorList) {
            i++;
            System.out.println(i + ". " + instructor.name);
        }
        System.out.println("На " + department.name + " работает " + i + " преподавателей");
    }
}
