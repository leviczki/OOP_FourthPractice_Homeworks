
public class Main {
	public static void main(String[] args) {
		Book b = new Book();
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Kérem a könyv íróját: ");
		b.setBookAuthor(input.nextLine());
		
		System.out.print("Kérem a könyv címét: ");
		b.setBookTitle(input.nextLine());
		
		System.out.print("Kérem a könyv megjelenésének évét: ");
		b.setBookPublicationYear(input.nextInt());
		
		System.out.print("Kérem a könyv árát: ");
		b.setBookPrice(input.nextInt());
		
		input.close();
		
		System.out.println("A könyv tulajdonságai: "+b.bookInfo());
		
		
	}
}
