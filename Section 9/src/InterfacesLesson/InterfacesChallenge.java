//	08.07.2021
//	Interfaces Challenge

package InterfacesLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ISaveable {
	
	List<String> write();
	void read(List<String> savedValues);
	
}//end ISaveable

class Player implements ISaveable {

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player Name: " + name + " | HitPoints: " + hitPoints + " | Strength: " + strength + " | Weapon: " + weapon;
	}

	@Override
	public List<String> write() {
		
		List<String> values = new ArrayList<String>();
		
		values.add(0, this.name);
		values.add(1, String.valueOf(this.hitPoints));
		values.add(2, String.valueOf(this.strength));
		values.add(3, this.weapon);
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
	}
	
}//end Player

class Monster implements ISaveable {
	
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    
    @Override
    public String toString() {
        return "Monster Name: " + name + " | HitPoints: " + hitPoints + " | Strength: " + strength;
    }

    @Override
    public List<String> write() {
    	
        ArrayList<String> values = new ArrayList<String>();
        
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
    
}//end Monster

public class InterfacesChallenge {

	public static void main(String[] args) {

		Player joshua = new Player("Joshua", 10, 15);
        System.out.println(joshua.toString());
        saveObject(joshua);

        joshua.setHitPoints(8);
        System.out.println(joshua);
        joshua.setWeapon("Stormbringer");
        saveObject(joshua);
        //loadObject(joshua);
        System.out.println(joshua);
        
        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        // To print out the JUST the strength, 'werewolf.getStrength()' doesn't work even if '.getStrength()' in the 'Monster' class is implemented, instead you do it by casting as shown below since 'werewolf' is
        // interface type
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
        System.out.println(werewolf);

	}//end main
	
	public static ArrayList<String> readValues() {
		
        ArrayList<String> values = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        
        System.out.println("Choose:\n"
        				 + "1 - To enter a String\n"
        				 + "0 - To quit");

        while (!quit) {
            System.out.print("Enter an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    sc.close();
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
	
	public static void saveObject(ISaveable objectToSave) {
		for(int i=0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
		}
	}
	
	public static void loadObject(ISaveable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}

}//end class
