package Ejercicio1;

class Person {
    private String name;
    private String identification;
    private String address;

    public Person(String name, String identification, String address) {
        this.name = name;
        this.identification = identification;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public String getAddress() {
        return address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
