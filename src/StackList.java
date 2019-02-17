

/**
 * Clase que organiza las implementaciones de lista y que estiende a abstractlist.
 * @author Andrea Elias
 * Rodrigo Garoz
 * @param <E> tipo generico o variable
 */
public class StackList <E> extends AbstractStack<E>{
    private iLista<String> list;
    private iLista<String> listc;
    /**
     * constructor que construye ya sea una lista simplemente encadenada,<p>
     * una doblemente encadenada o una cicular.
     * @param tipo un string que indica el tipo delista a construir
     */
    public StackList(String tipo)
    {
        if (tipo.equals("Simplemente encadenada"))
        {
            list = new SinglyLinkedList<>();
        }
        if (tipo.equals("Doblemente encadenada"))
        {
            list = new DoublyLinkedList<>();
        }
        if (tipo.equals("Lista Circular"))
        {
            listc = new CircularLinkedList<String>();
        }
    }
    /**
         * post: el valor es agregado a la lista
         * @param item el elemento
         */
    @Override
    public void push(E item) {
        list.addLast((String) item);
    }
    /**
         * pre: la lista no esta vacia
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
    public E peek()
    {
        return (E) list.peek();
    }
    
    /**
         * pre: la lista no debe estar vacia<p>
         * post: el item mas recientemente metido a la lista se saca primero.
        */
    @Override
    public E pop() {
        E value = (E)list.peek();
        list.removeLast();
        return value;
    }
}
