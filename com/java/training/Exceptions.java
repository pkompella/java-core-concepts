package com.java.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exceptions {
	
	//checked exception
	String formatDate()  throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2012-05-20T09:00:00.000Z");
		String formattedDate = new SimpleDateFormat("dd/MM/yyyy, Ka").format(date);
		
		return formattedDate;
	}
	
	void doBusiness(int condition)  {
		switch(condition) {
		case 1:
			throw new IllegalArgumentException("Illegal Argument set for condition 1");
		case -1:
			throw new IllegalStateException("Illegal State");
		default:
			//throw new RuntimeException("I am destined to throw exception");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptions ex = new Exceptions();
		try {
			ex.formatDate();
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
		try {
			ex.doBusiness(2);
		/*} catch(IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		} catch (IllegalStateException is) {
			System.out.println(is.getMessage());
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage()); */
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally called.....");
		}
	}

}
