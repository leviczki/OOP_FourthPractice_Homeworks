package Homeworks;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Person ember = new Person();
		System.out.print("Kérem a nevét: ");
		ember.nev = input.nextLine();
		System.out.print("Kérem a magasságát (méterben): ");
		ember.magassag = input.nextDouble();
		System.out.print("Kérem a tömegét: ");
		ember.tomeg = input.nextInt();
		
		System.out.println("\n"+ember.getInfo());
		
		input.close();
	}
}
