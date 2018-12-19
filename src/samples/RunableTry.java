package samples;

public class RunableTry {
	
	public static void main(String[] args)
	{
		// before Java 8 no Lambda
		new Thread(
				new Runnable()
		{
			@Override
			public void run() {
				System.out.println("Befor Java8, too much code for too little to do.");				
			}
			
		}
				).start();
			
		// Java 8 lambda
		new Thread(
				() -> System.out.println("In Java8, Lambda expression rocks.")
				).start();
		
	}

}
