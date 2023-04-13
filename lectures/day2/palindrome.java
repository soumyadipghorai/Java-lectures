import java.io.*;
import java.util.*; 

class saveIronMan {
    public static boolean isPalindrome(String str){
        String rev = ""; 

        boolean ans = false; 

        for (int i = str.length() - 1; i>= 0; i--){
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            ans = true;
        }

        return ans;
    }
}

class UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter string : ");
        String str = sc.nextLine(); 
    }
}
