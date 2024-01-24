public class Employee extends Person{
    private double salary;
    private String position;
    public Employee(){
        super();
    }
    public Employee(String name,String surname,String position,double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getposition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return getposition()+" "+ super.toString()+" "+getPaymentAmount();
    }
    @Override
    public double getPaymentAmount(){
        return salary;
    }
}
