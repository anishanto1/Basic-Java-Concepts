package ClassAndObjetcs;

public class Account {

	int acc_no;
	String name ;
	float amount;

	void insert(int a , String b , float c)
	{
		acc_no = a;
		name = b;
		amount = c;
	}
void deposit(float c)
{
	amount = amount + c;
	System.out.println(amount+ " is deposited");
}
void withdraw(float c)

{
if (amount<c)
{
System.out.println("Insufficient Balance");	
}
else {
	amount = amount -c;
System.out.println(c + " Withdrawn");
}}

void checkBalance()
{
System.out.println("Balance is:"+ amount);	
}

void display() {
	System.out.println(acc_no + "" + name + "" + amount);
}
}
