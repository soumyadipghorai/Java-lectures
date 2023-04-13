import java.util.*;

// you can't imagine the world without alphabet, you are fan of CEO 
// input 1-8 
// 1, 2, 3, 4 = g, o, l, e
// 5 --> upcase the letter before it 
// 6--> add a point at end 
// 7 --> change case of 1st letter 
// 8 --> reverse the string 

// 12213467 --> Google.

public class day6 {

    public static void main(String[] args){

        String output = ""; 

        boolean addPoint = false, changeFirst = false, reverse = false;

        String input; 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter number : ");

        input = sc.nextLine(); 

        for (int i =0; i < input.length(); i++){
            if (input.charAt(i) == '1'){
                output  = output + 'g'; 
            }
            else if (input.charAt(i) == '2'){
                output = output + 'o';
            }
            else if (input.charAt(i) == '3'){
                output = output + 'l';
            }

            else if (input.charAt(i) == '4'){
                output = output + 'e';
            }
            else if (input.charAt(i) == '5'){
                String lastChar = output.substring((output.length() - 1), output.length()).toUpperCase();
                output = output.substring(0, output.length() - 1) + lastChar;
            }
            else if (input.charAt(i) == '6'){
                addPoint = true;
            }
            else if (input.charAt(i) == '7'){
                changeFirst = true;
            }
            else if (input.charAt(i) == '8'){
                reverse = true;
            }
            else {
                System.out.print("Wrong Input");
            }
        }

        if (addPoint){
            output  = output + '.';
        }

        if (changeFirst){
            String firstChar = output.substring(0, 1).toUpperCase();
            output = firstChar + output.substring(1, output.length());
        }

        if (reverse){
            String newOutput = ""; 
            for (int i = output.length()-1; i >=0; i--){
                newOutput = newOutput + output.charAt(i);
            }
            System.out.println(newOutput);
        }
        else {
            System.out.println(output);
        }
    }
}
