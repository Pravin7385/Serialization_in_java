package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\pravin bhujbale\\Desktop\\one.txt");
			
			ObjectInputStream oos = new ObjectInputStream(fis);
			
			Object obj = new Object();
			
			Students s = new Students();
			
			System.out.println(s.getFirstName());
			System.out.println(s.getLastname());
			System.out.println(s.getCity());
			
			fis.close();
			oos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
