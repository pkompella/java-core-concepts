package com.java.training.sax;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserExample {
	static String fname;
	static String lname;
	static String salary;
	static String nickname;
	public static void main(String[] args) {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

				boolean bfname = false;
				boolean blname = false;
				boolean bnname = false;
				boolean bsalary = false;

				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {

					System.out.println("Start Element :" + qName);

					if (qName.equalsIgnoreCase("FIRSTNAME")) {
						bfname = true;
					}

					if (qName.equalsIgnoreCase("LASTNAME")) {
						blname = true;
					}

					if (qName.equalsIgnoreCase("NICKNAME")) {
						bnname = true;
					}

					if (qName.equalsIgnoreCase("SALARY")) {
						bsalary = true;
					}

				}

				public void endElement(String uri, String localName, String qName) throws SAXException {
					System.out.println("End Element :" + qName);
				}

				public void characters(char ch[], int start, int length) throws SAXException {

					System.out.println(new String(ch, start, length));

					if (bfname) {
						fname = new String(ch, start, length);
						bfname = false;
					}

					if (blname) {
						lname = new String(ch, start, length);
						blname = false;
					}

					if (bnname) {
						nickname = new String(ch, start, length);
						bnname = false;
					}

					if (bsalary) {
						salary = new String(ch, start, length);
						bsalary = false;
					}

				}

			};

			File file = new File("c:\\temp\\sax-example-utf8.xml");
			InputStream inputStream = new FileInputStream(file);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");

			InputSource is = new InputSource(reader);
			//is.setEncoding("UTF-8");

			saxParser.parse(is, handler);
			
			System.out.println("First Name = " + fname);
			System.out.println("Last Name = " + lname);
			System.out.println("Nick Name = " + nickname);
			System.out.println("Salary  = " + salary);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
