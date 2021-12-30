import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class StudentManagement implements Manager {
    public static final String PATH_NAME = "src/Student.cvs";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public void displayStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public double checkAvgPoint(double AvgPoint) {
        return AvgPoint;
    }

    public Student create() {
        System.out.println(" Student List");
        int choice = scanner.nextInt();
        String name;
        int age;
        int Id;
        double mathPoint;
        double phyPoint;
        double chePoint;
        double AvgPoint;
        Student StudentSample = null;
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Student name: ");
                name = scanner.nextLine();
                System.out.print("Student age: ");
                age = scanner.nextInt();
                System.out.println("Student Id");
                Id = scanner.nextInt();
                System.out.println("Student mathPoint");
                mathPoint = scanner.nextInt();
                System.out.println("Student mathPoint");
                phyPoint = scanner.nextInt();
                System.out.println("Student mathPoint");
                chePoint = scanner.nextInt();
                System.out.print("Average Score: ");
                AvgPoint = scanner.nextDouble();
                StudentSample = new Student(name, age, Id, mathPoint, phyPoint, chePoint, AvgPoint);
                break;
        }
        return StudentSample;
    }

    @Override
    public void addStudent() {
        students.add(create());
    }

    @Override
    public void findStudentById(int id) {
        boolean check = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
    }

    @Override
    public void deleteStudent(int id) {
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (Student.get(i).getIdStudent() == id) {
                Student.remove(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
        display();
    }

    @Override
    public void editStudentByID(int id) {
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (Student.get(i).getIdStudent() == id) {
                Student.set(i, create());
                Student.get(i).setId(id);
                check = true;
                Student.id--;
                break;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }

//    public void addStudent() {
//        System.out.println("Input name: ");
//        String name = scanner.nextLine();
//        System.out.println("Input age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Input mathPoint: ");
//        double mathPoint = scanner.nextDouble();
//        System.out.println("Input phyPoint: ");
//        double phyPoint = scanner.nextDouble();
//        System.out.println("Input chePoint: ");
//        double chePoint = scanner.nextDouble();
//        System.out.println("Input average: ");
//        double AvgPoint = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Input your choice: ");
//        if ((age, AvgPoint) && !getGenderByChoice(gender).equals("")) {
//            students.add(new Student(name, age, getStudentById(Id), AvgPoint));
//            writeFile(students, PATH_NAME);
//            System.out.println("Add student have name = " + name + " successfully!");
//        } else {
//            System.out.println("Data entry error, please check again!!!");
//        }
//    }
    }
}