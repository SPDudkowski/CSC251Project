public class Policy
{
   //instancing variables
   private int policyNumber,
               holderAge;
               
   private double holderHeight,
                  holderWeight;
   
   private String providerName,
                  holderFirstName,
                  holderLastName,
                  holderSmokingStatus;
   
   //no-arg constructor
   public Policy()
   {
      policyNumber = 0;
      holderAge = 0;
      holderHeight = 0;
      holderWeight = 0;
      
      providerName = "Big Insurance";
      holderFirstName = "John";
      holderLastName = "Doe";
      holderSmokingStatus = "non-smoker";
   }
   
   //constructor
   public Policy(int pNum, int hAge, double hHeight, double hWeight, String pName, String fName, String lName, String smoke)
   {
      policyNumber = pNum;
      holderAge = hAge;
      holderHeight = hHeight;
      holderWeight = hWeight;
      
      String providerName = pName;
      String holderFirstName = fName;
      String holderLastName = lName;
      String holderSmokingStatus = smoke;
   }
   
   //method to calculate the bmi of policy holder
   public double calcBmi()
   {  
      double bmi;
      
      bmi = (holderWeight * 703) / (holderHeight*holderHeight);
      return bmi;
   }
   //method to calculate the total cost of insurance
   public double calcPrice(double bmi)
   {
      double holderBmi = bmi,
             baseFee = 600,
             totalFee = 0;
      
      totalFee += baseFee;
      if(holderAge > 50)
      {
         totalFee += 75;
      }
      if(holderSmokingStatus == "smoker")
      {
         totalFee += 100;
      }
      if(holderBmi > 35)
      {
         totalFee += (bmi-35)*20;
      }
          
     return totalFee;
   }
   
}