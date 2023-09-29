package Restaurant_Management_System;

import java.util.Scanner;
import java.util.ArrayList;

//abstraction
interface Regi {
	 void signup();

	 void login();
}

//Inheritance
class Registration implements Regi {
	String fname;
	String lname;
	String gender;
	private long contact;
	String email = "admin";
	String password = "admin";

	public long getContact() {
		System.out.println();
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	

	public void signup() // Method Overriding
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***********************************************");
	    System.out.println("*           Welcome to Sign Up Page           *");
	    System.out.println("*                                             *");
	    System.out.println("*    Please fill out the following details:   *");
	    System.out.println("*                                             *");
	    System.out.println("***********************************************");
	    System.out.println();
		System.out.println("Enter the first name");
		fname = sc.nextLine();
		System.out.println("Enter the last name");
		lname = sc.nextLine();
		System.out.println("Enter the gender");
		gender = sc.nextLine();
		Contact();
		System.out.println("Enter the Email");
		email = sc.nextLine();
		System.out.println("Enter the Password");
		password = sc.nextLine();
		login();
	}

	
	public void login() // Method Overriding
	{
		System.out.println();
        System.out.println("***********************************************");
        System.out.println("*             Welcome to Login Page           *");
        System.out.println("*                                             *");
        System.out.println("*        Please enter your login details:     *");
        System.out.println("*                                             *");
        System.out.println("***********************************************");
        System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = sc.nextLine();
		System.out.println("Enter the password");
		String pass = sc.nextLine();
		if (email.equals(this.email) && pass.equals(this.password)) {
			System.out.println("Successful");
		} else {
			System.out.println("Enter the valid Password");
			
			login();
		}
	}

	public void Contact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		long contact = sc.nextLong();
		if (contact > 999999999l && contact < 10000000000L) {
			this.contact = contact;
		} else {
			System.out.println("Please enter valid 10 digit number");
			Contact();
		}
	}
	
	
}



class Menu {
	static double bill;
	static ArrayList a = new ArrayList();
		

	@Override
	public String toString() {
		System.out.println("Do you want to order more?");
		System.out.println("Enter 1 to order more");
		System.out.println("Enter 2 for bill");

		return "";
	}

	public void mainmenu() {
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("*            Welcome to Main Menu             *");
		System.out.println("*                                             *");
		System.out.println("*    Please select an option from the menu:   *");
		System.out.println("*                                             *");
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("Press 1 for Starters");
		System.out.println("Press 2 for Main Course");
		System.out.println("Press 3 for Desserts");
		System.out.println("Press 4 for Drinks");
		System.out.println("Press 5 to display bill");
		System.out.println("Press 6 for Exit");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("===============================================");
			System.out.println("|            You have selected Starters        |");
			System.out.println("===============================================");
			System.out.println();

			System.out.println("Press 1 for Veg Starters");
			System.out.println("Press 2 for Non Veg Starters");
			Starters s = new Starters();
			n = sc.nextInt();
			switch (n) {
			case 1:
				s.vegStarters();        
				break;
			case 2:
				s.nonVegStarters();
				break;
			default:
				mainmenu();
				break;
			}
			break;
		case 2:
			System.out.println("===============================================");
			System.out.println("|          You have selected Main Course       |");
			System.out.println("===============================================");
			System.out.println();


			System.out.println("Press 1 for Veg Main Course");
			System.out.println("Press 2 for Non Veg Main Course");
			MainCourse mc = new MainCourse();
			n = sc.nextInt();
			switch (n) {
			case 1:
				mc.vegMainCourse();
				break;
			case 2:
				mc.nonVegMainCourse();
				break;
			default:
				mainmenu();
				break;
			}

			break;
		case 3:
			System.out.println("===============================================");
			System.out.println("|           You have selected Desserts         |");
			System.out.println("===============================================");
			System.out.println();


			System.out.println("Press 1 for Ice Cream");
			System.out.println("Press 2 for Cakes");
			System.out.println("Press 3 for Pastries");
			System.out.println("Press 4 for Gulab Jamun");
			System.out.println("Press 5 for Sweets");
			System.out.println("Press 6 to go back Main Menu");
			Desserts d = new Desserts();
			n = sc.nextInt();
			switch (n) {
			case 1:
				d.iceCream();
				break;
			case 2:
				d.cakes();
				break;
			case 3:
				d.pastries();
				break;
			case 4:
				d.gulabJamun();
				break;
			case 5:                                
				d.sweets();
				break;
			case 6:
				mainmenu();
				break;
			
			default:
				mainmenu();
				break;
			}
			
			break;
		case 4:
			System.out.println("===============================================");
			System.out.println("|            You have selected Drinks          |");
			System.out.println("===============================================");
			System.out.println();

			System.out.println("Press 1 for Soft Drinks");
			System.out.println("Press 2 for Fresh Juices");
			System.out.println("Press 3 for Milkshakes");
			System.out.println("Press 4 to go back to Main Manu");
		
			Drinks d1 = new Drinks();
			n = sc.nextInt();
			switch (n) {
			case 1:
				d1.softDrinks();
				break;
			case 2:
				d1.freshJuices();
				break;
			case 3:
				d1.milkshakes();
				break;
			case 4:
				mainmenu();
				break;
			default:
				mainmenu();
				break;
			}

			break;
		case 5:
			System.out.println("===============================================");
			System.out.println("|     You have selected to Display Bill       |");
			System.out.println("===============================================");

			bill();
			break;
		case 6:
			System.exit(0);
		
		default:
			System.out.println("Please enter valid input");
			mainmenu();
			break;

		}
	}

	public void bill() {
		cart();

		System.out.println("Your total bill is ");
		double cgst = bill * 0.09;
		double sgst = bill * 0.09;
		System.out.println("cgst " + cgst);
		System.out.println("sgst " + sgst);
		System.out.println("Total Amount is: " + (bill + cgst + sgst));

		
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Press 1 Back to Main Menu");
		System.out.println("Press 2 for exit");
		int v= s.nextInt();
		switch (v) {
		case 1:
			mainmenu();
			break;
		case 2:
			System.out.println("thank you");
			System.exit(0);
		    break;
		}
		
		
		//mainmenu();
	}

	public void cart() {
		if (a.size() == 0) {
			System.out.println("Your order list is empty please order");
			mainmenu();
		}
		System.out.println("Your order is");
	
		for (Object o : a) {
			System.out.println(o);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to remove?");
		System.out.println("Press 1 to remove");
		System.out.println("Press 2 to continue");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Enter the number which you want to remove");
			n = sc.nextInt();
			a.remove(n - 1);
			cart();
		} else if (n == 2) {
			return;
		}
	}
}

