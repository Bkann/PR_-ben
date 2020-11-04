import java.util.Scanner;

		public class aufg2c {

			public static void main(String[] args) {
				
				
		        Scanner input = new Scanner(System.in);
		        

				System.out.print("was wollen sie berechnen:");
				 String berechnung = input.nextLine();
				 
				 
				 String s1 = "BMI";
	             String s2 = "Meldscore";	
			     if ( berechnung.equals(s2)) {  System.out.print("Name des Patienten: ");
		           String name = input.nextLine();
			          
		          System.out.print("Kreatinwert des Patienten: ");
		           double Kreatinwert = input.nextDouble();
		          
		          System.out.print("Bilirubinwert des Patienten: ");
		           double Bilirubinwert = input.nextDouble();
		           
		          System.out.print("INR-Wert des Patienten: ");
		           double INRwert = input.nextDouble();
				
				
		            double meldScore  = (10 * (0.957 * Math.log(Kreatinwert) + 0.378 * Math.log(Bilirubinwert) + 1.12 * Math.log(INRwert) + 0.643) ); 
				
				
			     System.out.printf ("Patient %s hat einen Meld-Score von %.1f." , name, meldScore); }
	             
			   else if (berechnung.equals(s1)) {  System.out.print("Name des Patienten: ");
	           String name = input.nextLine();
		          
	          System.out.print("Gewicht des Patienten: ");
	           int Gewicht = input.nextInt();
	          
	          System.out.print("Körpergröße des Patienten: ");
	           double Körpergröße = input.nextDouble();
			
			
			
	            double bmi = Gewicht / (Körpergröße * Körpergröße);
			
			
		     System.out.printf ("Patient %s hat einen BMI von %.1f.\n", name, bmi);
			
			
			if (bmi >= 40) {
				System.out.print("Der Patient hat Adipositas Typ 3. ");
			
			}else if (bmi >= 35) {
				System.out.print("Der Patient hat Adipositas Typ 2. ");
			
			}else if (bmi >= 30) {
				System.out.print("Der Patient hat Adipositas Typ 1. ");
				
			}else {
				System.out.print("Der Patient hat Normalgewicht. "); } 
			
			
			   }else {
				   System.out.printf (" %.f ist unbekannt und kann nicht berechnet werden", berechnung); }
	             
	             
	             
				 
		        
				 
				 
				 
				 
				 
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
			     
			    
			     
			     System.out.print("Name des Patienten: ");
		           String patienName = input.nextLine();
		          
		          System.out.print("Gewicht des Patienten: ");
		           int Gewicht = input.nextInt();
		          
		          System.out.print("Körpergröße des Patienten: ");
		           double Körpergröße = input.nextDouble();
				
				
				
		            double bmi = Gewicht / (Körpergröße * Körpergröße);
				
				
			     System.out.printf ("Patient %s hat einen BMI von %.1f.\n", name, bmi);
				
				
				if (bmi >= 40) {
					System.out.print("Der Patient hat Adipositas Typ 3. ");
				
				}else if (bmi >= 35) {
					System.out.print("Der Patient hat Adipositas Typ 2. ");
				
				}else if (bmi >= 30) {
					System.out.print("Der Patient hat Adipositas Typ 1. ");
					
				}else {
					System.out.print("Der Patient hat Normalgewicht. ");
				}
				
				
				
					}
			}
			

