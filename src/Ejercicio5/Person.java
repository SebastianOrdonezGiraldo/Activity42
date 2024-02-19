package Ejercicio5;

public class Person {
    protected String name;
    protected int id;
    private final String contactInformation;


    public Person(String name, int id, String contactInformation) {
        this.name = name;
        this.id = id;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", contactInformation='" + contactInformation + '\'';
    }
}



