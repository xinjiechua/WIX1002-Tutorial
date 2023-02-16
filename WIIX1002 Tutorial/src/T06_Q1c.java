public class T06_Q1c {
    public static void main(String[] args) {
        System.out.println(combination(6,4));
    }
    static int combination(int n, int k){
        int c = fac(n)/(fac(k)*fac(n-k));
        return c;
    }

    static int fac(int a){
        int fac =1;
        for(int i=1; i<=a; i++)
            fac *=i;
        return fac;
    }
}

