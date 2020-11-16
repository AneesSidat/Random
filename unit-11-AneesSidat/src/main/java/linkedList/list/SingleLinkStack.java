package linkedList.list;

import linkedList.node.SingleLinkNode;

/**
 * Implementation of a basic LIFO data structure
 *
 * @param <T> the type of object to be stored in this stack.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class SingleLinkStack<T> extends BasicList<SingleLinkNode<T>,T> implements Stack<T>
{
  /**
   * Push a new element to the stack.
   * The root should point to the new element.
   * The pointer from the new root should point to the old root.
   *
   * @param value the value to be pushed to the stack.
   */
  public void push(T value) {
    setRoot(new SingleLinkNode<T>(value,getRoot()));
    size++;
  }

  /**
   * Pop a value from the stack.
   * @return the top value on the stack.
   * @throws ListAccessError if the stack is empty (there is nothing to pop).
   */
  public T pop() throws ListAccessError {
    if (isEmpty()) throw new ListAccessError("Pop from an empty stack");
    T value = getRoot().getValue(); // get the top value
    setRoot(getRoot().getNext()); // update {\tt top} to point to next node
    size--;
    return value; // return the original top value
  }

  /**
   * Populate this stack from an array.  If the stack is currently empty, the populated stack will be
   * equivalent to the array - it will contain exactly the same elements in the same order.  If the stack is
   * not initially empty the original elements of the stack will appear after the copy of the array.
   */
  public SingleLinkStack<T> fromArray(T[] array) throws ListAccessError {
    for (int index = array.length-1; index >= 0; index--) {
      push(array[index]);
    }
    return this;
  }

}
