public class Happynumberthread implements Runnable {
	
	private int input;
	private Happynumber happynumber;
	
	public Happynumberthread(int input) {
		this.input = input;
		this.happynumber = new Happynumber();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            System.out.println("Delaying Happy Number Operation by 2 seconds");
            Thread.sleep(2000);
            System.out.println(happynumber.happyAlgorithm(input));
        } 
		catch (InterruptedException ie) {
            System.out.println("Child thread interrupted! " + ie);
        }
	}
}