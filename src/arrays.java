//import your scanner
import java.util.InputMismatchException;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput =0;
		boolean cont = true;
		int choice = 0;
		String []name = new String[5];
			name[0]= "Armani";
			name[1]= "Kristen";
			name[2]= "Escoe";
			name[3]= "Tyler";
			name[4]= "Jeseekia";
		String []food = new String[5];
			food[0]= "Salmon";
			food[1]= "Tacos";
			food[2]= "Shrimp";
			food[3]= "Pizza";
			food[4]= "Pasta";
		String []city = new String[5];
			city[0]= "Detroit";
			city[1]= "Detroit";
			city[2]= "Detroit";
			city[3]= "Monroe";
			city[4]= "Detroit";
			System.out.println("Welcome!!");
			
			while(cont){
		 System.out.println("Pick a student! Enter 1-5");
		 try{
		 userInput= input.nextInt()-1;
		 } catch(InputMismatchException e){
				System.out.println("Thats an invalid prompt, please enter a valid answer! Try Again? Enter- (1) for Yes/(2) for No");
				input.nextLine();
				userInput= input.nextInt();
		 }
		 choice = input.nextInt();
				if(choice==1){
					cont = true;
				}//end of if statement
				else if(choice==2){
					cont = false;
					System.out.println("Goodbye!");
				}//end of else if statement
				else ()
				
		 System.out.println( "You Picked : " + name[userInput]);
		 
		 System.out.println("Choose what you want to know about " + name[userInput] + ":" + " Enter (1) Hometown or (2) Food");
		  choice = input.nextInt();
		 if(choice==1){
			 System.out.println(name[userInput] + "hometown is " + city[userInput]);
			 
		 } //end of if statement
			  else if(choice==2){
			 System.out.println( name[userInput] + "favorite food is: " + food[userInput]);

		 }//end of else if statement
		 
		 System.out.println("would you like to continue with another student? " + "Enter (1) for Yes or (2) for No");
		 choice = input.nextInt();
		 if (choice==1){
			 cont = true;
			 
		 }else if (choice==2){
			 cont = false;
			 System.out.println("Goodbye!");
		 }//end of else if statement for choice 2
		 
		 
		}//end of while loop
			
			
			
	}//end of main method

}//end of class
