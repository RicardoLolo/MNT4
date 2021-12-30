import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement manager = new StudentManagement() {};
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add new Student");
            System.out.println("2. Display all Student");
            System.out.println("3. Find Student via ID");
            System.out.println("4. Delete Student via ID");
            System.out.println("5. Edit Student via ID");
            System.out.println("6. Arrange list via averagePoint");
            System.out.println("7. ");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    StudentManagement.();
                    break;
                case 2:
                    StudentManagement.display();
                    break;
                case 3:
                    System.out.println("Input ID: ");
                    int idFind = sc.nextInt();
                    StudentManagement.findHuman(idFind);
                    break;
                case 4:
                    System.out.println("Input ID: ");
                    int idDelete = sc.nextInt();
                    StudentManagement.(idDelete);
                    break;
                case 5:
                    System.out.println("Input ID: ");
                    int idEdit = sc.nextInt();
                    StudentManagement.editStudentByID(idEdit);
                    break;
                case 6:
                    System.out.println("Arrange list by Point: ");
                    StudentManagement.arrangeListByAveragePoint();
                    break;
                case 7:
                    System.out.println();
                    break;
                default:
                    System.out.println("Wrong choice !!!");
                    break;

            }
        } while (choice != 0);


    }
}