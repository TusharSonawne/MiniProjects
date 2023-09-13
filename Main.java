package com.library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Library");

		Book[] b = new Book[3];

		for (int i = 0; i < b.length; i++) {
			b[i] = new Book(null, null, 0, 0);
		}

		int i = 0;
		// int j = 0;
		int option;

		do {
			System.out.println("\n--------MENU--------");
			System.out.println("1.Add book");
			System.out.println("2.Search book");
			System.out.println("3.Remove book");
			System.out.println("4.Display Library");
			System.out.println("5.Exit\n--------------------");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {

			case 1:
				try {

					if (b[i].getName() == null) {

						System.out.println("Enter title");
						sc.nextLine();
						String title = sc.nextLine();
						System.out.println("Enter author");
						String author = sc.nextLine();
						System.out.println("Enter price");
						int price = sc.nextInt();
						System.out.println("Enter quantity");
						int quantity = sc.nextInt();

						b[i] = new Book(title, author, price, quantity);
						System.out.println("Your book is added");

					}
				} catch (Exception e) {
					System.out.println("Library is full!");
				}
				i++;

				break;
			case 2:
				System.out.println("Enter book title to search:");
				sc.nextLine();
				String name = sc.nextLine();

				boolean found = false;
				int j;
				for (j = 0; j < b.length; j++) {

					if (name.equalsIgnoreCase(b[j].getName())) {
						found = true;
						break;
					}
				}

				if (found == true) {
					System.out.println("\nRequired book details -");
					b[j].display();
				} else
					System.out.println("\n" + name + " not found");

				break;
			case 3:
				System.out.println("Enter book title to remove:");
				sc.nextLine();
				String nameR = sc.nextLine();

				boolean foundR = false;
				int k;
				for (k = 0; k < b.length; k++) {

					if (nameR.equalsIgnoreCase(b[k].getName())) {
						foundR = true;
						break;
					}
				}

				if (foundR == true) {
					b[k].removeData();
					System.out.println("\nBook removed successfully...");

				} else
					System.out.println("\n" + nameR + " not found");

				break;
			case 4:
				for (int a = 0; a < b.length; a++) {
					b[a].display();
				}
				break;
			case 5:
				System.out.println("Thank you! Visit Again!");
				System.exit(0);
				break;
			}

		} while (option != 5);
	}

}
