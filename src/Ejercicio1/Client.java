package Ejercicio1;


    class Client extends Person {
        private String creditHistory;
        private double income;

        public Client(String name, String identification, String address, String creditHistory, double income) {
            super(name, identification, address);
            this.creditHistory = creditHistory;
            this.income = income;
        }

        public String getCreditHistory() {
            return creditHistory;
        }

        public double getIncome() {
            return income;
        }

        public void setCreditHistory(String creditHistory) {
            this.creditHistory = creditHistory;
        }

        public void setIncome(double income) {
            this.income = income;
        }
        }

