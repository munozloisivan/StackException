package StackException;

import org.omg.CORBA.SystemException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanm on 22/02/2017.
 */
public class StackImplement<E> implements Stack<E> {

    public List<E> stack = new ArrayList<E>();

    public void push(E e) {
        stack.add(e);
    }

    public E pop() throws EmptyStackException{
        if (stack.size() <= 0) {
            throw new EmptyStackException();
        }
        else {
            E e = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return e;
        }
    }

    public int size() {
        int size = stack.size();
        return size;
    }
}
