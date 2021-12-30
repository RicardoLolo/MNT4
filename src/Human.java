public class Human {
    private String name;
    private int age;
    int Id;
    static int VALUE = 1111;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.Id = ++VALUE;
    }
    public Human(){
    }

    public Human(String name, int age, int id) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }
}
