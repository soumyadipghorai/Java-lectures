import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. ODD REVERSE");
        System.out.println("2. HAPPY NUMBER");
        System.out.println("Enter Choice");
        int ch = Integer.parseInt(BR.readLine());
        
        switch (ch) {
            case 1: {
            System.out.println("Enter a String");
            String str = BR.readLine();
            new Thread(new Oddreversethread(str)).start();
            break;
        }
        
        case 2: {
            System.out.println("Enter a Number");
            int num = Integer.parseInt(BR.readLine()); 
            new Thread(new Happynumberthread(num)).start();
            break;
        }

        default:
            System.out.println("INVALID CHOICE!!!");
        }
    }
}