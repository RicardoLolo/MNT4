public class Student extends Human {
    private double mathPoint;
    private double phyPoint;
    private double chePoint;
    private double AvgPoint;

    public Student(String name, int age, int ID, double mathPoint, double phePoint, double chyPoint,double AvgPoint) {
        super( name, age);
        this.mathPoint = mathPoint;
        this.phyPoint = phePoint;
        this.chePoint = chyPoint;
        this.AvgPoint = AvgPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public void setPhePoint(double phyPoint) {
        this.phyPoint = phyPoint;
    }

    public void setChyPoint(double chePoint) {
        this.chePoint = chePoint;
    }
    public double getAvgPoint() {
        return (mathPoint + phyPoint + chePoint) / 3;
    }

    public void setAvgPoint(double avgPoint) {
        AvgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mathPoint=" + mathPoint +
                ", phyPoint=" + phyPoint +
                ", chePoint=" + chePoint +
                ", AvgPoint=" + AvgPoint +
                '}';
    }
}
