//class represent a student  and extend Person
public class Student extends Person{
    private double gpa;

    //Default constructor
    public Student(){
        super();
    }
    //Parameterized constructor with variables name,surname,gpa
    public Student(String name,String surname,double gpa){
        super(name,surname);
        setGpa(gpa);
    }
    //getter and setter for gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Overridind toString method,include payment amount
    @Override
    public String toString() {
        return "Student" + super.toString()+" "+getPaymentAmount();
    }

    //implementation getPaymentAmount method for student
    @Override
    public double getPaymentAmount() {
        return (gpa>2.67)?36660:0.0;//if student has a good gpa he will payable, otherwise 0.0
    }
}
