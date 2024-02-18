package Ejercicio1;


public class MortagageCredit extends Credit {
    private Property property;

    public MortagageCredit(CreditRequest creditRequest, Property property) {
        super(creditRequest);
        this.property = property;
    }




    public Property obtenerPropiedad(){
        return property;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
