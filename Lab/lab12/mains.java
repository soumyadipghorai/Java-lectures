import java.util.*;

public class mains{
    public static String input;
    static LinkedList<String> word = new LinkedList<String>();
    static boolean valid_move;
    static Scanner sc=new Scanner(System.in);


    static void restart_game(){
        System.out.println("\nRestarting Game.......");
        word.clear();
        start_game();
    }

    static boolean repeat(String curr_word){
        if(word.contains(curr_word)){
            return true;
        }
        else{
            return false;
        }        
    }

    static boolean valid_check(String curr_word){
        int size= word.size();
        if(size!=0){
            String previous = word.get(size-1);
            char last= previous.charAt(previous.length()-1);
            char first = curr_word.charAt(0);
            if(first==last){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return true;
        }
    }

    static void play(String current_word){
        boolean validity = valid_check(current_word);
        boolean repeated = repeat(current_word);
        if(validity == false || repeated == true ){
            System.out.println("\n!!!!! Game Over !!!!!\n");
            System.out.print("Do you want to restart the game ?\nPress[y/n] : ");
            String ch = sc.nextLine();
            if (ch.equals("y")){
                restart_game();
            }
            else{
                System.exit(0);
            }
        }
        else {
            word.add(current_word);
            start_game();
        }
    }

    static void print_index(){
        sc.nextLine();
        System.out.println("Enter word to check");
        String read_word=sc.nextLine();
        if(word.contains(read_word)){
            System.out.print(word.indexOf(read_word));
            start_game();
        }
        else{
            System.out.print("Word not Present");
            start_game();
        }
    }


    static String take_input(){
        sc.nextLine();
        System.out.print("\nEnter Word : ");
        String str=sc.nextLine();
        return str;
    }

    static void start_game(){
        // String input="";
        System.out.println("\n1) Add new word\n2) Print list\n3) Check Index");
        int choice = sc.nextInt();

        if(choice==1){
           input=take_input();
        }
        else if(choice == 2){
            System.out.println(word);
            start_game();
        }
        else if(choice==3){
            print_index();
        }
        else{
            System.out.print("Wrong choice !!!!");
            start_game();
        }
        play(input);
    }

    public static void main(String args[]){
        System.out.print("\n##### WELCOME TO SHIRITORI #####\n");
        start_game();
    }
}