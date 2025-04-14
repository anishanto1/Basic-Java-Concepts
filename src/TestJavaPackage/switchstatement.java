package TestJavaPackage;

public class switchstatement {

	public static void main(String[] args) {

		//Finding Month Nmaes 

		int month = 5;
		String monthString="";

		switch (month) {
		case 1:monthString=" 1 - janulary";
		break;
		
		case 2:monthString=" 2 - Feb";
		break;
		
		case 3:monthString=" 3 - March";
		break;
		
		case 4:monthString="4 - April";
		break;
		
		case 5:monthString= "5 -May";
		break;
	
		default:System.out.println("invalid month");
			break;
		}
		System.out.println(monthString);
	}

}
