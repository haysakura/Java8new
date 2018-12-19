package defaultInterface;

public class InterfaceMain {

	public static void main(String[] args) {
		Formula f = new Formula() {
						
			@Override
			public double calculate(int a) {
				return sqrt(a);
			}
		};

		
		System.out.println(f.calculate(4));	
		
		
		Formula f2 = (a) -> sqrt(a*100);
		
	}

}
