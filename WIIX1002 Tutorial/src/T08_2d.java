public class T08_2d {
    public static void main(String[]args){
        T08_2d obj = new T08_2d();
        obj.display(4567);
    }
    public int digitMultiplication(int num){
        int result = 1;
        while(num>0){
            int temp = num%10;
            result *= temp;
            num /= 10;
        }
        return result;
    }
    public void display(int num){
        System.out.println(digitMultiplication(num));
    }


}
