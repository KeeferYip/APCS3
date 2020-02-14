//Keefer Yip 
// 2/05/2020
//Practice for Inheritance, review arrays and array lists
// APCS 3rd Period

import java.util.ArrayList;

public class ThereAndBackAgain 
{

	public static void main(String[] args) 
	{
		Hobbit bilbo = new Hobbit("Bilbo");
		Hobbit frodo = new Hobbit("Frodo");
		Hobbit sam = new Hobbit("Sam");
		Dwarf gimli = new Dwarf("Gimli");
		Wizard gandalf = new Wizard("Gandalf", "Grey" );
		
		Traveler[] party1 = {frodo, sam, gimli};
		
		for (int i = 0; i < party1.length; i++) {
			party1[i].travel(50);
			System.out.println(party1[i].getName() +" has traveled "+ party1[i].getDistanceTraveled()+" miles.");
		}
	
		System.out.println();
		
		System.out.println("\n\n\nPART 2: \n");

		String[] dwarfNames = {"Fili", "Kili", "Dori", "Ori", "Nori", "Balin", "Dwalin",
		"Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin"};

		// Make a new ArrayList to hold a 2nd party of Travelers called party2:
		ArrayList<Traveler> party2 = new ArrayList<Traveler>();
		// Make a new Hobbit called "Bilbo" and add him to party2
		party2.add(bilbo);
		// Make a new Wizard called "Gandalf" and add him to party2.
		party2.add(gandalf);
	
	// Call the createParty method and pass it party2 and the dwarfNames array.
		createParty(party2, dwarfNames);
	// Finally, call the allTravel method passing it party2 and 100 (representing
	// the 100 miles that party2 has traveled together.
			allTravel(party2, 100);
}
		//write createParty
	public static void createParty(ArrayList<Traveler> party,String[] dwarves){
        for(int i=0; i < dwarves.length; i++) {
            Traveler dwarf = new Dwarf(dwarves[i]);
            party.add(dwarf);
        	}
			
	}
		// create party should add all the new dwarves to party2,
	
		//Write allTravel
	//Make sure your code prints out the name and distances party2 has traveled.
	public static void allTravel(ArrayList<Traveler> party2, int miles){
		for(int i = 0; i < party2.size(); i++) {
            party2.get(i).travel(miles);
        	System.out.println(party2.get(i).getName() +" has traveled "+ party2.get(i).getDistanceTraveled()+" miles.");
    			}

		}
}
	

