// in the classroom of 3mds on the teachers table there is a pile of cakes. One of the cake is poison, every turn we will take cake from this pile and eat them. leaving the last one to be the poison cake. whoever eats the cake will die. the poison cake is clearly marked so no guess work required. 
// write a logic to ensure that you're not killed 

// rules

// don't eat the last cake, try to make your opponent eat it 
// when its your turn to eat take 1 2 or 3 cakes --> same rule apply for your opponent also 
// you can't copy your opponent's prev moves --> like wise your opponent 
// if one of the player has no valid moves the player will skip the term then the other player will be forced to eat the last cake 
// the choice of going 1st is yours

// create a class called as players --> class has got one variable cakes. use  parameterized constructor to initialize the value.

// following are the two methods 
// --> boolean 1st move --> takes in an int value about the cake. Must return a true value if you're making the 1st move else a false if your opponent is moving 
// --> int move --> takes two int values. int cakes, int last --> the 1st parameter talks about the number of cakes left on the table, second param is your opponent takes in last move.

// the function should return 1, 2 or three depending upon how many cakes you want to take