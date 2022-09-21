/*******************************************************************************
 *                       class Node_Single                                     *
 * Chris Wright                                                                *
 * Version 1.0.0  9/16/2022                                                    *
 *                                                                             *
 * This class constructs a node for use in single linked lists.                *
 *                                                                             *
 * Node_Single()                                                               *
 *    default constructor                                                      *
 * Node_Single(String)                                                         *
 *    constructor                                                              *
 * boolean contains(String)                                                    *
 *    Uses an unnecessary recursive call to traverse a linked list.  Returns   *
 *    true if the String is contained within the linked list.                  *
 * void print()                                                                *
 *    Uses an unnecessary recursive call to traverse a linked list and prints  *
 *    the value at each node.                                                  *
 ******************************************************************************/

package single_linked_list;

public class Node_Single {

   Node_Single next;  //next node in linked list
   String value;      //value of data in node
   
   Node_Single() {
      this.value = "empty";
      this.next = null;
   }
   
   Node_Single(String val){
      this.value = val;
      this.next = null;
   }
   
   boolean contains(String val) {
      if (this.value == val)              //if value is in node
         return true;
      else if (this.next != null)         //if value isn't in node and there's
         return this.next.contains(val);  //  another node in linked list
      else return false;                  //if value is in none of the nodes
   }
   
   void print() {
      System.out.println(this.value);
      if (this.next != null)  //if there's another node in linked list
         this.next.print();   //print next one
   }
}