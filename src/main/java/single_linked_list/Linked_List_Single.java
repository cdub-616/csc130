/*******************************************************************************
 *                       class Linked_List_Single                              *
 * Chris Wright                                                                *
 * Version 1.0.0  9/16/2022                                                    *
 *                                                                             *
 * This class constructs a single linked list.                                 *
 *                                                                             *
 * Linked_List_Single()                                                        *
 *    default constructor                                                      *
 * Linked_List_Single(String)                                                  *
 *    constructor                                                              *
 * String about()                                                              *
 *    Returns the author's name.                                               *
 * boolean isEmpty()                                                           *
 *    Returns true if the linked list is empty.                                *
 * void addHead(String)                                                        *
 *    Adds a node to the head of the linked list.                              *
 * void addTail(String)                                                        *
 *    Adds a node to the tail of the linked list.                              *
 * void removeHead()                                                           *
 *    Removes the head node of the linked list and returns a String.           *
 * String peekHead()                                                           *
 *    Returns the value in the head node.                                      *
 * boolean contains(String)                                                    *
 *    Returns true if the value is contained within the linked list.           *
 * void print()                                                                *
 *    Prints the values held within the linked list.                           *
 ******************************************************************************/

package single_linked_list;

public class Linked_List_Single {

   private Node_Single head,  //head node pointer
                       tail;  //tail node pointer
   
   Linked_List_Single() {
      Node_Single node = new Node_Single();
      head = node;  //point head at new node
      tail = node;  //point tail at new node
   }
   
   Linked_List_Single(String val) {
      Node_Single node = new Node_Single(val);
      head = node;  //point head at new node
      tail = node;  //point tail at new node
   }

   String about() {
      return "Chris Wright";
   }
   
   boolean isEmpty() {
      if (head == null)  //if the list is empty
         return true;
      else return false;
   }
   
   void addHead(String value) {
      Node_Single newNode = new Node_Single(value);
      if (isEmpty()) {    //if the list is empty
         head = newNode;  //point head at new node
         tail = newNode;  //point tail at new node
      }
      else
         newNode.next = head;  //new node points to old head
         head = newNode;       //head points to new node
   }
   
   void addTail(String value) {
      Node_Single newNode = new Node_Single(value);
      if (isEmpty()) {    //if the list is empty
         head = newNode;  //point head at new node
         tail = newNode;  //point tail at new node
      }
      else
         tail.next = newNode;  //old tail points to new node
         tail = newNode;       //tail points to new node
   }
   
   String removeHead() {
      String data;
      if (isEmpty()) {    //if the list is empty
         data = "";
         tail = null;
      }
      else data = head.value;
      head = head.next;  //move head to next node
      return data;
   }
   
   String peekHead() {
      return head.value;
   }
   
   boolean contains(String value) {
      return head.contains(value);
   }
   
   void print() {
      head.print();
   }
}
