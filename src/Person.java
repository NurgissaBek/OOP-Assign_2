public abstract class Person implements Payable, Comparable<Person>{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;


    public Person(){
        this.id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

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

    @Override
    public String toString() {
        return id+". "+name+" "+surname;
    }

    public String getposition(){
        return "Student";
    }

    @Override
    public int compareTo(Person othPerson) {
        return Double.compare(this.getPaymentAmount(), othPerson.getPaymentAmount());
    }
}
