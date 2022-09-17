/*******************************************************************************
 *                       class Node_Single                                     *
 * Chris Wright                                                                *
 * 9/16/2022                                                                   *
 *                                                                             *
 * This class demonstrates the Linked_List_Single class.                       *
 *                                                                             *
 ******************************************************************************/

package single_linked_list;

public class Linked_List_Single_Demo {

	public static void main(String[] args) {
		
	   String one = "one",
			  two = "two",
			  three = "three",
			  four = "four",
			  five = "five",
			  six = "six";
	   
	   Linked_List_Single defaultList = new Linked_List_Single();
	   System.out.println("This linked list uses the default constructor:");
	   defaultList.print();
	   
	   Linked_List_Single testList = new Linked_List_Single(one);
	   System.out.println("This linked list starts with a single node:");
	   testList.print();
	   System.out.println("Let's add four nodes to the tail:");
	   testList.addTail(two);
	   testList.addTail(three);
	   testList.addTail(four);
	   testList.addTail(five);
	   testList.print();
	   System.out.println("It's time to add a node to the head:");
	   testList.addHead(six);
	   testList.print();
	   System.out.println("Hmmm.  That doesn't look right.");
	   testList.removeHead();
	   testList.print();
	   System.out.println("Better...");
	   testList.addTail(six);
	   testList.print();
	   System.out.println("Much Better!");
	   System.out.println("I forgot.  What value is in the head node?");
	   System.out.println(testList.peekHead());
	   System.out.println("Oh yeah!");
	   System.out.println("Did I add a three to my linked list?");
	   System.out.println("False for nope and true for yep:");
	   System.out.println(testList.contains("three"));
	   System.out.println("Cool! How about ten?");
	   System.out.println(testList.contains("ten"));
	   System.out.println("Guess not.  Have a nice day!");
	}

}
