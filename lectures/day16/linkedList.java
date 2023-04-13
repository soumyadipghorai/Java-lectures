// create a classs called 3MDS and has variable nick name, fav book, array of hobbies(3)
// accept input from the user regarding his or her fav book, nick name and print the corresponding matching object of 3MDS.
// use appropriate class in the collection frame work and implement the scenario 

// create a linkedList takes in elements of student class and perform basic manipulations onn the list 

// name regnum likeJava 
import java.util.*; 

class student{
    String name; 
    int regNum; 
    boolean likeJava; 

    student(String name, int regNum, boolean likeJava){
        this.name = name; 
        this.regNum = regNum; 
        this.likeJava = likeJava;
    }
}

public class linkedList{
    public static void main(String args[]){
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add(new student('kcmd', 1, true));
        l1.add(new student('kdcjnd', 2, true));
        l1.add(new student('kancb', 3, false));
        l1.add(1, new student('kancb', 3, false));
        l1.remove(1);
    }
}