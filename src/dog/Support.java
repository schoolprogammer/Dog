package dog;

public class Support {
    //variables for characteristics
      private String dogName, dogBreed;
      public int aggression, hunger;
      private int age;

      //constructors
      public Support(String dgName, String dgBreed, int agg, int hung){
    	dogName = dgName;
    	dogBreed = dgBreed;
    	aggression = agg;
    	hunger = hung;
      }

      //Alternate constructor
      public Support(String dgName, String dgBreed){
    	//This constructor only uses the name and breed
    	//Set the aggression and hunger to random #s

    	dogName = dgName;
    	dogBreed = dgBreed;
    	aggression = (int)(Math.random()*10) + 1;
    	hunger = (int)(Math.random()*10) + 1;
    	age = (int)(Math.random()*20) + 1;
      }

      //Accessor Methods
      public String getName() {
    	return dogName;
      }

      public void setName(String dgName){
    	dogName = dgName;
      }

      public String getBreed() {
    	return dogBreed;
      }

      public void setBreed(String dgBreed){
    	dogBreed = dgBreed;
      }

      public int getAggression() {
    	return aggression;
      }

      public void setAggression(int dogAgg){
    	aggression = dogAgg;
      }

      public int getHunger() {
    	return hunger;
      }

      public void setHunger(int dogHung){
    	hunger = dogHung;
      }

      public void barkFriendly() {
    	System.out.println("Arf! Arf!");
      }

      public void barkAngry() {
    	System.out.println("GRR! RRRFFF!");
      }
      

      //method to display all info of the Dog
      @Override
      public String toString() {
    	String output = "Name: " + dogName + "\n";
    	output += "Breed: " + dogBreed + "\n";
    	output += "Aggression: " + aggression + "\n";
    	output += "Hunger: " + hunger + "\n";
    	output += "Age: " + age;
    	//output string is complete, return it
    	return output;
      }

}
