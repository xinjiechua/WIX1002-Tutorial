package T10_Q2;

interface Interest{
    public double computeInterest();
}
class SavingAccount implements Interest {
    private double balance;

    public SavingAccount(double a) {
        balance = a;
    }

    public double computeInterest() {
        return balance * 0.005 / 12;
    }

    public void display() {
        System.out.println("Saving Account Balance: " + balance);
        System.out.println("Monthly Interest: " + computeInterest());
    }
}

class FixedAccount implements Interest{
    private double balance;
    public FixedAccount(double a){
        balance = a;
    }

    public double computeInterest() {
        return balance * 0.03 / 12;
    }

    public void display(){
        System.out.println("Fixed Account Balakce: " + balance);
        System.out.println("Monthly Interest: " + computeInterest());
    }
}

class Tester {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(10000);
        FixedAccount b = new FixedAccount(5000);
        a.display();
        b.display();
    }
}
