//	09.11.2021

import java.util.ArrayList;

public class UdemyGenerics {

	public static void main(String[] args) {
		
		//An ArrayList that DOES use Generics (because we specify the type that the ArrayList will hold; 'Integer')
		ArrayList<Integer> items1 = new ArrayList<Integer>();
		items1.add(1);
		items1.add(2);
		items1.add(3);
		//items1.add("Joshua");//This actually gives us an error as we're trying to add a STRING to an ArrayList of 'Integer' type. Unlike down below.
		items1.add(4);
		items1.add(5);
		
		//First Method of the two
		printsDoubled(items1);

		//An ArrayList that DOESN'T use Generics (because we don't specify the type)
		ArrayList items2 = new ArrayList();
		
		//This below uses autoboxing which converts the primitive type we pass into .add() into an Integer
		items2.add(1);
		items2.add(2);
		items2.add(3);
		//Since we didn't specify when creating the ArrayList what 'type' it would hold, this line here is valid. BUT if we leave as is, then the casting we do in the method below, will give us an error at runtime.
		//items.add("Joshua");
		items2.add(4);
		items2.add(5);
		
		//Second method of the two
		printDoubled(items2);
		
	}//end Main
	
	//For the first ArrayList
	private static void printsDoubled(ArrayList<Integer> n) {
		for(int i : n)//We specify here that 'i' will be of 'int' type for every object in 'n'
			System.out.println(i * 2);//No need for casting here unlike below.
	}
	
	//For the second ArrayList
	private static void printDoubled(ArrayList n) {
		for(Object i : n)//We use 'Object' here instead of specifying that each element in 'n' is of 'int' type
			System.out.println((Integer) i * 2);//Here, we have to cast it as 'Integer' since we didn't specify before
	}

}//end Class