class Starters extends Menu {
	
	 Menu m = new Menu(); 
	

	public void vegStarters() {
		System.out.println("Press 1 for Panner Tikka");
		System.out.println("Press 2 for panner Chilly");
		System.out.println("Press 3 for Aloo Tikki");
		System.out.println("Press 4 for Veg Spring Rolls");
		System.out.println("Press 5 for Mushroom Manchurian");
		System.out.println("Press 6 for Mixed Vegetable Satay");
		System.out.println("Press 7 for Stuffed Paneer Rolls");
		System.out.println("Press 8 for Palak Chaat");
		System.out.println("Press 9 to go back to main menu");
		Scanner sc = new Scanner(System.in);
//		Menu m = new Menu(); 
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Panner Tikka for Rs 200");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
			int q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 200);
				a.add("Panner Tikka Half");
			} else if (q == 2) {
				bill = bill + 200;
				a.add("Panner Tikka Full");
			} else {
				System.out.println("Invalid Input");
				vegStarters();
			}
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		case 2:
			System.out.println("You have selected Panner Chilly for Rs 200");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 200);
			a.add("Panner Chilly " + q);
			
			System.out.println(m);//to string
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				//bill = bill + 200;
				bill();
			}
			
			break;
		case 3:
			System.out.println("You have selected Aloo Tikki for Rs 140");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 140);
			a.add("Aloo Tikki " + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		case 4:
			System.out.println("You have selected Veg Spring Rolls for Rs 160");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 160);
			a.add("Veg Spring Rolls" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
       
		case 5:
			System.out.println("You have selected Mushroom Manchurian for Rs 170");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 170);
			a.add("Mushroom Manchurian" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 6:
			System.out.println("You have selected Mixed Vegetable Satay for Rs 190");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 190);
			a.add("Mixed Vegetable Satay" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 7:
			System.out.println("You have selected Stuffed Paneer Rolls for Rs 190");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 190);
			a.add("Mixed Vegetable Satay" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 8:
			System.out.println("You have selected Palak Chaat for Rs 150");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 150);
			a.add("Palak Chaat" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
				
		case 9:
			mainmenu();
			break;
			
		default:
			System.out.println("Please enter valid input");
			vegStarters();
			break;
		}
	}

	public void nonVegStarters() {
		System.out.println("Press 1 for Chicken Tikka");
		System.out.println("Press 2 for Butter Chicken Wings");
		System.out.println("Press 3 for Egg Pakora");
		System.out.println("Press 4 for Chilli Chicken");
		System.out.println("Press 5 for Chicken 65 ");
		System.out.println("Press 6 for Andhra Chicken Fry");
		System.out.println("Press 7 for Malabar Fried Fish");
		System.out.println("Press 8 for Lobster Tandoori");
		System.out.println("Press 9 to go back to main menu");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Chicken Tikka for Rs 280");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
			int q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 280);
				a.add("Chickan Tikka Half");
			} else if (q == 2) {
				bill = bill + 280;
				a.add("Chickan Tikka Full");
			} else {
				System.out.println("Invalid Input");
				nonVegStarters();
			}
			System.out.println(m);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 2:
			System.out.println("You have selected Butter Chicken Wings for Rs 230");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 230);
			a.add("Butter Chicken Wings" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Butter Egg Pakora for Rs 180");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 180);
			a.add("Egg Pakora" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Chilli Chicken for Rs 220");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 220);
			a.add("Chilli Chicken" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 5:
			System.out.println("You have selected Chicken 65 for Rs 230");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 230);
			a.add("Chicken 65" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 6:
			System.out.println("You have selected Andhra Chicken Fry for Rs 240");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 240);
			a.add("Andhra Chicken Fry" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 7:
			System.out.println("You have selected Malabar Fried Fish for Rs 260");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 260);
			a.add("Malabar Fried Fish" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 8:
			System.out.println("You have selected Butter Chicken Wings for Rs 320");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 320);
			a.add("Lobster Tandoori" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;	
			
		case 9:
			mainmenu();
			break;
			
		default:
			System.out.println("Please enter valid input");
			nonVegStarters();
			break;
		}
	}
}

