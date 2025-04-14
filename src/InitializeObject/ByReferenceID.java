package InitializeObject;

//Initializing means adding values to the Object

public class ByReferenceID {

	String Name;
	int Id;

	public static void main(String[] args) {

		ByReferenceID Reference = new ByReferenceID();
		ByReferenceID Reference1 = new ByReferenceID();


		Reference.Name = "Test";
		Reference.Id = 10;
		Reference1.Name = "Test 1";
		Reference1.Id = 1;
		System.out.println(Reference.Name + Reference.Id);
		System.out.println(Reference1.Name + Reference1.Id);

		

	}

}
