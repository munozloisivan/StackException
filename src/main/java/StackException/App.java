package StackException;

public class App
{
    public static void main( String[] args ){
        StackImplement implementacion = new StackImplement();

        try {
            implementacion.push(1);
            implementacion.push(2);
            implementacion.push(3);
            implementacion.push(10);
            System.out.println("tamaño antes de reventarla: "+implementacion.size());
            System.out.println("Intento añadir uno mas aver si salta excepcion");
            implementacion.push(15);
            System.out.println("tamaño" + implementacion.size());
        }
        catch (FullStackException e){
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("ahora la vacio");
            implementacion.pop();
            implementacion.pop();
            implementacion.pop();
            implementacion.pop();
            System.out.println("tendria que saltar ahora la excepcion");
            implementacion.pop();
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("tamaño" + implementacion.size());

    }
}
