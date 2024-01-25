public class Employee extends Person{
    private double salary;
    private String position;
    //default constructor
    public Employee(){
        super();
    }
    //Parameterized constructor with name,surname ,position,salary
    public Employee(String name,String surname,String position,double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);
    }

    //getter and setter for salary and position
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getposition() {
        return position;
    }

    @Override
    public String toString() {
        return getposition()+" "+ super.toString()+" "+getPaymentAmount();
    }
    @Override//implementation of get payment amount method for employes
    public double getPaymentAmount(){
        return salary;
    }
}
