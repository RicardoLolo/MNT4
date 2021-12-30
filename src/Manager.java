public interface Manager {
    void displayStudent();
    void addStudent();
    void findStudent(int id);

    void findStudentById(int id);

    void deleteStudent(int id);
    void editStudentByID(int id);
    static void arrangeListByAveragePoint();

    void display();
}
