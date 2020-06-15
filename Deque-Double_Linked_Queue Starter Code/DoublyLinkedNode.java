

/**
 * Represents a node in a linked list.
*/
public class DoublyLinkedNode<T>
{
    private DoublyLinkedNode<T> next;
    private DoublyLinkedNode<T> pre;
    private T element;
 
    /**
     * Creates an empty node.
     */
    public DoublyLinkedNode()
    {
        next = null;
        pre = null;
        element = null;
	}
 
    /**
     * Creates a node storing the specified element.
     * @param elem element to be stored
     */
    public DoublyLinkedNode(T elem)
    {
        next = null;
        pre = null;
        element = elem;
    }
 
    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public DoublyLinkedNode<T> getNext()
    {
        return next;
    }
 
    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(DoublyLinkedNode<T> node)
    {
        next = node;
    }
    
    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public DoublyLinkedNode<T> getPre()
    {
        return pre;
    }
 
    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setPre(DoublyLinkedNode<T> node)
    {
        pre = node;
    }
 
    /**
     * Returns the element stored in this node.
     * @return element stored at the node
     */
    public T getElement()
    {
        return element;
    }
 
    /**
     * Sets the element stored in this node.
     * @param elem element to be stored at this node
     */
    public void setElement(T elem)
    {
        element = elem;
    }

    /**
     * Returns the representative content of the element
     */
    public String toString(){
	return element.toString();
    }
}
