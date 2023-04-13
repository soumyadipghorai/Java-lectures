import java.util.Scanner;

public class DNA {

    public static boolean checkInput(String DNA){
        for (int i = 0; i<DNA.length(); i++){
            if (DNA.charAt(i) != 'A' && DNA.charAt(i) != 'T' && DNA.charAt(i) != 'C' && DNA.charAt(i) != 'G'){
                return false;
            }
        }
        return true;
    }
 
    public static String reverse_compliment(String DNA){
        String output = "";
        if (checkInput(DNA) == true){
            for (int i = DNA.length() - 1; i >= 0; i--){
                if (DNA.charAt(i) == 'A'){
                    output += 'T';
                }
                else if (DNA.charAt(i) == 'T'){
                    output += 'A';
                }
                else if (DNA.charAt(i) == 'C'){
                    output += 'G';
                }
                else{
                    output += 'C';
                }
            }
            return output; 
        }
        else{
            return "Invalid string";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String DNA = sc.nextLine(); 
        int num = sc.nextInt();
        switch (num){
            case 1 : 
                System.out.println("invalid case");
                break;
            case 2 : 
                System.out.println(reverse_compliment(DNA));
                break;
        }
    }
}
