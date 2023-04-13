class Overloading{

    public boolean validate(String message){
        String numberOnly= message.replaceAll("[^0-9]", "");
        int totalSum = 0; 
        for (int i =0; i<numberOnly.length(); i++){
            int num = numberOnly.charAt(i) - '0';
            totalSum = totalSum + num;
        }
        
        int charLength = message.length() - numberOnly.length();
        if (totalSum == charLength){
            return true;
        }
        return false;
    }

    public void validate(String[] fruitList){
        for (int i =0; i<fruitList.length; i++){
            if (fruitList[i].length() > 6){
                if (fruitList[i].substring(0, 6).equals("rotten")){
                    System.out.println(fruitList[i].substring(6, fruitList[i].length()) + " if rotten");
                }
            }
        }
    }

    public int validate(int lowerLimit, int upperLimit, String lotteryTicket){
        String[] tokens = lotteryTicket.split(",");
        
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        for (int i =0; i<numbers.length; i++){
            if (numbers[i] > upperLimit || numbers[i] < lowerLimit){
                return 0; 
            }
        }
        return 1;
    }
}
public class MyOverloadingClass{
    public static void main(String[] args){
        Overloading ol = new Overloading();
        System.out.println(ol.validate("1q2n1x"));
        String[] fruitList = {"apple","rottenBanana","apple"};
        ol.validate(fruitList);
        System.out.println(ol.validate(1, 90, "1,2,3,4,5"));
    }
}