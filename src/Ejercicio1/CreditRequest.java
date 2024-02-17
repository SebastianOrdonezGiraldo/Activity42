package Ejercicio1;


public class CreditRequest {
    private String client;
    private String creditType;
    private double amount;
    private int term;
    private double interestRate;

    public CreditRequest(String client, String creditType, double amount, int term, double interestRate) {
        this.client = client;
        this.creditType = "personal o hipotecario";
        this.amount = amount;
        this.term = term;
        this.interestRate = interestRate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}