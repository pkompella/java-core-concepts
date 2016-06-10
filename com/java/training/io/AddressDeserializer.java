package com.java.training.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AddressDeserializer {
	public static void main(String args[]) {

		AddressDeserializer deserializer = new AddressDeserializer();
		Address address = deserializer.deserialzeAddress();
		System.out.println(address);
	}

	public Address deserialzeAddress() {

		Address address;

		try {

			FileInputStream fin = new FileInputStream("c:\\temp\\address.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			address = (Address) ois.readObject();
			ois.close();

			return address;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
