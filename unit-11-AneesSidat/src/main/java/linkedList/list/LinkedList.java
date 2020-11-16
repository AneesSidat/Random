package linkedList.list;

import linkedList.node.ListNode;

/**
 * Basic interface for linear lists.
 * This interface will be extended to define stacks, queues and lists
 * 
 * @author Hugh Osborne 
 * @version October 2019
 *
 * @param <T> the type of object in this list
 * @param <N> the type of node used in this list
 */

public interface LinkedList<N extends ListNode<T>,T>
{
    /**
     * Report if the list is empty
     * @return (list is empty)
     */
    public boolean isEmpty();

    /**
     * Get the size of this list.
     * @return the number of elements in this list.
     */
    public int size();

    /**
     * Get a String representation of this list.
     * @return a comma separated String list representation of this list.
     */
    public String toString();

    /**
     * Create an array equivalent to this list - i.e. with exactly the same elements in the same order.
     * @param cl the class of object in the list.
     * @return an array containing the same elements as this list, in the same order as in the list.
     */
    public T[] toArray(Class<? extends T> cl);

    /**
     * Populate this list from an array.  If the list is currently empty, the populated list will be
     * equivalent to the array - it will contain exactly the same elements in the same order.  If the list is
     * not initially empty the original elements of the list will appear after the copy of the array.
     * @param array the array of values to be added to the list.
     * @return this list, but now with the values from the array prepended to the list in the order in which they
     * appear in the array.
     * @throws ListAccessError <i>Shouldn't happen</i>.
     * The method has to be defined to possibly throw a ListAccessError as the methods defined in implementing
     * classes to add entries to the list have to be defined to throw this exception if they are misused.
     * Proper implementations of fromArray should, of course, <i>not</i> misuse these methods, so this exception
     * should never be thrown here.
     */
    public LinkedList<N,T> fromArray(T[] array) throws ListAccessError;
}
