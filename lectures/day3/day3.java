import java.util.*;

public class day3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if (number < 0){
            System.out.println(number + " is negative");
        }

        else {
            System.out.print(number + " is positive");
        }

    }
}
