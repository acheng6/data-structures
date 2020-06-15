

/**
 * Deque, "Double-ended queue"
 * Deque is a queue allowing the insertion, removal, or viewing from either end of the queue.
 * 
 * The class DoublyLinkedDeque is a doubly linked list, consisting of a sequence of nodes. 
 * Each node is an instance of the DoublyLinkedNode class, which includes two references, 
 * one pointing to its previous node and the other to its next node. In such a way, 
 * the deque data structure can be viewed as the front-to-rear list and the rear-to-front list.
 * In each list, there are two references, head and tail. 
 * 
 * Let us call the head reference in the front-to-rear list as headInFront, and tail as tailInRear.
 * Let us call the head reference in the rear-to-front list as headInRear, and tail as tailInFront.
 * 
 * Adding or removing elements from the deque, we need to maintain both links and the 
 * corresponding references.
 * 
 * For example, there are a deque as follows, including three nodes, N1, N2, and N3.
 *                 ------    ------    ------
 * headInFront --> | N1 |--> | N2 |--> | N3 |<-- tailInRear
 * tailInFront --> |    |<-- |    |<-- |    |<-- headInrear
 *                 ------    ------    ------
 * When we add a new element N4 in the front, we have
 *                 ------    ------    ------    ------
 * headInFront --> | N4 |--> | N1 |--> | N2 |--> | N3 |<-- tailInRear
 * tailInFront --> |    |<-- |    |<-- |    |<-- |    |<-- headInrear
 *                 ------    ------    ------    ------
 *  
 * When we add a new element N4 in the rear, we have
 *                 ------    ------    ------    ------
 * headInFront --> | N1 |--> | N2 |--> | N3 |--> | N4 |<-- tailInRear
 * tailInFront --> |    |<-- |    |<-- |    |<-- |    |<-- headInrear
 *                 ------    ------    ------    ------
 *    
 * When we remove an element in the front, we have
 *                 ------    ------
 * headInFront --> | N2 |--> | N3 |<-- tailInRear
 * tailInFront --> |    |<-- |    |<-- headInrear
 *                 ------    ------
 *   
 * When we remove an element in the rear, we have
 *                 ------    ------
 * headInFront --> | N1 |--> | N2 |<-- tailInRear
 * tailInFront --> |    |<-- |    |<-- headInrear
 *                 ------    ------
 *                                  
 * @author ITCS2214, UNCC
 *
 * @param <T>
 */

import java.util.*;

public class DoublyLinkedDeque<T> implements DequeInterface<T> {

    private int count;  // The count variable
    private DoublyLinkedNode<T> headInFront; // Head reference in the front of the queue
    private DoublyLinkedNode<T> tailInFront; // Tail reference in the front of the queue
    private DoublyLinkedNode<T> headInRear; // Head reference in the rear of the queue
    private DoublyLinkedNode<T> tailInRear; // Tail reference in the rear of the queue
    
    public DoublyLinkedDeque(){// Constructor, iniatializing an empty linked queue
        count = 0;
        headInFront = tailInFront = headInRear = tailInRear = null;
    }

    // Add an element to the front of this queue.
    public void enqueueFront(T element){
        // Create a new node
        DoublyLinkedNode<T> newnode = new DoublyLinkedNode<T>(element);

        if (isEmpty()){
        	// TODO Change all front and rear in both ends to be the new node
        	
        } else {
            // maintain the head-to-tail linked list by operating on the head reference in the front of the queue
            newnode.setNext(headInFront);
            headInFront = newnode;
            
            // TODO maintain the tail-to-head linked list by operating on the tail reference in the front of the queue (two statements are missing)

        }
        count++;
    }

