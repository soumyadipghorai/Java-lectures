// ? void display --> int string 
    // --> if int == 1 --> print vowel in String 
    // else --> print whole string 

// ? display --> string char 
    // check if char is at begin and end --> print special 
    // else --> no special 

// ? display --> int char 
    // ch == c --> cube root of int 
    // else --> sq root of int 

// ? display --> int 
    // check if pronic or not 

class Overloading{

    public void display(int n, String str){
        if (n == 1){
            String strLower = str.toLowerCase();
            for (int i = 0; i<strLower.length(); i++){
                if (strLower.charAt(i) == 'a' || strLower.charAt(i) == 'e' || strLower.charAt(i) == 'i' || strLower.charAt(i) == 'o' || strLower.charAt(i) == 'u'){
                    System.out.print(str.charAt(i)+" ");
                }
            }
            System.out.println();
        }
        else{
            System.err.println(str);
        }
    }

    public void display(String str, char ch){
        int lastIndex = str.length() - 1;
        if (str.charAt(0) == ch && str.charAt(lastIndex) == ch){
            System.err.println("Special String");
        }
        else{
            System.out.println("Not a special string");
        }
    }

    public void display(int n, char ch){
        if (ch == 'c'){
            System.out.println(Math.cbrt((double) n));
        }

        else{
            System.err.println(Math.sqrt((double) n));
        }
    }

    public void display(int n){
        boolean flag = true;

        int itr = 2; 

        while (itr <= n){
            if (itr * (itr-1) == n){
                System.out.print("Pronic");
                System.out.print(itr+" "+(itr-1));
                flag = false; 
                break;
            }
            itr++;
        }

        if (flag){
            System.out.println("Not pronic");
        }
    }
}

public class polymorph {
    public static void main(String[] args){
        Overloading ol = new Overloading();
        ol.display("abba", 'a');
        ol.display("abbak", 'a');
        ol.display(1, "jukajcojehxib");
        ol.display(0, "abcjacbdjc");
        ol.display(3, 'c');
        ol.display(4, 'd');
        ol.display(19);
    }
}

