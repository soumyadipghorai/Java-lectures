// static variable will be same for all the object 

// static block executes 1st & only once --> when you load a class 
// you can't acces a non static variable in a static method 

class MyStatic{
    
    static{
        System.out.println("ghorAi");
        System.out.println("myself");
        System.out.println("BT");
    }

    static void multiply(int F[][], int M[][]){
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x; 
        F[0][1] = y; 
        F[1][0] = z; 
        F[1][1] = w; 
    }

    static void power(int F[][], int n){
        if (n == 0 || n == 1){
            return;
        }

        int M[][] = {{1, 1}, {1, 0}}; 

        power(F, n/2); 
        multiply(F, F);

        if (n%2 != 0){
            multiply(F, M);
        }
    }

    public int anotherWaysToClimb(int n){
        int F[][] = {{1, 1}, {1, 0}}; 

        if (n == 0){
            return 0;
        }

        power(F, n);
        return F[0][0];
    }

    public int WaysToClimb(int n){
        int a = 1, b = 1;
        for (int i = 0; i<n; i++){
            int temp = b; 
            b = a + b; 
            a = temp;
        }
        return a;
    }

    public boolean checkPrime(int n){
        for (int i = 2; i < n; i++){
            if (n%i == 0){
                return false;
            } 
        }
        return true;
    }

    public boolean UglyNumber(int number){
        if (number <= 1){
            return false;
        }
        else{
            for (int i = 2; i < number; i++){
                if (number%i == 0){
                    if (checkPrime(i) == true){
                        if ( i != 2 && i != 3 && i != 5){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}

public class codeRunner {
    public static void main(String[] args){
        MyStatic lab4 = new MyStatic(); 
        System.out.println(lab4.WaysToClimb(6));  
        System.out.println(lab4.anotherWaysToClimb(6));  
        System.out.println(lab4.UglyNumber(42));
    }
}