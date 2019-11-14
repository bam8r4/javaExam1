public class Account {

    private int id = 0;
    private double balance = 100.00;
    private double interestRate = truncate();
    private java.util.Date dateCreated;

    //System.out.println(interestRate);



    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id) {
        this();
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return interestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.interestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (interestRate / 12);
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public static double truncate()
    {
        double number = Math.random() * 10;
        int integerPart = (int) number;
        double fractionalPart = number - integerPart;
        fractionalPart *= 100;
        int fractPart = (int) fractionalPart;
        fractionalPart = (double) (integerPart) + (double) (fractPart)/100;
        return fractionalPart;
    }


}

