package com.execise.rll;
import com.execise.dll.Author;
public class TestAuthor {

	public static void main(String[] args)  {
		
		   Author a1=new Author();
		   Author a2=new Author("Ishwari ","Jagtap");
		   Author a3=new Author("Ishwari","Jagtap","The apes on earth");
					
		   Author []Auth=new Author[10];

			System.out.println("\nAuthors first name  :"+a2.getFirstName());
			System.out.println("Authors last name  :"+a2.getLastName());
					
			System.out.println("\n Author details  :"+a3.toString());

			System.out.println("\nFirst name is of second object :"+a1.getFirstName());
			System.out.println("Second name is  of second object :"+a1.getLastName());
			System.out.println("Book name is of second object :"+a1.getBookname());

		    Auth[1]=a2;
			 
			 System.out.println("\nAuthors first name  :"+Auth[1].getFirstName());
			 System.out.println(" Authors last name  :"+Auth[1].getLastName());
			 	
		}
	

	



		

	}


