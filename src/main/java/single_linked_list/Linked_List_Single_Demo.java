/*******************************************************************************
 *                       Linked_List_Single_Demo                               *
 * Chris Wright                                                                *
 * Version 1.0.0  9/16/2022                                                    *
 *                                                                             *
 * This class demonstrates the Linked_List_Single class.                       *
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
	   
	   //test results for default constructor
	   Linked_List_Single defaultList = new Linked_List_Single();
	   System.out.println("Who wrote this program?");
	   //test results for about
	   System.out.println(defaultList.about());
	   System.out.println("This linked list uses the default constructor:");
	   //test results for print
	   defaultList.print();
	   System.out.println("I'm removing the head.  What was in it?");
	   //test results for removeHead
	   System.out.println(defaultList.removeHead());
	   System.out.println("Is the list empty now?");
	   System.out.println("False for nope and true for yep.");
	   //test results for isEmpty
	   System.out.println(defaultList.isEmpty());
	   System.out.println("Guess so.");
	   System.out.println();
	   
	   //test results for constructor
	   Linked_List_Single testList = new Linked_List_Single(one);
	   System.out.println("This linked list starts with a single node:");
	   testList.print();
	   System.out.println("Is the list empty this time?");
	   System.out.println(testList.isEmpty());
	   System.out.println("Let's add four nodes to the tail:");
	   //test results for addTail
	   testList.addTail(two);
	   testList.addTail(three);
	   testList.addTail(four);
	   testList.addTail(five);
	   testList.print();
	   System.out.println("It's time to add a node to the head:");
	   //test results for addHead
	   testList.addHead(six);
	   testList.print();
	   System.out.println("Hmmm.  That doesn't look right.");
	   System.out.println("I'll remove the head and print the value that " +
	      "used to be there.");
	   System.out.println(testList.removeHead());
	   System.out.println("What does the list look like now?");
	   testList.print();
	   System.out.println("Better...");
	   System.out.println("I think I'll add that node to the tail.");
	   testList.addTail(six);
	   testList.print();
	   System.out.println("Much Better!");
	   System.out.println("I forgot.  What value is in the head node?");
	   //test results for peekHead
	   System.out.println(testList.peekHead());
	   System.out.println("Oh yeah!");
	   System.out.println("Did I add a three to my linked list?");
	   System.out.println("False for nope and true for yep:");
	   //test results for contains
	   System.out.println(testList.contains("three"));
	   System.out.println("Cool! How about ten?");
	   System.out.println(testList.contains("ten"));
	   System.out.println("Guess not.  Have a nice day!");
	}
}
