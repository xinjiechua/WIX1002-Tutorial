package T10_Q1;
abstract class DiscountPolicy{
    public abstract double computeDiscount(int a, double b);
}

class BulkDiscount extends DiscountPolicy{
    private int minimum;
    private double rate;

    public BulkDiscount(int m, double n){
        rate = n;
        minimum = m;
    }
    public double computeDiscount(int a,double b){
        if(a>minimum)
            return b*rate/100;
        else
            return 0;
    }
}

class OtherDiscount extends DiscountPolicy{
    public double computeDiscount(int a, double b){
        if(a>8)
            return 0.3*b;
        else if(a>5)
            return 0.2*b;
        else if(a>2)
            return 0.1*b;
        else
            return 0;
    }
}

class combineDiscount extends DiscountPolicy{
    private DiscountPolicy p1;
    private DiscountPolicy p2;


    combineDiscount(DiscountPolicy a, DiscountPolicy b){
        p1 = a; p2 = b;
    }

    public double computeDiscount(int a, double b){
        if(p1.computeDiscount(a,b)> p2.computeDiscount(a,b))
            return p1.computeDiscount(a,b);
        else
            return p2.computeDiscount(a,b);
    }
}

public class Tester {
    public static void main(String[] args) {
        double cost = 35.5;
        int cnt = 5;
        BulkDiscount a = new BulkDiscount(3,20);
        OtherDiscount b = new OtherDiscount();
        System.out.println("Item cost: " + cost);
        System.out.println("Quantity: " + cnt);
        System.out.println("Bulk discount: " + a.computeDiscount(cnt,cost));
        System.out.println("Other discount: " + b.computeDiscount(cnt,cost));

        combineDiscount c = new combineDiscount(a,b);

        System.out.println("Combine discount: " + c.computeDiscount(cnt,cost));
    }
}
