import java.util.*;

public class romanNumber{
    public static void main(String[] args){
        String number; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Roman number : "); 
        number = sc.nextLine();
        number = number.toLowerCase();
        // System.out.print(number);
        boolean flag = true;
        if (number.length() >= 1 && number.length() <= 15){
            for (int i = 0; i < number.length(); i++){
                if (number.charAt(i) != 'x' || number.charAt(i) != 'V' || number.charAt(i) != 'l' || number.charAt(i) != 'c' || number.charAt(i) != 'd' || number.charAt(i) != 'm'){
                    System.out.print("Invalid input");
                    flag = false; 
                    break; 
                }
            }

            if (flag){
                
            }
        }
        else{
            System.out.print("wrong input");
        }

    }
}