public class SwapNumbers {

	    public static void main(String[] args) {

	        float first = 1.20f, second = 2.45f;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        first = first + second;
		second = first - second; 

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	    }
	}
