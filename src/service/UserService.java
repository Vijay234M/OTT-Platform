package service;

import java.util.LinkedHashSet;
import java.util.Scanner;

import MainController.AdminController;
import MainController.UserController;
import entity.Users;

public class UserService{
	
	public static LinkedHashSet<Users> lh = new LinkedHashSet<Users>();
	static {
		lh.add(new Users(1,"vijay","2578","ADMIN",1000));
		lh.add(new Users(2,"niki","1617","USER",1000));
	}
	
	public void UserRegistor(int id,String name,String password,String role) {
		for(Users u : lh) {
			if(u.getId() != id) {
				lh.add(new Users(id,name,password,role,0));
				return;
			}else {
				System.out.println("Already Registoredd....");
			}
		}
	}
	 
	AdminController ac = new AdminController();
	UserController uc = new UserController();
	public void UserLogin(String username,String userpassword) {
		for(Users u : lh) {
			if(u.getName().equals(username) && u.getPassword().equals(userpassword)) {
				switch(u.getRole()) {
				case "ADMIN":
					ac.display();
					return;
					
				case "USER":
					uc.display();	
					return;
				}
			}
		}
		System.out.println("user not found");
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	Scanner scan = new Scanner(System.in);
	public void PlayVideo() {
		// TODO Auto-generated method stub
		System.out.print("Enter Your ID : ");
		int id = scan.nextInt();
		for(Users u : lh) {
			if(u.getId() == id) {
				if(u.getPrice() >= 299) {
					System.out.println("Movie Playing");
				}else {
					System.out.println("Pay First And Watch");
					System.out.print("Enter Amount 299: ");
					int price = scan.nextInt();
					u.setPrice(price);
					return;
				}
			}
			System.out.println("ID not Found");
		}
		
		
	}
	
	
}