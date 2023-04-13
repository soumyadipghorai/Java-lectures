import java.lang.Math;

public class myDomain {

    public static String addSalt(){
        String output = "";
        String ch = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+=`~[];',./<>?:";
        int start = 0; 
        int end = ch.length()-1;
        for (int i = 0; i<10; i++){
            int num = (int) (Math.random()*(end - start +1)+start);
            output += ch.charAt(num);
        }
        return output;
    }

    public static void changeUserName(StringBuffer name){
        name.append(addSalt());
    }

    public static void changeHotelName(String name){
        name = name + addSalt();
    }
    public static void main(String[] args){
        StringBuffer userName = new StringBuffer("aman"); 

        changeUserName(userName);

        System.out.println(userName);

        String hotelName = "Thalaiva";

        changeHotelName(hotelName);
        System.out.println(hotelName);
    }
}
