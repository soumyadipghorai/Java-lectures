import ValidExp.*;

public class caller{
    public static void main(String args[]){
        Boolean g= ValidExp.validate.phonenumber("21833243");
        Boolean f= ValidExp.validate.phonenumber("2183324312");
        Boolean k= ValidExp.validate.email("riyagmail.com");
        System.out.println("phoneNumber: "+g+"\neamil: "+k +"\nphoneNumber: "+f);
    }
}