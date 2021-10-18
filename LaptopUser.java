package Inheritance;

public class LaptopUser {
	public static void displayInfo(Laptop objs[]) {
		System.out.println(" Information of laptop");
		for (int i = 0; i < objs.length; i++) {
			if (objs[i].ramSize >= 4) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].color);
			System.out.println(objs[i].ramSize);
			System.out.println(objs[i].cost);

			System.out.println("_______________________");
		}
	}
	}

	public static void main(String[] args) {
		Laptop LP1=new Laptop("Lenovo","Silver",8,40000);
		Laptop LP2=new Laptop("Dell","Pink",3,40000);
		Laptop LP3=new Laptop("HP","Black",8,40000);
		Laptop LP4=new Laptop("Apple","Silver",64,100000);
		Laptop LP5=new Laptop("Acer","Whiter",24,40000);
		

		Laptop objs[] = {LP1,LP2,LP3,LP4,LP5 };
		LaptopUser.displayInfo(objs);
		

	}

}
