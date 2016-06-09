package com.java.training;

public class EnumTest {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek =  DayOfWeek.MONDAY;
		
		if (dayOfWeek == DayOfWeek.MONDAY) {
			//System.out.println("Today is Monday. I have work to do");
		}
		dayOfWeek = DayOfWeek.SUNDAY;
		//switch statements
		switch (dayOfWeek) {
		    case MONDAY: {
		    	System.out.println("Today is Monday. I have work to do"); 
		    	break;
		    }
		    case TUESDAY: {
		    	System.out.println("Today is Tuesday. I have a soccer game"); 
		    	break;
		    }
		    case WEDNESDAY: {
		    	System.out.println("Today is Wednesday. I have a board meeting"); 
		    	break;
		    }
		    case SUNDAY: {
		    	System.out.println("Today is Sunday. I have a movie to catch"); 
		    	break;
		    }
	    
		}
		
		//enum iteration
		for (DayOfWeek dow : DayOfWeek.values()) {
		    //System.out.println(dow);
		}
		
		//Enum Fields
		//You can add fields to a Java enum. Thus, each constant enum value gets these fields. 
		//The field values must be supplied to the constructor of the enum when defining the constants.
		//System.out.println("Printing enum values ....");
		for (Level level : Level.values()) {
		    System.out.println(level.getValue());
		}

	}
	
	enum Level {
		EXTREME_LOW(-1),
		HIGH  (3),  //calls constructor with value 3
	    MEDIUM(2),  //calls constructor with value 2
	    LOW   (1),   //calls constructor with value 1
	    
	    EXTREME_HIGH(100)
	    ; // semicolon needed when fields / methods follow


	    private final int levelCode;

	    private Level(int levelCode) {
	        this.levelCode = levelCode;
	    }
	    
	    private int getValue() {
	    	return this.levelCode;
	    }
	}

}
