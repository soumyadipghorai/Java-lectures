// write a class called myException which has two methods --> 
// 1. count the letters which takes in a string --> returns number of english alphabets in the given string
    // ensure that only letters are counted and user defined exception if raised if a non english letter is encountered 
// 2. taken in an arithmetic expression and returns the result 
    // use an user defined exception to check weather the given expression is a valid arithmetic expression or not 

// create a driver class called myExceptionImplimentation and call the two methods in it 

class InvalidExpression extends Exception  
{  
    public InvalidExpression (String str)  
    {  
        super(str);  
    }  
}  

public class myException{

    public static int countLetter(String phrase){

        int counter = 0; 

        for (int i = 0; i < phrase.length(); i++){
            try{
                if ((phrase.charAt(i) >= 'a' && phrase.charAt(i) <= 'z') || (phrase.charAt(i) >= 'A' && phrase.charAt(i) <= 'Z')){
                    counter += 1;
                }
            }
            
            catch (InvalidExpression ex){
                throw new InvalidExpression("String contains something otherthan alphabet");
            }
        }

        return -1;
    }
}