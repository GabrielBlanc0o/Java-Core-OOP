import java.util.Scanner;

public class BooksMenu {

	public static void main(String s[]) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		Book[] books = new Book[10];
		int bkIdx = 0;
		while(true) {   
			System.out.println("Press 1 to view books, 2 to add books, 3 to compare price, any other key to exit");
			String userAction = scanner.nextLine();
			if (userAction.equals("1")) {
				for(int i=0;i<books.length;i++) {
					if(books[i] != null) {
						System.out.println(books[i]);
					}
				}
			} else if (userAction.equals("2")) {
				if(bkIdx == 10) {
					System.out.println("10 books added already. Cannot add any more books!");
					continue;
				}
				System.out.println("Enter book title");
				String tmpTitle = scanner.nextLine();
				System.out.println("Enter book author");
				String tmpAuthor = scanner.nextLine();
				System.out.println("Enter book price");
				float tmpPrice = Float.parseFloat(scanner.nextLine());
				Book bkTmp = new Book();
				bkTmp.setTitle(tmpTitle);
				bkTmp.setAuthor(tmpAuthor);
				bkTmp.setPrice(tmpPrice);
				books[bkIdx++] = bkTmp;

			} else if (userAction.equals("3")) {
                if (bkIdx < 2) {
                    System.out.println("Minimo 2 libros para comparar precios.");    
                } else {
                    System.out.println("Ingrese el numero en orden del primer libro a comparar: ");
                    int numLibro1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el numero en orden del segundo libro a comparar: ");
                    int numLibro2 = scanner.nextInt();
                    scanner.nextLine();

                    String resultado = BookAccess.comparePrices(books[numLibro1 - 1], books[numLibro2 - 1]);
                    System.out.println(resultado);
                }
            } else {
				break;
                
			}
            
		}
        
	}
}
