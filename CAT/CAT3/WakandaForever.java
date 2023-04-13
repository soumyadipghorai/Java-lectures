import java.util.*; 

class warrior{
    int level; 
    String rank; 
    int experience; 

    warrior(int level, String rank, int experience){
        this.level = level; -
        this.rank = rank; 
        this.experience = experience;
    }

    public void display(){
        System.out.println("level -->" + this.level +" exp -->" + this.experience + " rank -->" + this.rank);
    }

    public String battle(int competitorExp, int competitorLevel, String competitorRank){

        int currLevel = this.level; 
        int currExp = this.experience; 

        String[] rankList = {"EasyMeat","Apprentince","Fighter","Warrior","Master","Sage","Elite", "Conqueror" ,"Champion" ,"Grandmaster", "Illustrious"}; 

        if (competitorLevel< 1 || competitorLevel > 100){
            return "Invalid Level";
        }

        String warriorRankNum, CompRankNum;
        for (int i = 0; i<rankList.length; i++){
            if (rankList[i].equals(this.rank)){
                warriorRankNum = i;
            }
            if (rankList[i].equals(competitorRank)){
                CompRankNum = i;
            }
        }

        if (warriorRankNum < CompRankNum){
            if (this.level + 5 <= competitorLevel){
                return "You are vanquished";
            }
        }

        if (this.level == competitorLevel){
            System.out.println("current exp "+this.experience);
            this.experience = this.experience + 10;
            System.out.println("same level -->" + this.experience);
            return "Good Battle";
        }

        if (this.level > competitorLevel){
            System.out.println("current exp "+this.experience);
            // this.experience = this.experience + 10;
            System.out.println("lower level -->" + this.experience);

            if (this.level >= competitorLevel+2){
                return "Easy Win";
            }
            else{
                return "Lower level Battle";
            }
        }

        if (this.level < competitorLevel){
            System.out.println("current exp "+this.experience);
            int diff = competitorLevel - this.level; 
            this.experience = this.experience + (20*(diff * diff));
            System.out.println("higher level -->" + this.experience);
            
            if (this.level + 1 == competitorLevel){
                return "Fiery Battle";
            }
            else{
                return "Higher Level Battle";
            }
        }

        // reset level and experience 
        if (this.experience > 10000){
            this.experience = 10000;
        }
        if (this.level > 100){
            this.level = 100;
        }

        return "Well played";
    }
}

// class competitor{
//     int level; 
//     String rank; 
//     int experience; 

//     competitor(int level, String rank, int experience){
//         this.level = level; 
//         this.rank = rank; 
//         this.experience = experience;
//     }
// }

public class WakandaForever{
    
    // -----------data validation functions----------- 
    public static boolean rankChecker(String rank){
        String[] rankList = {"EasyMeat","Apprentince","Fighter","Warrior","Master","Sage","Elite", "Conqueror" ,"Champion" ,"Grandmaster", "Illustrious"}; 

        for (int i = 0; i < rankList.length; i++){
            // System.out.println(rankList[i]+ " "+ rank);
            if (rankList[i].equals(rank)){
                return true; 
            }
        }
        return false; 
    }

    public static boolean levelChecker(int level){
        if (level < 1 || level > 100){
            return false;
        } 
        return true;
    }

    public static boolean expChecker(int exp){
        if (exp < 100 || exp > 10000){
            return false;
        } 
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        // define num of warrior you want
        System.out.println("Enter num of warriors ");
        int n = sc.nextInt(); 

        warrior[] obj = new warrior[n]; 

        // ------------- warrior input --------------
        int counter = 0;
        while (true){

            System.out.println("Enter level");
            int level = sc.nextInt();

            if (levelChecker(level) == false){
                System.out.println("wrong level.");
                System.out.println("Enter level");
                level = sc.nextInt();
            }

            sc.nextLine();
            System.out.println("Enter rank");
            String rank = sc.nextLine();

           if (rankChecker(rank) == false){
                System.out.println("wrong rank.");
                System.out.println("Enter rank");
                rank = sc.nextLine();
           }

            System.out.println("Enter experience");
            int exp = sc.nextInt();

            if (expChecker(exp) == false){
                System.out.println("wrong exp.");
                System.out.println("Enter exp");
                exp = sc.nextInt();
            } 
            
            // adding obj ti array 
            obj[counter] = new warrior(level, rank, exp);
            System.out.println("product obj 1" + counter); 
            obj[counter].display();
            counter = counter + 1; 
            if (counter == n){
                break;
            }
        }

        System.out.println("Enter competitor details "); 
        System.out.println("enter level");
        int competitorLevel = sc.nextInt(); 
        System.out.println("enter rank");
        sc.nextLine();
        String competitorRank = sc.nextLine(); 
        System.out.println("enter exp");
        int competitorExp = sc.nextInt(); 

        System.out.println("With whom you want to fight"); 
        int warriorNum = sc.nextInt(); 

        System.out.println(obj[warriorNum].battle(competitorExp, competitorLevel, competitorRank)); 
    }
}