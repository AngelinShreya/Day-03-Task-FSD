package basic.code.java;

class BankAccount{
	String name;
	int balance;
	
	BankAccount(String name,int balance){
		this.name=name;
		this.balance=balance;
	}
	
	void Details() {
		System.out.println("Name:"+name);
		System.out.println("Current Balance:"+balance);
	}
	void Deposit(int amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposit money:"+amount);
			System.out.println("Total Amount After Deposit:"+balance);
		}
	}
	void Withdraw(int amount) {
		if(amount>0) {
			if(amount<balance) {
				balance -= amount;
				System.out.println("WithDraw Money:"+amount);
			}
		}
		System.out.println("Balance Amount After withdraw:"+balance);
		
	}
}




public class DepositWithdraw {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Shreya",1000);
		ba.Details();
		ba.Deposit(700);
		ba.Withdraw(1500);
	}
}
