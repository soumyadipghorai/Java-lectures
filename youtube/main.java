import java.util.Arrays;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        System.out.println("Hello world"); // adds space after the print 

        // variables 

        // primitive types 
        // byte - 1 [-128 to 127]
        // short - 2 
        // int - 4
        // long - 8 
        // double - 8 
        // char - 2 
        // boolean - 1 

        int age = 22; 
        byte byte_age = 30; 
        int phone = 1892738231;
        long phone2 = 1892738238231L;
        float pi = 3.14F;
        char letter = '@'; 
        boolean isAdult = true; 

        
        //*  string 
        // no primitive 
        // java strings are immutable 
        String name = "Ghorai";
        String nickName = name; 
        System.out.println(name.length());

        // concatenate 
        String name1 = "soumyadip";
        String name2 = "ghorai";

        String name3 = name1 + " and " + name2;

        System.out.println(name3);

        System.out.println(name1.charAt(0));

        // replace 
        String name4 = name.replace("a", "X");
        System.out.println(name4);

        // substring 
        String sentence = "It's a good day"; 
        System.out.println(sentence.substring(7, 11));

        // * array 

        int[] marks = new int[3]; 
        // by default int values gets initialized by 0
        marks[0] = 97; 
        marks[1] = 98; 
        marks[2] = 95;

        boolean[] TF = new boolean[3];
        // by default boolean values gets initialized by false 
        System.out.println(marks); //prints random values 

        System.out.println(marks[0]); 
        System.out.println(TF[0]); 

        System.out.println(marks.length); // length is a property here 
        
        // sort 
        System.out.println(marks[0]);
        Arrays.sort(marks); 
        System.out.println(marks[0]);

        int[] marks1 = {97, 95, 100};

        int[][] finalMarks = {
            {97, 98, 95}, 
            {93, 92, 94}
        };

        System.out.println(finalMarks[1][0]);

        // casting 
        double price = 100.00; 
        double finalPrice = price + 18;

        // will give casting error without int 
        int p = 100;
        int fp = p + (int)18.99; 

        // * int >> double 
        // ! double >> int 

        System.out.println(finalPrice);
        System.out.println(fp);

        // final constant --> upper case 
        final float PI = 3.14F; 
        
        // operators 
        int a = 1; 
        int b  = 2; 

        int sum = a + b; 
        int diff = a - b; 
        int mult = a * b; 
        int div = a / b; 

        double da = 1; 
        double db = 2; 
        double ddiv = da/db;

        double mod = da%db;
        int modl = (int)mod;
        System.out.println(modl); 

        int numb = 1; 
        numb++;

        System.out.println(numb++);
        System.out.println(++numb);

        System.out.println(Math.max(5, 6));
        System.out.println((int)(Math.random()*100)); // random number b/w 0-1

        Scanner sc = new Scanner(System.in);
        System.out.println("Input age : "); 
        int yourAge = sc.nextInt();
        System.out.println(yourAge);
        String strName = sc.next(); // for string 
        System.out.println(strName);
        int nextint = sc.nextInt(); 
        System.out.println(nextint);
        String sentence2 = sc.nextLine(); 
        System.out.println(sentence2);
    }
}