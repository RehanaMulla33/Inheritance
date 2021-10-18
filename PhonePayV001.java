package Inheritance;

public class PhonePayV001 {
	String name;
	String version;
	int releaseYear;

	public PhonePayV001(String name, String version, int releaseYear) {
		this.name = name;
		this.version = version;
		this.releaseYear = releaseYear;
	}

	public void logIn() {
		System.out.println("Login successful");
	}

	public void logOut() {
		System.out.println("Logout successful");
	}

	public void scanAndPay() {
		System.out.println("payment successful");
	}

	public void moneyTransfer() {
		System.out.println("Transer successful");
	}

	public void electricity() {
		System.out.println("Electricity payment successful");
	}

	public void displayInfo() {
		System.out.println("");
	}

}
