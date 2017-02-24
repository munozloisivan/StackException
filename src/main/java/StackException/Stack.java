package StackException;

/**
 * Created by ivanm on 22/02/2017.
 */
public interface Stack<E> {

    void push(E e) throws FullStackException;
    E pop() throws EmptyStackException;  //devuelves / sacas un Elemento
    int size();
}

