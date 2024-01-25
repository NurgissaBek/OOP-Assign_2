//abstract class which represent
public abstract class Person implements Payable, Comparable<Person>{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;


    //Just default constructor
    public Person(){
        //increase the id value for each new person, to make id unique
        this.id = id_gen++;
    }
    //parameterized constructor with name and surname
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
//creating of getter and setter for name and surname
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Just default position which will return Student
    public String getposition(){
        return "Student";
    }
    @Override
    public String toString() {
        //to represent the person as a string object
        return id+". "+name+" "+surname;
    }

    @Override
    public int compareTo(Person othPerson) {
        //compareTo method for sorting based on payment amount
        return Double.compare(this.getPaymentAmount(), othPerson.getPaymentAmount());
    }
}
