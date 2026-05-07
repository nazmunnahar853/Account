public class Account { 
 
    private double balance; 
    private int rateOfInterest; 
 
    public Account(double balance, int rateOfInterest) { 
        this.balance = balance; 
        this.rateOfInterest = rateOfInterest; 
    } 
 
     
    public double get_balance() { 
        return balance; 
    } 
 
    protected void setBalance(double balance) { 
        this.balance = balance; 
    } 
 
    protected int getRateOfInterest() { 
        return rateOfInterest; 
    } 
 
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
        } else { 
            System.out.println("Invalid deposit amount"); 
        } 
    } 
 
    public void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
        } else { 
            System.out.println("Invalid or insufficient balance"); 
        } 
    } 
 
    public void addInterest() { 
        balance += balance * rateOfInterest / 100; 
    } 
 
    public void get_details() { 
        System.out.println("Balance: " + balance); 
        System.out.println("Interest Rate: " + 
rateOfInterest + "%"); 
    } 
} 
 
 
class Savings extends Account { 
 
    public Savings(double balance, int rateOfInterest) { 
        super(balance, rateOfInterest); 
    } 
 
    @Override 
    public void withdraw(double amount) { 
        if (amount > 0 && amount <= get_balance()) { 
            setBalance(get_balance() - amount); 
        } else { 
            System.out.println("Savings: Insufficient balance"); 
        } 
    } 
 
    @Override 
    public void get_details() { 
        System.out.println("Account Type: Savings"); 
        super.get_details(); 
    } 
} 
 
 
class Credit extends Account { 
 
    public Credit(double balance, int rateOfInterest) { 
        super(balance, rateOfInterest); 
    } 
 
    @Override 
    public void withdraw(double amount) { 
        if (amount > 0) { 
            setBalance(get_balance() - amount); 
        } else { 
            System.out.println("Invalid withdrawal"); 
        } 
    } 
 
    @Override 
    public void get_details() { 
        System.out.println("Account Type: Credit"); 
        super.get_details(); 
    } 
} 
 
 
class BankAccount { 
    public static void main(String[] args) { 
 
        Savings s = new Savings(1000, 5); 
        s.deposit(500); 
        s.withdraw(300); 
        s.addInterest(); 
        s.get_details(); 
 
        System.out.println(); 
 
        Credit c = new Credit(0, 10); 
        c.deposit(1000); 
        c.withdraw(1200); 
        c.addInterest(); 
        c.get_details(); 
    }
}
