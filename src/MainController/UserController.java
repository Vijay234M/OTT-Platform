package MainController;

import java.util.Scanner;

import service.MovieService;

public class UserController {

	public void display() {
		while(true) {
			MovieService ms  = new MovieService();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("---Welcome User Controller---"
				+ "\n1.View All Moives"
				+ "\n2.View Movies By ID"
				+ "\n3.Log-out");
		Scanner scan = new Scanner(System.in);
		try {
		System.out.print("Enter : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			ms.DisplayAll();
			continue;
			
		case 2:
			System.out.print("Enter Movie ID : ");
			int id = scan.nextInt();
			ms.DisplayById(id);
			continue;
			
		case 3:
			System.out.println("Log-out");
			Main m = new Main();
			continue;
			
			default:
				System.out.println("Invalid Syntax");
				continue;
		}
		}catch(Exception e ) {
			System.out.println(e);
		}
		
		
		}
	}
}