    // Add an element to the rear of this queue.
    public void enqueueRear(T element){
    	// Create a new node
        DoublyLinkedNode<T> newnode = new DoublyLinkedNode<T>(element);

        if (isEmpty()){
        	// Change all front and rear in both ends to be the new node
        	headInFront = tailInFront = headInRear = tailInRear = newnode;
        } else {
        	// TODO Maintain the tail-to-head linked list by operating on the head reference in the rear of the queue (two statements are missing)

            
            // Maintain the head-to-tail linked list by operating on the tail reference in the rear of the queue
            tailInRear.setNext(newnode);
            tailInRear = newnode;
        }
        count++;
    }

    
    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.
    public T dequeueFront() throws QueueUnderflowException{
    	if (isEmpty())
    		throw new QueueUnderflowException("Deque is empty!");
    	
        // Retrieve the to-be-removed node
    	DoublyLinkedNode objNode = headInFront;

        // Move the head reference to its next
    	headInFront = headInFront.getNext();

        // Decrease the number of nodes in the deque
    	count--;

        // TODO Maintain the other references, tailInRear, headInRear, and tailInFront
        //      The if-else statement and assignment statement are missing
    	
    	
	// TODO return the data element of the to-be-removed node (one statement is missing)
    	
    }
    
    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes rear element from this queue and returns it.
    public T dequeueRear() throws QueueUnderflowException{
    	if (isEmpty())
    		throw new QueueUnderflowException("Deque is empty!");
    	
	// TODO Retrieve the to-be-removed node (one statement is missing)


        // TODO Move the head reference to its next (one statement is missing)


        // Decrease the number of nodes in the deque
    	count--;

        // Maintain the other references, tailInFront, headInFront, and headInRear
    	if (tailInRear == null){
    		tailInFront = headInFront = null;
    	}else
    		tailInRear.setNext(null);
    	headInRear = tailInRear;
    	
	// return the data element of the to-be-removed node
	return (T)(objNode.getElement());
    }

    // Returns true if this queue is empty; otherwise, returns false.
    public boolean isEmpty(){
    	if (count == 0 || tailInRear == null || headInRear == null || tailInFront == null || headInFront == null)
    		return true;
    	else
    		return false;
    }
    
    // Returns the number of elements in this queue.
    public int size(){
    	return count;
    }

    public void printDeque(){
    	System.out.println("Head-to-tail list: ");
    	printLinkedList(headInFront, true);
    	
    	System.out.println("Tail-to-head list: ");
    	printLinkedList(headInRear, false);
    }
    
    private void printLinkedList(DoublyLinkedNode start, boolean isHead2Tail){
    	if (start == null) return;
    	
        boolean isFirst = true;
    	DoublyLinkedNode p = start;
    	while (p != null){
                if (isFirst){
    		    System.out.print(p.getElement().toString());
                    isFirst = false;
                }else
    		    System.out.print("-->" + p.getElement().toString());
    		if (isHead2Tail)
    		    p = p.getNext();
    		else
    			p = p.getPre();
    	}
        System.out.println();
    }
    public static void main(String[] argv){
    	DoublyLinkedDeque deque = new DoublyLinkedDeque();
    	Scanner sc = new Scanner(System.in);
        int choice = -1;
        boolean isExit = false;
        String data;

	try{
	    do{
	        System.out.println("We provide the following operations on the Deque data structure:");
	        System.out.println("1) enqueue in the front");
	        System.out.println("2) enqueue in the rear");
	        System.out.println("3) dequeue in the front");
	        System.out.println("4) dequeue in the rear");
	        System.out.println("5) quit");
	        System.out.print("\nPlease choose an operation: ");  
                choice = sc.nextInt();

                switch (choice){
                    case 1: System.out.print("Please input your text-based data: ");
                        data = sc.next();
                        deque.enqueueFront(data);
                        break;
                    case 2: System.out.print("Please input your text-based data: ");
                        data = sc.next();
                        deque.enqueueRear(data);
                        break;
                    case 3: deque.dequeueFront();
                        break;
                    case 4: deque.dequeueRear();
                        break;
                    case 5: isExit = true;
                        break;
                    default: System.out.println("Wrong choice!");
                }

            } while (! isExit);
           deque.printDeque();
        } catch (Exception ex){
              if (ex instanceof QueueUnderflowException)
                 System.out.println(ex.getMessage());
        }
    }
}