class MainCourse extends Menu {
	
	Menu m1 = new Menu();
	
	public void vegMainCourse()
	{
		System.out.println("Press 1 for Paneer Butter Masala");
		System.out.println("Press 2 for Dal Makhani");
		System.out.println("Press 3 for Palak Paneer");
		System.out.println("Press 4 for Vegetable Biryani");
		System.out.println("Press 5 for Chana Masala");
		System.out.println("Press 6 for Baingan Bharta");
		System.out.println("Press 7 for Paneer Tikka Masala");
		System.out.println("Press 8 for Malai Kofta");
		System.out.println("Press 9 to go back to main menu");
		Scanner sc = new Scanner(System.in);
//		MainCourse m1 = new MainCourse();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Paneer Butter Masala for Rs 240");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
			int q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 240);
				a.add("Paneer Butter Masala Half");
			} else if (q == 2) {
				bill = bill + 240;
				a.add("Paneer Butter Masala Full");
			} else {
				System.out.println("Invalid Input");
				vegMainCourse();
			}
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 2:
			System.out.println("You have selected Dal Makhani for Rs 220");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 220);
			a.add("Dal Makhani" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 3:
			System.out.println("You have selected Palak Paneer for Rs 230");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
		    q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 230);
				a.add("Palak Paneer Half");
			} else if (q == 2) {
				bill = bill + 230;
				a.add("Palak Paneer Full");
			} else {
				System.out.println("Invalid Input");
				vegMainCourse();
			}
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Vegetable Biryani for Rs 250");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
		    q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 250);
				a.add("Vegetable Biryani Half");
			} else if (q == 2) {
				bill = bill + 250;
				a.add("Vegetable Biryani Full");
			} else {
				System.out.println("Invalid Input");
				vegMainCourse();
			}
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;	
			
		case 5:
			System.out.println("You have selected Chana Masala for Rs 210");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 210);
			a.add("Chana Masala" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 6:
			System.out.println("You have selected Baingan Bhartafor Rs 230");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 230);
			a.add("Baingan Bharta" + q);
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;	
			
		case 7:
			System.out.println("You have selected Paneer Tikka Masala for Rs 250");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
		    q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 250);
				a.add("Paneer Tikka Masala Half");
			} else if (q == 2) {
				bill = bill + 250;
				a.add("Paneer Tikka Masala Full");
			} else {
				System.out.println("Invalid Input");
				vegMainCourse();
			}
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 8:
			System.out.println("You have selected Malai Kofta for Rs 250");
			System.out.println("Enter 1 for half");
			System.out.println("Enter 2 for full");
		    q = sc.nextInt();
			if (q == 1) {
				bill = bill + (0.5 * 250);
				a.add("Malai Kofta Half");
			} else if (q == 2) {
				bill = bill + 250;
				a.add("Malai Kofta Full");
			} else {
				System.out.println("Invalid Input");
				vegMainCourse();
			}
			System.out.println("Do you want to order more?");
			System.out.println("Enter 1 to order more");
			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
				
		case 9:
			mainmenu();
			break;
			
		}
			
	}
	
	public void nonVegMainCourse()
	{
		System.out.println("Press 1 for Chicken Curry");
		System.out.println("Press 2 for Fish Curry ");
		System.out.println("Press 3 for Butter Chicken ");
		System.out.println("Press 4 for Chicken Biryani");
		System.out.println("Press 5 for Egg Curry");
		System.out.println("Press 6 for Chicken Tikka Masala");
		System.out.println("Press 7 to go back to main menu");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Chicken Curry for Rs 260");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 260);
			a.add("Chicken Curry" + q);
			System.out.println(m1);
//			System.out.println("Do you want to order more?");
//			System.out.println("Enter 1 to order more");
//			System.out.println("Enter 2 for bill");
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 2:
			System.out.println("You have selected Fish Curry  for Rs 280");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 280);
			a.add("Fish Curry " + q);
			System.out.println(m1);
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Butter Chicken for Rs 270");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 270);
			a.add("Butter Chicken" + q);
			System.out.println(m1);
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Chicken Biryani for Rs 290");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 290);
			a.add("Chicken Biryani" + q);
			System.out.println(m1);
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 5:	
			System.out.println("You have selected Egg Curry for Rs 250");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 250);
			a.add("Egg Curry" + q);
			System.out.println(m1);
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 6:
			System.out.println("You have selected Chicken Tikka Masala for Rs 280");
			System.out.println("Enter the quantity");
			q = sc.nextInt();
			bill = bill + (q * 280);
			a.add("Chicken Tikka Masala" + q);
			System.out.println(m1);
			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 7:
			mainmenu();
			break;

		}	
		
	}
}

