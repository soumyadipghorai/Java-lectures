class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
// class that uses custom exception InvalidAgeException  

class newException extends Exception {
    public myException(String str){
        super(str);
    }
}

public class testaExceptioon{

    static void validate (int age) throws myException{
        if (age < 18){
            throw new myException("jcnjcjd");
        }
        else {
            System.out.println("jcndnc");
        }
    }

    public static void main(String args[]){
        try{
            validate(13);
        }
        catch(myException ex){
            System.err.println("jcnjdcj"+ex);
        }
    }
}

public class TestCustomException1  
{  
  
    // method to check the age  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new InvalidAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
            // calling the method   
            validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  