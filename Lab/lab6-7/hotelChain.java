import java.util.*;

// An instance of an abstract class can not be created.
// Constructors are allowed.
abstract class Hotel{
    String hotelName;
    long hotelId;
    abstract boolean checkIn();
}

class holidayIn extends Hotel{
    int availableRooms;
    String hotelAddress; 

    holidayIn(String hotelName, long hotelId, String hotelAddress, int availableRooms){
        super.hotelName = hotelName;
        super.hotelId = hotelId;
        this.hotelAddress = hotelAddress;
        this.availableRooms = availableRooms;
    }
     
    public boolean checkIn(){
        if (this.availableRooms > 0){
            System.out.println("Rooms available"); 
            return true;
        }
        else {
            System.out.println("Try another hotel");
            return false;
        }
    }

    public boolean checkStar(){
        char vowel[] = {'a', 'e', 'i', 'o', 'u'}; 

        char firstLetter = hotelName.charAt(0); 
        for (int i = 0; i<vowel.length; i++){
            if (firstLetter == vowel[i]){
                return true;
            }
        }
        return false;
    }
}

class Employee{

    String empName;
    long empId; 
    char empGender; 
    int dept;

    final String[] department = {"reception", "chef", "roomservice"};

    Employee(String empName, long empId, char empGender, int dept){
        this.empName = empName; 
        this.empId = empId; 
        this.empGender = empGender; 
        this.dept = dept;
    }

    public void workSchedule(){
        if (empId%2 == 0){
            System.out.println("Monday Wednesday Friday");
        }
        else {
            System.out.println("Tuesday Thursday Saturday");
        }
    }

    public void salary(){
        if ((dept > department.length) || (dept < 0)){
            System.out.println("invalid department");
        }
        else{
            System.out.println("your dept is "+ department[dept].toUpperCase()+ " your salary is "+ ((dept+1)*1000));
        }
    }
}

class Room extends holidayIn{

    int roomNumber; 
    String roomType;

    Room(String hotelName, long hotelId, String hotelAddress, int availableRooms, int roomNumber, String roomType){
        super(hotelName, hotelId, hotelAddress, availableRooms);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
       
    }

    public int price(){

        int hotelPrice = 0;

        if (checkStar()){
            hotelPrice = 1000;
        }
        if (roomType == "Single"){
            return hotelPrice+800;
        }
        else if (roomType == "Double"){
            return hotelPrice+1000;
        }
        else {
            return -1;
        }
    }
}

class Customer{

    String customerName; 
    long customerId; 
    String emailId; 
    long phoneNumber;

    Customer(String customerName, long customerId, String emailId, long phoneNumber){
        this.customerName = customerName; 
        this.customerId = customerId; 
        this.emailId = emailId; 
        this.phoneNumber = phoneNumber;
    }

    public void luckyDraw(){
        if (customerId%3 == 0 & customerId%11 == 0){
            System.out.println("you got 10% discount");
        }
        else if (customerId%2 == 0 & customerId%3 == 0){
            System.out.println("you got 20% discount");
        }
        else {
            System.out.println("Better luck next time");
        }
    }
}

class Bill {

    long transactionId; 
    long amount;
    String paymentMethod; 

    Bill(long transactionId, long amount, String paymentMethod){
        this.transactionId = transactionId; 
        this.amount = amount; 
        this.paymentMethod = paymentMethod; 
    }

    public double discount(){
        if (transactionId%101 == 0){
            return 0.1*amount;
        }
        else{
            return 0.05*amount;
        }
    }

    public double calculateGST(){
        if (amount > 1000){
            return amount*0.18;
        }
        else {
            return 0;
        }
    }

    public double totalAmount(){
        return amount + this.calculateGST() + this.discount();
    }
}


class Feedback{

    double rating; 
    String comment; 
    String hotelName;

    Feedback(double rating, String comment, String hotelName){
        this.rating = rating; 
        this.comment = comment;
        this.hotelName = hotelName;
    }

    public void reviewChecker(){
        if (rating < 2.5){
            System.out.println("You gave bad review to "+this.hotelName);
        }
        else {
            System.out.println("Thanks for good review");
        }
    }
}

public class hotelChain {

    public static void main(String args[]){
        holidayIn h1 = new holidayIn("hotel1", 1223122, "kolkata", 10); 
        h1.checkIn();
        System.out.println("++++++++++++++++++++++++++++");

        Employee e1 = new Employee("ram", 1000000001, 'M', 0);
        Employee e2 = new Employee("rima", 1000000002, 'F', 1);

        Employee e3 = new Employee("ram", 1000000001, 'M', -1);
        e1.workSchedule();
        e2.workSchedule();
        System.out.println("++++++++++++++++++++++++++++");

        e1.salary();
        e2.salary();
        e3.salary();
        System.out.println("++++++++++++++++++++++++++++");

        Room r1 = new Room("hotel1", 1223122, "kolkata", 10, 101, "Double"); 
        System.out.println("price of the room : "+r1.price());
        System.out.println("++++++++++++++++++++++++++++");

        Room r2 = new Room("arms", 1223122, "kolkata", 10, 101, "Double"); 
        System.out.println("price of the room : "+r2.price());
        System.out.println("++++++++++++++++++++++++++++");

        Customer c1 = new Customer("ghorai", 1000012, "ghorai.soumyadi33@gmail.com", 873823712);
        c1.luckyDraw();
        System.out.println("++++++++++++++++++++++++++++");

        Bill b1 = new Bill(37846371, 1001, "bank transfer");
        b1.totalAmount();
        System.out.println("++++++++++++++++++++++++++++");

        Feedback f1 = new Feedback(2.3, "bad hotel", "h1");
        f1.reviewChecker();
    }
}
