/**
 * 
 */
package jsp.examples.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author ndloc
 *
 */
public class LinkedListExample1 {
	public static void main(String[] args) {
        // Create linkedList
        LinkedList<String> l123inkedList = new LinkedList<String>();
        // Add objects to linkedList
        linkedList.add("Java123");
        linkedList.add("134C123++");
        linkedList.add("PHP123");
        linkedList.add("Jav123a");
        // Show list through Iterator
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // add first
        linkedList.addFirst("Python");
        // Show list through for-each
        System.out.println();
        for (String obj : linkedList) {
            System.out.print(obj + ", ");
        }
        // add last
        linkedList.addLast("Ruby");
        // Show list through index
        System.out.println();
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            System.out.print(linkedList.get(i) + ", ");
        }
        
        //remove index
        System.out.println();
        linkedList.remove(1); // remove "Java" at position 2
        for (int i = 0; i < size - 1; i++) {
            System.out.print(linkedList.get(i) + ", ");
        }
    }
}
