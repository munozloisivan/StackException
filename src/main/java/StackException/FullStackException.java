package StackException;

/**
 * Created by ivanm on 22/02/2017.
 */
public class FullStackException extends Exception{

    public FullStackException(){
        super("La pila esta llena");
    }
}
