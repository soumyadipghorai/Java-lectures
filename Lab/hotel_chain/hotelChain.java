import java.util.*;

class Hotel{

    String hotelName;
    long hotelId;
    String hotelAddress;
    int availableRooms;

    Hotel(String hotelName, long hotelId, String hotelAddress, int availableRooms){
        this.hotelName = hotelName;
        this.hotelId = hotelId;
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

}

class Employee{

    String empName;
    long empId; 
    char empGender; 

    Employee(String empName, long empId, char empGender){
        this.empName = empName; 
        this.empId = empId; 
        this.empGender = empGender; 
    }

    public void workSchedule(){
        if (empId%2 == 0){
            System.out.println("Monday Wednesday Friday");
        }
        else {
            System.out.println("Tuesday Thursday Saturday");
        }
    }
}

class Room{

    int roomNumber; 
    String roomType;

    Room(int roomNumber, String roomType){
        this.roomNumber = roomNumber; 
        this.roomType = roomType;
    }

    public int price(){
        if (roomType == "Single"){
            return 800;
        }
        else if (roomType == "double"){
            return 1000;
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
        Hotel h1 = new Hotel("hotel1", 1223122, "kolkata", 10); 
        h1.checkIn();

        Employee e1 = new Employee("ram", 1000000001, 'M');
        Employee e2 = new Employee("rima", 1000000002, 'F');
        e1.workSchedule();
        e2.workSchedule();

        Room r1 = new Room(101, "Double"); 
        r1.price();

        Customer c1 = new Customer("ghorai", 1000012, "ghorai.soumyadi33@gmail.com", 873823712);
        c1.luckyDraw();

        Bill b1 = new Bill(37846371, 1001, "bank transfer");
        b1.totalAmount();
     
        Feedback f1 = new Feedback(2.3, "bad hotel", "h1");
        f1.reviewChecker();
    }
}
