package com.java.training.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBConvertXML2Object {
	public static void main(String[] args) {

		try {

			File file = new File("C:\\temp\\customers.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) jaxbUnmarshaller.unmarshal(file);
			
			//print customers
			System.out.println("Size of Customers => " + customers.getCustomer().size());
			customers.getCustomer().forEach(c -> System.out.println(c.name));
			
			

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
