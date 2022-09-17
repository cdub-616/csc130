/*******************************************************************************
 *                       class Node_Single                                     *
 * Chris Wright                                                                *
 * 9/16/2022                                                                   *
 *                                                                             *
 * This class constructs a node for use in single linked lists.                *
 *                                                                             *
 * Node_Single()                                                               *
 *    default constructor                                                      *
 * Node_Single(String)                                                         *
 *    constructor                                                              *
 * boolean contains(Node_Single, String)                                                    *
 *    Uses an unnecessary recursive call to traverse a linked list.  Returns   *
 *    true if the String is contained within the linked list.                  *
 * void print(Node_Single)                                                                *
 *    Uses an unnecessary recursive call to traverse a linked list and prints  *
 *    the value at each node.                                                  *
 ******************************************************************************/

package single_linked_list;

public class Node_Single {

   Node_Single next;     //the next node pointed at
   String value;         //the value of the data in the node
   
   Node_Single() {
      this.value = "empty";
      this.next = null;
   }
   
   Node_Single(String val){
      this.value = val;
      this.next = null;
   }
   
   boolean contains(Node_Single node, String val) {
      Node_Single current = node;
      if (current.value == val) 
         return true;
      else if (current.next != null) {
         return contains(current.next, val);   //recursive call
      }
      else return false;
   }
   
   void print(Node_Single node) {
      Node_Single current = node;
      System.out.println(current.value);
         if (current.next != null) {
            print(current.next);         //recursive call
         }
      }
}
