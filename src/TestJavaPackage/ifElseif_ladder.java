package TestJavaPackage;

public class ifElseif_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Scenario 1 : The Book Taken in Hand is " The Miracle Morning" 
		// Scenario 2 : And Checking if any other books are suitable to read now 

		String Book = " The Miracle Morning";

		if (Book == " Eat that Frog" ) {
			System.out.println("Not suitable to Read now");
		}
		else if (Book == " The power of Compounding ") {
			System.out.println("Not suitable to Read now");
		}	
		else if (Book == " Atomic Habits") {
			System.out.println("Not suitable to Read now");	
		}
		else {
			System.out.println(Book);
		}
	}
}

