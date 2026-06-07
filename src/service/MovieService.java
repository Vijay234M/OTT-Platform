package service;

import java.util.LinkedHashSet;
import java.util.Scanner;

import entity.Movies;

public class MovieService {
	
	public static LinkedHashSet<Movies> lh = new LinkedHashSet<Movies>();
	static {
		lh.add(new Movies(1,"Leo","3hours","199Rs"));
	}

	Scanner scan = new Scanner(System.in);
	
	public void AddMovies(int id , String moive,String duration , String price) {
		for(Movies m : lh) {
			if(m.getId() != id) {
				lh.add(new Movies(id,moive,duration,price));
				System.out.println("Added Successfully");
				return;
			}
		}
		System.out.println("ID already registor");
	}

	public void UpdateMovie(int movieid) {
		// TODO Auto-generated method stub
		for(Movies m : lh) {
			if(m.getId() == movieid) {
				System.out.print("Enter Name : ");
				String name = scan.next();
				m.setMovieName(name);
				System.out.print("Enter Duration : ");
				String Duration = scan.next();
				m.setDurations(Duration);
				System.out.print("Enter Price");
				String price = scan.next();
				m.setPrice(price);
				System.out.println("Updated Successfully");
				return;
			}
		}
		System.out.println("ID not found");
	}

	public void DeleteMovie(int delid) {
		// TODO Auto-generated method stub
		for(Movies m : lh) {
			if(m.getId() == delid) {
				lh.remove(m);
				System.out.println("Deleted Successfully");
				return;
			}
		}
		System.out.println("Id not found");
	}

	
	//---------------------------------------------------------------------------------------------------------

	
	public void DisplayAll() {
		// TODO Auto-generated method stub
		for(Movies m : lh) {
			m.displayInfo();
		}
		
	}

	public void DisplayById(int id) {
		// TODO Auto-generated method stub
		for(Movies m : lh) {
			if(m.getId() == id) {
				m.displayInfo();
				UserService us = new UserService();
				us.PlayVideo();
				return;
			}
		}
		System.out.println("ID not found");	
	}
	
}
