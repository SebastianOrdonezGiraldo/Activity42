package Ejercicio1;

import javax.swing.*;

public class CreditMain {
    public static void main(String[] args) {
    String clientName = JOptionPane.showInputDialog("Enter the customer's name:");
    String clientId = JOptionPane.showInputDialog("Enter the customer ID:");
    String clientAddress = JOptionPane.showInputDialog("Enter the customer's address:");
    String creditScoreClient = JOptionPane.showInputDialog("Enter the customer's credit history:");
    double clientIncome = Double.parseDouble(JOptionPane.showInputDialog("Enter the customer's income:"));

    Client client = new Client(clientName,clientId,clientAddress,creditScoreClient,clientIncome);
    String creditType = JOptionPane.showInputDialog("Enter the type of credit (personal / mortgage):");
    double creditAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of the credit:"));
    int creditTerm = Integer.parseInt(JOptionPane.showInputDialog("Enter the credit term in months:"));
    double creditRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest rate of the loan:"));

    CreditRequest creditRequest = new CreditRequest(client,creditType,creditAmount,creditTerm,creditRate);
    Credit credit;
    if (creditType.equalsIgnoreCase("mortgage")){
        String propertyAddress = JOptionPane.showInputDialog("Enter the property address:");
        double propertyValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the property:"));
        Property property = new Property(propertyAddress,propertyValue);
        credit = new MortagageCredit(creditRequest,property);
    } else {
        credit = new Credit(creditRequest);
    }

    JOptionPane.showMessageDialog(null,"Credit Information:\n" +
            "Clint: " + client.getName() + "\n" +
            "Credit type: " + creditType + "\n" +
            "Amount: " + creditAmount + "\n" +
            "Term: " + creditTerm + "\n" +
            "Interest rate: " + creditRate + "%\n" +
            "Status: " + credit.getStatus());


    }
}
