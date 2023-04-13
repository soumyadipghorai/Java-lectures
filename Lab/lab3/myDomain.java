import java.security.DomainLoadStoreParameter;
import java.util.function.DoubleUnaryOperator;

class Entity{
    String name; 
    long entityID; 
    String[] menu; 
    int rooms; 

    Entity(String name, long entityID, int rooms){
        this.name = name; 
        this.entityID = entityID; 
        this.rooms = rooms;
    }

    Entity(String name, long entityID, String[] menu){
        this.name = name; 
        this.entityID = entityID; 
        this.menu = menu; 
    }

    public float createBill(int roomPrice, int days){
        int totalPrice = roomPrice * days; 
        float afterGST = (float) (totalPrice * 1.18);
        return afterGST;
    }

    public float createBill(int[] quantity, int[] price){
        int totalPrice = 0; 
        if (quantity.length != price.length){
            System.err.println("wrong length of input");
            return -1;
        }
        else{
            for (int i = 0; i < quantity.length; i++){
                totalPrice = totalPrice + (quantity[i] * price[i]);
            }
            
            float afterGST = (float) (totalPrice * 1.18);
            return afterGST;
        }
    } 
}

class Employee{
    String name; 
    long empID;
    String where;
    boolean jobType; // false --> part time | true --> full time || restaurant

    Employee(String name, long empID, String where){
        this.name = name; 
        this.empID = empID;
        this.where = where;  
    }

    Employee(String name, long empID, String where, boolean jobType){
        this.name = name; 
        this.empID = empID;
        this.where = where; 
        this.jobType = jobType;
    }

    public double calculateSalary(int Seniority, boolean jobType){
        int base;
        double bonus;
        if (jobType){
            bonus = 0.2;
        }
        else{
            bonus = 0.1;
        }
        if (Seniority == 1){
            base = 8000;
        }
        else if (Seniority == 2){
            base = 10000;
        }
        else {
            base = 12000;
        }
        return base * (1+bonus);
    }

    public int calculateSalary(int Seniority, int department){

        int base, additional;
        if (department == 1){
            base = 10000;
        }
        else if (department == 2){
            base = 12000;
        }
        else{
            base = 15000;
        }

        if (Seniority == 1){
            additional = 5000;
        }
        else if (Seniority == 2){
            additional = 8000;
        }
        else {
            additional = 10000;
        }

        return (base + additional);
    }
}

public class myDomain {
    public static void main(String[] args){
        Entity hotel = new Entity("hotel1", 101, 3);
        Employee hotelEmployee = new Employee("emp1", 1001, "hotel1");

        String[] menu = {"item1", "item2", "item3"};
        Entity restaurant = new Entity("restro1", 102, menu);
        Employee restaurantEmployee = new Employee("emp1", 1001, "restro1", true);

        System.out.println(hotel.createBill(1000, 2));
        System.out.println(hotelEmployee.calculateSalary(1, 2));

        int[] quantity = {1, 2, 3};
        int[] price = {100, 200, 100};
        System.out.println(restaurant.createBill(quantity, price));
        System.out.println(restaurantEmployee.calculateSalary(1, true));
    }
}