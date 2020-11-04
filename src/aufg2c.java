import java.util.Scanner;

		public class1 aufg2c {

			public static void main(String[] args) {
				
				
		        Scanner input = new Scanner(System.in);
				
				
				System.out.print("was wollen sie berechnen:");
				 String input = input.nextLine();
		        
		          
				System.out.print("Name des Patienten: ");
		          
				String name = input.nextLine();
		          
		         
				System.out.print("Kreatinwert des Patienten: ");
		          
				double Kreatinwert = input.nextDouble();
		          
		       
				System.out.print("Bilirubinwert des Patienten: ");
		          
				double Bilirubinwert = input.nextDouble();
		           
		       
				System.out.print("INR-Wert des Patienten: ");
		        
				double INRwert = input.nextDouble();
				
				
		           
				double meldScore  = (10 * (0.957 * Math.log(Kreatinwert) + 0.378 * Math.log(Bilirubinwert) + 1.12 * Math.log(INRwert) + 0.643) ); 
				
				
			     
				System.out.printf ("Patient %s hat einen Meld-Score von %.1f." , name, meldScore);
				
				
				
				
		2222222
				
				
				
	        String patientName = "Max Mustermann";
		double Körpergröße = 1.85;
		double Körpergewicht = 120;
		
		
            double bmi = Körpergewicht / (Körpergröße * Körpergröße);
		
		
	    System.out.printf ("Patient %s hat einen BMI von %.1f.\n", patientName, bmi);
		
		
		if (bmi >= 40) {
			System.out.print("Der Patient hat Adipositas Typ 3. ");
		
		}else if (bmi >= 35) {
			System.out.print("Der Patient hat Adipositas Typ 2. ");
		
		}else if (bmi >= 30) {
			System.out.print("Der Patient hat Adipositas Typ 1. ");
			
		}else {
			System.out.print("Der Patient hat Normalgewicht. ");
				
				
				input.close();
			}

		


	}


