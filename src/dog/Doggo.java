package dog;
import javax.swing.JOptionPane;

public class Doggo {

    public static void main(String[] args) {
   	 String dog1, dog2, agg, hung;
   	 int aggVal, hungerVal;
   	 dog1 = JOptionPane.showInputDialog("Two dogs will be created\nChoose name for the first dog:");
   	 dog2 = JOptionPane.showInputDialog("Choose the name for the second dog");
   	 
   	 
   	Support Dog1 = new Support(dog1, "Spaniel");
   	Support Dog2 = new Support(dog2, "Border Collie");

    	//Print out the details of each dog
    	System.out.println(Dog1);
    	System.out.println("--------------------------");
    	System.out.println(Dog2);
    	System.out.println("--------------------------");
       
   	 
    	//Aggression change for dog 1
    	agg = JOptionPane.showInputDialog("Choose aggression level from 1-10 for " + dog1);
    	aggVal = Integer.parseInt(agg);
    	Dog1.setAggression(aggVal);
   	 
    	//Aggression change for dog 2
    	agg = JOptionPane.showInputDialog("Choose aggression level from 1-10 for " + dog2);
    	aggVal = Integer.parseInt(agg);
    	Dog2.setAggression(aggVal);

    	//hunger change for dog 1
    	hung = JOptionPane.showInputDialog("Choose hunger level from 1-10 for " + dog1);
    	hungerVal = Integer.parseInt(hung);
    	Dog1.setHunger(hungerVal);
   	 
    	//hunger change for dog 2
    	hung = JOptionPane.showInputDialog("Choose hunger level from 1-10 for " + dog2);
    	hungerVal = Integer.parseInt(hung);
    	Dog2.setHunger(hungerVal);
   	 
    	//checks to see the friendly encounter
    	if(Dog1.aggression >= 1 && Dog1.aggression <= 5 && Dog2.aggression >= 1 && Dog2.aggression <= 5 || Dog1.hunger >= 1 && Dog1.hunger <= 5 && Dog2.hunger >= 1 && Dog2.hunger <= 5) {
   		 System.out.println(dog1 + ":");
   		 Dog1.barkFriendly();
   		 System.out.println(dog2 + ":");
   		 Dog2.barkFriendly();
    	}
    	//if not friendly, then it is an aggressive encounter
    	else {
   		 System.out.println(dog1 + ":");
   		 Dog1.barkAngry();
   		 System.out.println(dog2 + ":");
   		 Dog2.barkAngry();
    	}
   	 
    }

}
