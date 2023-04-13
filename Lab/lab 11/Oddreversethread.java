public class Oddreversethread implements Runnable {
	
	private String input;
	private OddReverse oddreverse;
  
	public Oddreversethread(String input) {
		this.input = input;
		this.oddreverse = new OddReverse();
	}
  
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Delaying Odd Reverse Operation by 4 seconds");
			Thread.sleep(4000);
			System.out.println(oddreverse.reverseOdd(this.input));
		} 
		
		catch (InterruptedException ie) {
			System.out.println("Child thread interrupted! " + ie);
		}
	}
}