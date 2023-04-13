// create a class called sandwitch with private data members which is of types string, main ingredient bread and double price. write the following getter and setter methods. 
// 1. set main ingredient, get main ingredient
// 2. set bread, get bread
// 3. set price, get price 

// create an interface called fastfood, indentify appropiate methods, sandwitch implement fastfood. create a driver class to show the working of the class and the interface 

class sandwitch{
    private String mainIngredient; 
    private double price; 
    private String bread;

    public void setMainIngredient(String mainIngredient){
        this.mainIngredient = mainIngredient;
    }

    public String getMainIngredient(){
        return mainIngredient;
    }

    public void setBread(String bread){
        this.bread = bread;
    }

    public String getBread(){
        return bread;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void customize(String[] ingredients, double price, int size, boolean type, String drink){
        
    } 
}


public class breakFast{
    public static void main(String[] args){

    }
}