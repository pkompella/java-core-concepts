package com.java.training.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AddressSerializer {
	 public void serializeAddress(String street, String country){
		   Address address = new Address();
		   address.setStreet(street);
		   address.setCountry(country);
		   
		   try{
			   
			FileOutputStream fout = new FileOutputStream("c:\\temp\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
		   }
	   }
	 
	 public static void main (String args[]) {
		 AddressSerializer serializer = new AddressSerializer();
		 serializer.serializeAddress("wall street", "united state");
	 }

}
