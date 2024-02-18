//	08.16.2021
//	We will inherit from this 'Abstract' class and let us define behaviors that are necessary without specifying how they ought to be performed

package AbstractClasses;

public abstract class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void breath();
	
	public String getName() {
		return name;
	}
	
}//end Class
