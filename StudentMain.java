package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentMain {

	public static void main(String[] args) {
	
		Students s = new Students();
		s.setFirstName("Ram");
		s.setLastname("Patil");
		s.setCity("Pune");
		
		try {
			FileOutputStream fso = new FileOutputStream("C:\\Users\\pravin bhujbale\\Desktop\\one.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fso);
			oos.writeObject(s);
			
			fso.close();
			oos.close();
			
			System.out.println("Done");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
