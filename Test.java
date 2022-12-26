package com.execises.bll;
import com.execise.pll.Employee;
public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(123 , "Yash", "Khopade" , 25000.00);
		System.out.println(e1);
		
		
		
		
		
	     System.out.println("annual salary is: " + e1.getYearlysalary());
	     
	     System.out.println(e1.getRaisesalary());

	}

}
