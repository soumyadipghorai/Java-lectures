// create an abstract class called AmIPrime which has the following methods abstract boolean isPrime which takes in an integer value and reurns boolean and another public in getValue takes in a string returns back removes all spaces special char and returns back the int value. 
// public string isSentencePrime takes in a string value will use the above two methods and returns back a string not prime if the sentence generates a composite number else says prime if its a prime number. 

abstract class amIPrime{

    public boolean isPrime(int n){
        for (int i = 2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true; 
    }

    public int getValue(String sentence){

        String newSentence = sentence.replaceAll(" ", ""); 
        newSentence = newSentence.replaceAll("*", ""); 
        newSentence = newSentence.replaceAll("(", ""); 

        return 0;
    }

}


public class abstractMethod{
    public static void main(String[] args){

    }
}