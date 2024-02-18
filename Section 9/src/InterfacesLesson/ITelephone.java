//	08.06.2021

package InterfacesLesson;

public interface ITelephone {
	
	//These below are called signatures
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
	
}//end ITelephone
