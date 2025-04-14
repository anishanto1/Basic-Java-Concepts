package InitializeObject;

public class ByMethod2 {

	public static void main(String[] args) {

		ByMethod1 M1 = new ByMethod1();
		ByMethod1 M2 = new ByMethod1();
		
		M1.method(5, "Test");
		M2.method(5, "Test");
		
		M1.Disply();
		M2.Disply();
		
	}

}
