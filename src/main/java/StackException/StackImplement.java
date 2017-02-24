package StackException;

import org.omg.CORBA.SystemException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanm on 22/02/2017.
 */
public class StackImplement<E> implements Stack<E> {

    public E[]stack;
    public int tamVector;

    public StackImplement(){

        this.tamVector = 0;
        stack = (E[]) new Object[4];

    }

    public void push(E e) throws FullStackException {
        if (tamVector >= 4){
            throw new FullStackException();
        }
        else {
            stack[tamVector] = e;
            tamVector++;
        }
    }

    public E pop() throws EmptyStackException{
        if (tamVector <=0) {
            throw new EmptyStackException();
        }
        else {
            E e = stack[tamVector-1];
            tamVector--;
            return e;
        }
    }

    public int size() {
        return tamVector;
    }
}
