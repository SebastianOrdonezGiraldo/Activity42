package Ejercicio1;

public class Credit {
    private CreditRequest creditRequest;
    private String status;

    public Credit(CreditRequest creditRequest) {
        this.creditRequest = creditRequest;
        this.status = "pending";
    }

    public Credit() {

    }

    public CreditRequest getCreditRequest() {
        return creditRequest;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        status = "approved";
    }

    public void reject() {
        status = "rejected";
    }


    public void setCreditRequest(CreditRequest creditRequest) {
        this.creditRequest = creditRequest;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

