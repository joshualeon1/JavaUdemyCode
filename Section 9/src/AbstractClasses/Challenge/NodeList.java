//	08.22.2021

package AbstractClasses.Challenge;

public interface NodeList {
	ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
