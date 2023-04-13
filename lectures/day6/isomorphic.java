import java.util.*; 

public class isomorphic {
    
    public static void main(String[] args){

        String input1, input2; 

        Scanner sc = new Scanner(System.in);
        input1 = sc.nextLine(); 
        input2 = sc.nextLine(); 
        
        int arr1[] = {}, arr2[] = {}; 
        for (int i = 0; i < input1.length(); i++){
            int counter = 0; 
            for (int j = i+1; j < input1.length(); j++){
                if (input1.charAt(j) == input1.charAt(i)){
                    counter++;
                }
            }
            arr1[arr1.length] = counter;
        }

        for (int i = 0; i < input1.length(); i++){
            int counter = 0; 
            for (int j = i+1; j < input1.length(); j++){
                if (input2.charAt(j) == input2.charAt(i)){
                    counter++;
                }
            }
            arr2[arr2.length] = counter;
        }

        if (arr1 == arr2){
            System.out.println("Isomorphic");
        }
        else{
            System.out.println("Not Isomorphic");
        }
    }
}
