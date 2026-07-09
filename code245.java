class Bank{
    private String name;
    private int id;
    private int balance;

    Bank(String name, int id){
        this.name=name;
        this.id=id;

    }
    public void deposit(int amount){
        System.out.println(amount + " is credited in your account Mr "+this.name);
        balance=amount+balance;
    }
    public void withdraw(int amount){
        if(amount>balance) System.out.println("Insufficient balance");
        else{
            balance=balance-amount;
            System.out.println(amount+ " is with draw and "+ balance +" is left in our account  Mr "+this.name);
        }

    
    }
    public void transfer(Bank b,int amount){
        b.deposit(amount);
        withdraw(amount);
    }
    public double checkbalance(){
            return (double)balance;
        }
}

public class code245 {
    public static void main(String[] args) {
        Bank p1= new Bank("surya",01);
        System.out.println(p1.checkbalance());
        p1.deposit(1000);
        System.out.println(p1.checkbalance());
        p1.withdraw(120);
    p1.withdraw(500);
     
Bank p2 = new Bank("RAj", 02);
p1.transfer(p2, 100);
System.out.println(p2.checkbalance());
System.out.println(p1.checkbalance()); }
    
}
