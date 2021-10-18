package Inheritance;

public class Laptop {
	String name;
	String color;
	int ramSize;
	int cost;

	public Laptop(String name, String color, int ramSize,int cost) {
		this.name = name;
		this.color = color;
		this.ramSize = ramSize;
		this.cost=cost;
	}

	public void logIn() {
		System.out.println("Login successful");
	}

	public void logOut() {
		System.out.println("Logout successful");
	}

	public void playVideo() {
		System.out.println("Video playing successful");
	}

	public void camera() {
		System.out.println("You have saved memory");
	}


}
