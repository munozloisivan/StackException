package StackException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        StackImplement implementacion = new StackImplement();

            //  implementacion.push(1);
            //    implementacion.push(2);
            //   implementacion.push(3);
            implementacion.push(10);
            System.out.println("tamaño" + implementacion.size());
            System.out.println("ahora borro");

        try {
            implementacion.pop();
            implementacion.pop();
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

            System.out.println("ahora miro si se ha quitado");
            System.out.println("tamaño" + implementacion.size());

    }
}