class Desserts extends Menu {
	
	Menu d2 = new Menu();
	
	public void iceCream()
	{
		System.out.println("Press 1 for Venilla ");
		System.out.println("Press 2 for Chocolate");
		System.out.println("Press 3 for Strawberry");
		System.out.println("Press 4 for Mango");
		System.out.println("Press 5 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Venilla for Rs 50");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 50);
			a.add("Venilla" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 2:
			System.out.println("You have selected Chocolate for Rs 45");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 45);
			a.add("Chocolate" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Strawberry for Rs 60");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 60);
			a.add("Strawberry" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Mango for Rs 80");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 80);
			a.add("Mango" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;	
			
		case 5:
			mainmenu();
			break;
		}
	}
	
	public void cakes()
	{
		System.out.println("Press 1 for Black Forest Cake ");
		System.out.println("Press 2 for Red Velvet Cake");
		System.out.println("Press 3 for Chocolate Truffle Cake");
		System.out.println("Press 4 for Fruit Cake");
		System.out.println("Press 5 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Black Forest Cake for Rs 100");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 100);
			a.add("Black Forest Cake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 2:
			System.out.println("You have selected Red Velvet Cake for Rs 115");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 115);
			a.add("Red Velvet Cake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Chocolate Truffle Cake for Rs 150");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 150);
			a.add("Chocolate Truffle Cake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Fruit Cake for Rs 100");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 100);
			a.add("Fruit Cake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;	
			
		case 5:
			mainmenu();
			break;
		}
	}
	
	
	public void pastries()
	{
		System.out.println("Press 1 for Chocolate Pastry ");
		System.out.println("Press 2 for Strawberry Pastry");
		System.out.println("Press 3 for Black Forest Pastry");
		System.out.println("Press 4 for Mango Pastry");
		System.out.println("Press 5 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Chocolate Pastry for Rs 80");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 80);
			a.add("Chocolate Pastry" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 2:
			System.out.println("You have selected Strawberry Pastry for Rs 115");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 115);
			a.add("Strawberry Pastry" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Black Forest Pastry for Rs 140");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 140);
			a.add("Black Forest Pastry" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Mango Pastry for Rs 120");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 120);
			a.add("Mango Pastry" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;	
			
		case 5:
			mainmenu();
			break;
		}
	}
	
	public void gulabJamun()
	{
		System.out.println("Press 1 for Traditional");
		System.out.println("Press 2 for Kalaadi");
		System.out.println("Press 3 for Stuffed");
		System.out.println("Press 4 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Traditional for Rs 30");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 30);
			a.add("Traditional" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 2:
			System.out.println("You have selected Kalaadi for Rs 40");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 40);
			a.add("Kalaadi" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Stuffed for Rs 50");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 50);
			a.add("Stuffed" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			mainmenu();
			break;
		}
	}
	
	public void sweets()
	{

		System.out.println("Press 1 for Rasgulla");
		System.out.println("Press 2 for Jalebi");
		System.out.println("Press 3 for Barfi");
		System.out.println("Press 4 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Rasgulla for Rs 40");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 40);
			a.add("Rasgulla" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
		
		case 2:
			System.out.println("You have selected Jalebi for Rs 60");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 60);
			a.add("Jalebi" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 3:
			System.out.println("You have selected Barfi for Rs 70");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 70);
			a.add("Barfi" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			mainmenu();
			break;
		}
	}
}

