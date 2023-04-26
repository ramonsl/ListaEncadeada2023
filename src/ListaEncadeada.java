public interface ListaEncadeada {

    boolean	add(Elemento e); //Appends the specified element to the end of this list.
    void	add(int index, Elemento element); //Inserts the specified element at the specified position in this list.
    void	addFirst(Elemento e); //Inserts the specified element at the beginning of this list.
    void	addLast(Elemento e); //Appends the specified element to the end of this list.
    void	clear(); //Removes all of the elements from this list.
    Elemento	get(int index) ;//Returns the element at the specified position in this list.
    Elemento	getFirst(); //Returns the first element in this list.
    Elemento	getLast();// Returns the last element in this list.
    int	indexOf(Object o);// Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    Elemento	remove(); //Retrieves and removes the head (first element) of this list.
    Elemento	remove(int index);//Removes the element at the specified position in this list.
    boolean	remove(Object o);// Removes the first occurrence of the specified element from this list, if it is present.
    Elemento	removeFirst();// Removes and returns the first element from this list.
    Elemento	removeLast(); //Removes and returns the last element from this list.
    int	size(); //Returns the number of elements in this list.

}
