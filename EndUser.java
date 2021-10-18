package Inheritance;

public class EndUser {

	public static void displayInfo(PhonePayV001 objs[]) {
		System.out.println("Phonepay Information");
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].version);
			System.out.println(objs[i].releaseYear);
			System.out.println("_______________________");
		}

	}

	public static void main(String[] args) {
		PhonePayV001 py1 = new PhonePayV001("Phone pay", "V001", 2016);

		PhonePayV001 py2 = new PhonePayV001("Phone pay", "V001", 2017);
		PhonePayV001 py3 = new PhonePayV001("Phone pay", "V001", 2018);
		PhonePayV001 py4 = new PhonePayV001("Phone pay", "V001", 2019);

		PhonePayV001 objs[] = { py1, py2, py3 };
		EndUser.displayInfo(objs);

	}
}
