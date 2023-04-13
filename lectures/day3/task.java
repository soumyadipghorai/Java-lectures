// write a program which will print factorial of a number, n fibonacci number in a series, checks wheather the number is prime or not.
// use switch statement 
// accept input from the user 
import java.util.*;
public class task {
    public static void main(String[] args){
        int number; 

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println(number);

        int inputCase;

        System.out.print("Enter case : "); 
        Scanner newSc = new Scanner(System.in); 
        inputCase = newSc.nextInt(); 
        System.out.println("Case number : "+inputCase);
        
        switch(inputCase){
            case 1 :

                long factorial = 1; 
                for (int i = 1; i <= number; i++){
                    factorial = factorial * i;
                }
                System.out.println("factorial of the number --> " + factorial);
                break;

            case 2 :

                boolean flag = true;
                for (int i = 2; i<= number - 1; i++){
                    if (number%i == 0){
                        System.out.println("number is not prime");
                        flag = false;
                        break;
                    }
                }

                if (flag == true){
                    System.out.println("number is a prime");
                }
                break;
            
            case 3 :
                int n1 = 0, n2 = 1, n3 = 0;
                System.out.print(n1+" "+ n2);
                while (number > 2){
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.print(" "+n3);
                    number -= 1;
                }
                break;
        }
    }
}
