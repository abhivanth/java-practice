public interface List<T> {
    /**
     * Return the item at index i
     */
    T getItem(int i);

    /**
     * Insert item at index i. All other items after that are moved back one index.
     * Returns true, if item was inserted successfully.
     */
    boolean addItem(T item, int i);

    /**
     * Insert item at at the end of the list.
     * Returns true, if item was inserted successfully.
     */
    boolean addItem(T item);

    /**
     * Removes and returns the item at index i (or null, if the index was out of bounds).
     */
    T removeItem(int i);

    /**
     * Returns the number of elements currently in the list.
     */
    int length();

    /**
     * Returns if the list is full.
     * @return
     */
    boolean isFull();
}

