package ClassAndObjetcs;

public class TestAccount {

	public static void main(String[] args) {

Account A1 = new Account();
A1.insert(1000, " Test ", 50000);
A1.display();
A1.deposit(50000);
A1.withdraw(50);
A1.checkBalance();




	}

}
