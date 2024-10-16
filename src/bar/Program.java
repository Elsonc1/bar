package bar;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Sexo (F ou M): ");
        char sex = scanner.next().charAt(0);
        
        System.out.print("Quantidade de cervejas: ");
        int quantityBeer = scanner.nextInt();
        
        System.out.print("Quantidade de refrigerantes: ");
        int quantitySoda = scanner.nextInt();
        
        System.out.print("Quantidade de espetinhos: ");
        int quantitySteak = scanner.nextInt();
        
        Client client = new Client(sex, quantityBeer, quantitySoda, quantitySteak);

        Bill bill = new Bill();
        bill.generateReport(client);

        scanner.close();
	}
}