import java.util.*;

public class MyCmdPg {

    public static int ClimbStairs(int num){
        int a = 1, b = 1;
        for (int i = 0; i < num; i++){
            int temp = b; 
            b = a + b; 
            a = temp; 
        }
        return a;
    }

    public static String MagicSigil(String sent){
        return sent; 
    }

 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        String sentence = sc.nextLine();
        int n = sc.nextInt();
        int num = sc.nextInt(); 

        switch (num){
            case 1 : 
                System.out.println(ClimbStairs(n));
                break;
            case 2 : 
                System.out.println(MagicSigil(sentence));
                break;
        }
    }
}
