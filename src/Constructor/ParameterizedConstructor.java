package Constructor;

public class ParameterizedConstructor {
	int Id ;
	String name ;

	ParameterizedConstructor(int a , String b) {
		Id = a;
		name = b;
	}
	public void display() {
		System.out.println(Id +""+ name);
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor P1 = new ParameterizedConstructor(1, "Test");
		P1.display();
		
		ParameterizedConstructor P2 = new ParameterizedConstructor(2, "Test");
		P2.display();

	}
}
