import java.util.Scanner; 

public class Project_stephen_dudkowski
{
      public static void main(String[] args)
      {
         Scanner keyboard = new Scanner(System.in);
         int policyNumber,
             holderAge;
             
         double holderHeight,
                holderWeight,
                holderBmi,
                policyPrice;
         
         String providerName,
                holderFirstName,
                holderLastName,
                holderSmokingStatus;
         
         System.out.print("Please enter the Policy Number: ");
         policyNumber = keyboard.nextInt();
         keyboard.nextLine();
         
         System.out.print("Please enter the Provider Name: ");
         providerName = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's First Name: ");
         holderFirstName = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Last Name: ");
         holderLastName = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Age: ");
         holderAge = keyboard.nextInt();
         keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         holderSmokingStatus = keyboard.nextLine();
         holderSmokingStatus = holderSmokingStatus.toLowerCase();
                 
         System.out.print("Please enter the Policyholder's Height (in inches): ");
         holderHeight = keyboard.nextDouble();
   
         System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         holderWeight = keyboard.nextDouble();
         
         Policy policyHolder = new Policy(policyNumber, holderAge, holderHeight, holderWeight, providerName, holderFirstName, holderLastName, holderSmokingStatus);
         holderBmi = policyHolder.calcBmi();
         policyPrice = policyHolder.calcPrice(holderBmi);
         
         System.out.println();
         System.out.println("Policy Number: " + policyNumber);
         System.out.println("Provider Name: " + providerName);
         System.out.println("Policyholder's First Name: "+ holderFirstName);
         System.out.println("Policyholder's Last Name: " + holderLastName);
         System.out.println("Policyholder's Age: " + holderAge);
         System.out.println("Policyholder's Smoking Status: " + holderSmokingStatus);
         System.out.println("Policyholder's Height: " + holderHeight);
         System.out.println("Policyholder's Weight: " + holderWeight);
         System.out.printf("Policyholder's bmi: %,.2f \n", holderBmi);
         System.out.printf("Policy Price: %,.2f \n", policyPrice);
   
   
      }
}