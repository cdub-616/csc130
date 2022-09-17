/*******************************************************************************
 *                       class Linked_List_Single                              *
 * Chris Wright                                                                *
 * 9/16/2022                                                                   *
 *                                                                             *
 * This class constructs a single linked list.                                 *
 *                                                                             *
 * Linked_List_Single()                                                        *
 *    default constructor                                                      *
 * Linked_List_Single(String)                                                  *
 *    constructor                                                              *
 * String about()                                                              *
 *    Returns the author's name.                                               *
 * void addHead(String)                                                        *
 *    Adds a node to the head of the linked list.                              *
 * void addTail(String)                                                        *
 *    Adds a node to the tail of the linked list.                              *
 * void removeHead()                                                           *
 *    Removes the head node of the linked list and returns an empty String.    *
 * String peekHead()                                                           *
 *    Returns the value in the head node.                                      *
 * boolean contains(String value)                                              *
 *    Returns true if the value is contained within the linked list.           *
 * void print()                                                                *
 *    Prints the values held within the linked list.                           *
 ******************************************************************************/

package single_linked_list;

public class Linked_List_Single {

   private Node_Single head,  //head pointer
                       tail;  //tail pointer
   
   Linked_List_Single() {
      Node_Single node = new Node_Single();
      head = node;
      tail = node;
   }
   
   Linked_List_Single(String val) {
      Node_Single node = new Node_Single(val);
      head = node;
      tail = node;
   }

   String about() {
      return "Chris Wright";
   }
   
   void addHead(String value) {
      Node_Single newNode = new Node_Single(value);
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else
         newNode.next = head;  //new node points to old head
         head = newNode;       //head points to new node
   }
   
   void addTail(String value) {
      Node_Single newNode = new Node_Single(value);
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else
         tail.next = newNode;  //old tail points to new node
         tail = newNode;       //tail points to new node
   }
   
   String removeHead() {
      String data = head.value;
      head = head.next;  //moves head to next node
      if (head == null) 
         tail = null;
      return data;
   }
   
   String peekHead() {
      return head.value;
   }
   
   boolean contains(String value) {
      return head.contains(head, value);
   }
   
   void print() {
      head.print(head);
   }
}
