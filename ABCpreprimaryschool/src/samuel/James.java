package samuel;

//Use Scanner class to access packages within class java........1//

import java.util.Scanner; 

//This class Name.........11//

public class James 

{
	
	//Access Scanner members or class privately........4//
	
        private static Scanner marks;
		private static Scanner moses;
		
		public static void main(String[]args)
		{
			 
			//create scanner members............2//
			
			moses = new Scanner(System.in);
			
			
			//capture strings from the keyboard........3//
			
			System.out.println("ABC PRE-PRIMARY SCHOOL EXAM GRADING SOFTWARE");
			
			
			System.out.println("Enter Pupil Name:");
			String name = moses.next(); 
			
			
			System.out.println("Enter Date_Of_Birth:");
			String date = moses.next();
			
			
		    System.out.println("Enter Gender Of Pupil:");
		    String gender = moses.next();
			
		    
			System.out.println("Enter Stream of the Pupil:");
			String stream = moses.next();
			
			
			System.out.println("Enter Current School Term of the Pupil:");
			String term = moses.next();
			
			
			//Capture integer marks from the keyboard.........5//
			
			
			marks = new Scanner(System.in);
			
			
			System.out.println("Input Pupil Marks For Reading:");
			int mark1 = marks.nextInt();
			
			
			System.out.println("Input Pupil Marks For Spelling Bee:");
			int mark2 = marks.nextInt();
			
			
			System.out.println("Input Pupil Marks For Singing: ");
			int mark3 = marks.nextInt();
			
			
			System.out.println("Input Pupil Marks For Story Telling:");
			int mark4 = marks.nextInt();
			
			
			//Print or display inputs results...........6//
			
			
			System.out.println("|Pupil Name:| " + name);
			
	        
			System.out.println("|Date_Of_Birth:| " + date);
			
			
			System.out.println("|Gender:| " + gender);
			
			
			System.out.println("|Stream Name:| " + stream);
			
			
			System.out.println("|Current Term:| " + term);
			
			
			//Addition of Total_Marks for the pupil........7//
			
			
			int Total_Marks = (mark1 + mark2 + mark3 + mark4);
			
			
			System.out.println("|Total_Marks:| " + Total_Marks);
			
			
			//Getting the Average_Marks of the pupil by diving the total_marks by 2.........8//
			
			
			float Average_Marks = (Total_Marks / 2);
			
			
			System.out.println("|Average_Marks:| " + Average_Marks );
			
			
			//Getting the pupil class-strength by diving the average_marks by 15 then add 5 to it........9//
			
			
			float class_strength = (Average_Marks / 15 + 5);
			
			
			System.out.println("|Pupil Class-Strength:| " + class_strength );
			
			
			//HeadTeacher Report or comment on the pupil..........10//
			
			
			if(class_strength>=9)
			{
				
				System.out.println("|HeadTeacher Comment:| Promoted To The Next Class");
				
			}
			
			else
			{
				
				System.out.println("|HeadTeacher Comment:| Kindly Repeat The Class");
				
	    }
			
     }
}
