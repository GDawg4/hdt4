
import java.util.ArrayList;

/**
 * Clase que representa la implementacion de arraylist como un stack que extiende a la clase <p>
 * AbstractStack.
 * @author Andrea Elias
 * @author Rodrigo Garoz
 *  @param <E> tipo generico o variable
 */
public class StackArrayList<E> extends AbstractStack<E>{
    protected ArrayList<E> data;
        /**
         * post: construye un nuevo stack vacia.
         */
	public StackArrayList()
	{
		data = new ArrayList<E>();
	}
        /**
         * post: el valor es agregado al stack
         * @param item el elemento
         */
    @Override
	public void push(E item)	{
		data.add(item);
	}
        /**
         * pre: el stack no debe estar vacio<p>
         * post: el item mas recientemente metido al stack se saca primero.
        */
    @Override
	public E pop()	{
		return data.remove(size()-1);
	}
        /**
         * pre: el stack no esta vacio
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
	public E peek()	{
		return data.get(size() - 1);
	}
        /**
         * post: se retorna el numero de elementos del stack
         * @return un entero
         */
    @Override 
    public int size()
    {
        return data.size();
    }
}
