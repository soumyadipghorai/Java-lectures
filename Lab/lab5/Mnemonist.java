import java.util.Scanner;

public class Mnemonist {

    public static String getNumber(String numberString){
        String output = "";
        for (int i = 0; i<numberString.length(); i++){
            if (Character.isDigit(numberString.charAt(i)) == false){
                if (numberString.charAt(i) == 'A' || numberString.charAt(i) == 'B'  || numberString.charAt(i) == 'C' ){
                    output += '2';
                }
                else if (numberString.charAt(i) == 'D' || numberString.charAt(i) == 'E'  || numberString.charAt(i) == 'F' ){
                    output += '3';
                }
                else if (numberString.charAt(i) == 'G' || numberString.charAt(i) == 'H'  || numberString.charAt(i) == 'I' ){
                    output += '4';
                }
                else if (numberString.charAt(i) == 'J' || numberString.charAt(i) == 'K'  || numberString.charAt(i) == 'L' ){
                    output += '5';
                }
                else if (numberString.charAt(i) == 'M' || numberString.charAt(i) == 'N'  || numberString.charAt(i) == 'O' ){
                    output += '6';
                }
                else if (numberString.charAt(i) == 'P' || numberString.charAt(i) == 'Q'  || numberString.charAt(i) == 'R' || numberString.charAt(i) == 'S' ){
                    output += '7';
                }
                else if (numberString.charAt(i) == 'T' || numberString.charAt(i) == 'U'  || numberString.charAt(i) == 'V' ){
                    output += '8';
                }
                else if (numberString.charAt(i) == 'W' || numberString.charAt(i) == 'X'  || numberString.charAt(i) == 'Y' || numberString.charAt(i) == 'Z' ){
                    output += '9';
                }
                else if (numberString.charAt(i) == '-'){
                    output += '-';
                }
                else{
                    return "bad input";
                }
            }
            else{
                output += numberString.charAt(i);
            }
        }
        return output;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        String number = sc.nextLine();

        if (number.length() == 12){
            System.out.println(getNumber(number));
        }
        else{
            System.out.println("wrong input");
        }

    }
}

// 653-TRY-THIS
// 435-224-7613