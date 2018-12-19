package lambda;

public class FunctionInterface {

	public static void main(String[] args) {
		Convert<String, Integer> convert = (from) -> Integer.valueOf(from);
		
		Integer converted = convert.convert("123");
		System.out.println(converted);

	}

}
