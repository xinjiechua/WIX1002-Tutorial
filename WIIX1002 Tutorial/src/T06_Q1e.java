public class T06_Q1e {
    public static void main(String[] args) {
        int[]ans = count("Hello fdf 3432");
        System.out.println("Sum of letter = " + ans[0]);
        System.out.println("Sum of digit = " + ans[1]);
    }

    static int [] count (String word){
        int [] count = new int[2];
        for(int i=0; i<word.length(); i++){
            if(Character.isLetter(word.charAt(i)))
                count[0]++;
            if(Character.isDigit(word.charAt(i)))
                count[1]++;
        }
        return count;
    }
}

