public class Happynumber {
    
    public int sumDigitSquare(int n) {
    
        int sq = 0;
        while (n != 0) {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }
    
    public String happyAlgorithm(int n) {

        while (true) {
            if (n == 1)
                return "Happy";    
            if (n == 4)
                return "Sad";
            n = sumDigitSquare(n);
        }
    }
}