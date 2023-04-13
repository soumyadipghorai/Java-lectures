import java.util.*;
import javax.swing.table.AbstractTableModel;


class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        super(str);  
    }  
}  

abstract class Hotel{
    String hotelName; 
    long hotelId; 
    abstract boolean checkIn(); 
}

interface Drawable{
    abstract boolean checkIn(); 
}

class interfaceClass implements Drawable{
    public boolean checkIn(){
        return true;
    }
}

class holidayIn extends Hotel{
    int availableRooms; 
    String hotelAddress; 

    holidayIn(String hotelName,long hotelId, String hotelAddress, int availableRooms){
        super.hotelName = hotelName; 
        super.hotelId = hotelId; 
        this.hotelAddress = hotelAddress; 
        this.availableRooms = availableRooms; 
    }

    final String[] department = {"abcxjb", "sncdcn", "cjdcnj"}; 
}

public class ValidateCreditCard {

    // public boolean checkNumber(String cardNumber){

    //     // int cn = Integer.parseInt(cardNumber); 
    //     // int cn = Integer.toString(cardNumber); 
    //     if (cardNumber.length() >= 14 && cardNumber.length() <= 19){
    //         String newNum = ""; 
    //         for (int i = cardNumber.length()-2; i >= 0; i--){
    //             if (i%2 != 0){
    //                 int num = Integer.parseInt(cardNumber.charAt(i)) * 2;
    //                 if (num > 9 ){
    //                     int 
    //                 }
    //                 newNum += Integer.toString(num);
    //             }
    //         }
    //     }
    //     else{
    //         return false;
    //     }
    // }
    
    public static void main(String[] args){

        holidayIn h1 = new holidayIn(null, 0, null, 0); 
        h1.checkIn();
        // int n = 19282; 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        String num = Integer.toString(n); 
        String rev = "";
        for (int i = num.length()-1; i >= 0; i--){
            rev += num.charAt(i);
        }
        System.out.println(num);
        System.out.println(rev);

        ArrayList<String> cars = new ArrayList<String>(); 
        for (int i = 0; i < 5; i++){
            cars.add(Integer.toString(i));
        }
        System.out.println(cars);

        int range = sc.nextInt(); 
        // int range_ = Integer.parseInt(range);
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        for ( int i = 1; i < range; i++){
            if (i%2 == 0){
                nums.add(i);
            }
        }
        System.out.println(nums);

        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
