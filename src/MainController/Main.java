package MainController;

import java.util.Scanner;

import service.UserService;

public class Main{
	
	Main(){
		while(true) {
			UserService us = new UserService();
			System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("---Welcome NN OTT Platform---");
		System.out.println("1.Login"
				+ "\n2.Registor");
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.print("Enter : ");
		int choice = scan.nextInt();
		
		switch(choice){
		case 2:
			System.out.println("Registor Page");
			System.out.print("Enter ID :");
			int id = scan.nextInt();
			System.out.print("Enter Name : ");
			String name = scan.next();
			System.out.print("Enter PassWord : ");
			String password = scan.next();
			System.out.print("Enter Role [ADMIN OR USER]: ");
			String role = scan.next().toUpperCase();
			us.UserRegistor(id, name, password, role);
			continue;
			
		case 1:
			System.out.println("Login Page");
			System.out.print("Enter UserName :");
			String username = scan.next();
			System.out.print("Enter UserPassword :");
			String userpassword = scan.next();
			us.UserLogin(username, userpassword);
			continue;
			
			default:
				System.out.println("Invalid Syntax");
				continue;
				
		}
		}catch(Exception e){
			System.out.println(e);
			
		}
		}
	}
}
