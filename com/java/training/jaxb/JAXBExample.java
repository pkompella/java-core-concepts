package com.java.training.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExample {
	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setId(100);
		customer1.setName("Customer 123");
		customer1.setAge(29);

		Customer customer2 = new Customer();
		customer2.setId(200);
		customer2.setName("Customer 345");
		customer2.setAge(39);

	
		Customer customer3 = new Customer();
		customer3.setId(300);
		customer3.setName("Customer 777");
		customer3.setAge(49);

		Customers customers = new Customers();
		customers.getCustomer().add(customer1);
		customers.getCustomer().add(customer2);
		customers.getCustomer().add(customer3);

		try {

			File file = new File("C:\\temp\\customers.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customers, file);
			jaxbMarshaller.marshal(customers, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
