public class Student extends Person{
    private double gpa;

    public Student(){
        super();
    }
    public Student(String name,String surname,double gpa){
        super(name,surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student" + super.toString()+" "+getPaymentAmount();
    }

    @Override
    public double getPaymentAmount() {
        return (gpa>2.67)?36660:0.0;
    }
}