class Drinks extends Menu {
	
	Menu d2 = new Menu();
	
	public void softDrinks()
	{
		System.out.println("Press 1 for Coca-Cola");
		System.out.println("Press 2 for Pepsi");
		System.out.println("Press 3 for Sprite");
		System.out.println("Press 4 for Fanta");
		System.out.println("Press 5 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Coca-Cola for Rs 20");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 20);
			a.add("Coca-Cola" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 2:
			System.out.println("You have selected Pepsi for Rs 30");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 30);
			a.add("Pepsi" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		
		case 3:
			System.out.println("You have selected Sprite for Rs 30");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 30);
			a.add("Sprite" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Fanta for Rs 30");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 30);
			a.add("Fanta" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 5:
			mainmenu();
			break;
		}
	}

	
	public void freshJuices()
	{
		System.out.println("Press 1 for Orange Juice");
		System.out.println("Press 2 for Apple Juice");
		System.out.println("Press 3 for Pineapple Juice");
		System.out.println("Press 4 for Mango Juice");
		System.out.println("Press 5 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Orange Juice for Rs 40");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 40);
			a.add("Orange Juice" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 2:
			System.out.println("You have selected Apple Juice for Rs 45");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 45);
			a.add("Apple Juice" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		
		case 3:
			System.out.println("You have selected Pineapple Juice for Rs 50");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 50);
			a.add("Pineapple Juice" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Mango Juice for Rs 60");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 60);
			a.add("Mango Juice" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 5:
			mainmenu();
			break;
		}
	}
	
	public void milkshakes()
	{
		System.out.println("Press 1 for Chocolate Milkshake");
		System.out.println("Press 2 for Strawberry Milkshake");
		System.out.println("Press 3 for Banana Milkshake");
		System.out.println("Press 4 for Mango Milkshake");
		System.out.println("Press 5 to go back to main menu");
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("You have selected Chocolate Milkshake for Rs 80");
			System.out.println("Enter the quantity");
			int q = sc.nextInt();
			bill = bill + (q * 80);
			a.add("Chocolate Milkshake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 2:
			System.out.println("You have selected Strawberry Milkshake for Rs 90");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 90);
			a.add("Strawberry Milkshake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		
		case 3:
			System.out.println("You have selected Banana Milkshake for Rs 80");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 80);
			a.add("Banana Milkshake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 4:
			System.out.println("You have selected Mango Milkshake for Rs 90");
			System.out.println("Enter the quantity");
		    q = sc.nextInt();
			bill = bill + (q * 90);
			a.add("Mango Milkshake" + q);
			System.out.println(d2);

			n = sc.nextInt();
			if (n == 1) {
				mainmenu();
			} else if (n == 2) {
				bill();
			}
			break;
			
		case 5:
			mainmenu();
			break;
		}
	}
	
}
public class RMS 
{
	static 
	{
		 	System.out.println("*******************************************************************************");
	        System.out.println("*                Welcome to Restaurant Management System                      *");
	        System.out.println("*                                                                             *");
	        System.out.println("*                   Let's Satisfy Your Taste Buds!                   		  *");
	        System.out.println("*                                                                             *");
	        System.out.println("*******************************************************************************");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter 1 for Signup");
		System.out.println("Enter 2 for Login");
		System.out.println("Enter 3 for Exit");
		Regi r = new Registration(); //Upcasting
		
		//System.out.println(r);
		
		Menu m = new Menu();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			r.signup();
			m.mainmenu();
			break;
		case 2:
			r.login();
			m.mainmenu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Please enter the valid input");
			main(null);
			break;
		}
	}
}
