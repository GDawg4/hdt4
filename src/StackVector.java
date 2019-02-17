
import java.util.Vector;

/**
 * Clase que representa la implementacion de vector como un stack que extiende a la clase <p>
 * AbstractStack.
 * @author Andrea Elias
 * @author Rodrigo Garoz
 * @param <E> tipo generico o variable
 */
public class StackVector<E> extends AbstractStack<E>{
    protected Vector myVector;
    /**
     * Se construye un nuevo vector vacio.
     */
    public StackVector()
    {
        myVector=new Vector();
    }
     /**
         * post: el valor es agregado al vector
         * @param obj el objeto que se mete al vector
         */
    @Override
    public void push(E obj)
    {
        myVector.add(obj);
 
    }
    /**
         * pre: el stack no debe estar vacio<p>
         * post: el item mas recientemente metido al stack se saca primero.
        */
    @Override
    public E pop() {
        E p = null;
        if( !myVector.isEmpty()) {
        p = (E) myVector.lastElement();
         myVector.remove( myVector.size() - 1);
    }
    return p;
    }
    /**
         * pre: el vector no esta vacio
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
    public E peek() {
        return (E)myVector.lastElement();
    }
    /**
    * post: se retorna el numero de elementos en el vector
    * @return un entero
    */
    @Override
    public int size()
    {
    return myVector.size();
    }
}