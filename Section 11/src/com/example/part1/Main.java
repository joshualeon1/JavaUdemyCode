package com.example.part1;

//import sun.jvm.hotspot.opto.Node; You CANNOT have more than 1 type of Node imported
import org.w3c.dom.*;

import com.example.awtSample.MyWindow;

public class Main {

	public static void main(String[] args) {

		Node anotherNode = null;	//This one is fine due to the import and the one below uses the direct methodas it points to the actual package
		org.w3c.dom.Node node = null;//Instead of doing 'Node node = null;' and importing the package like on line 2, you can also do it as seen on this line (you don't want to keep writing this everytime you use it so import)
//		sun.jvm.hotspot.opto.Node anotherNode = null;  //Can't have more than one node as seen here, not allowed
		
		MyWindow myWindow = new MyWindow("Complete Java");
		myWindow.setVisible(true);
		
	}//end Main

}//end class
