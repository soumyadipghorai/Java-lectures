// java prog which usese static variables and static method as you find applicable for the given problem 

// ?> Q1 : 
// there is an opinion poll taken in the class regarding the java course. there are upvotes and down votes to it. write a method pulseOfClass which returns back a string giving the mood of the class by understanding the upvote and downvote.

// ?> Q2 : 
// you are very passionate about java and add java to every string you encounter. write a method called javaLove which accepts a string and adds java at the poisition which the user wants to insert.

// ?> Q3 : 
// write a method called javaSucks which returns back a string BOOOOOOOOOOOOOM! if it encounters "java" in the input else YAAAAAAAAAAY!

public class day7 {
    static int upVote = 0;
    static int downVote = 0;

    static void pulseOfClass(int positiveVote, int negativeVote){
        upVote = upVote + positiveVote;
        downVote = downVote + negativeVote;

        if (upVote > downVote){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

    public void javaLove(String input, int index){
        if (index < 0 || index >= input.length()){
            System.out.println("Wrong index");
        }
        else {
            for (int i = 0; i < input.length(); i++){
                if (i == index){
                    String output = input.substring(0, i-1) + "Java" + input.substring(i, input.length());
                    System.out.println(output);
                    break;
                }
            }
        }
    }

    public void javaSucks(String input){
        String lowerCase = input.toLowerCase(); 
        boolean flag = true;
        for (int i = 0; i < lowerCase.length()-4; i++){
            if (lowerCase.substring(i, i+4) == "java"){
                System.out.println("BOOOOOOOOOOOOOOOM!");
                flag = false;
                break;
            }
        }
        
        if (flag){
            System.out.println("YAAAAAAAAAAAAAAAAAY!");
        }
    }

    public static void main(String[] args){
        
    }
}