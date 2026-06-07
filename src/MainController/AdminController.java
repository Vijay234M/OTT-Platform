package MainController;

import java.util.Scanner;

import service.MovieService;

public class AdminController {

	public void display() {
		while(true) {
			MovieService ms = new MovieService();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("---Welcome Admin Controller---");
		System.out.println("1.ADD Movie"
				+ "\n2.Update Movie"
				+ "\n3.Delete Movie"
				+ "\n4.Log-out");
		Scanner scan = new Scanner(System.in);
		try {
		System.out.print("Enter : ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("ADD Movie");
			System.out.print("Enter ID : ");
			int id = scan.nextInt();
			System.out.print("Enter Movie Name : ");
			String movie = scan.next();
			System.out.print("Enter Durations : ");
			String duration = scan.next();
			System.out.print("Enter Price : ");
			String price = scan.next();
			ms.AddMovies(id, movie, duration, price);
			continue;
			
		case 2:
			System.out.println("Update Movie");
			System.out.print("Enter Moive ID : ");
			int movieid = scan.nextInt();
			ms.UpdateMovie(movieid);
			continue;
			
		case 3:
			System.out.println("Delete");
			System.out.print("Enter Movie ID : ");
			int delid = scan.nextInt();
			ms.DeleteMovie(delid);
			continue;
			
		case 4:
			System.out.println("Log-out");
			System.out.println("---------------------------------------------------------------------------------------------------------------");
		    Main m = new Main();
		    break;
		
		
		default:
			System.out.println("Invalid Syntax");
			continue;
		
		}break;
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}
}
