//	08.22.2021

package AbstractClasses.Challenge;

public abstract class ListItem {
	
	//Used the keyword 'protected' in order to allow other subclasses to have access to them WIHTIN THE SAME PACKAGE (so other classes OUTSIDE of this package doesn't have access to it)
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	
	protected Object value;

	public ListItem(Object value) {
		this.value = value;
	}
	
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	
	abstract int compareTo(ListItem item);

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
