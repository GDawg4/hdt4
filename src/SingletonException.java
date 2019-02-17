/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase que crea la excepcion del patron de diseño de Singleton.
 * @author Andrea Elias
 * Rodrigo Garoz
 */
public class SingletonException extends RuntimeException{
    public SingletonException()
    {
        super(); 
    }
//----------------------------------------------- 
    public SingletonException(String s)
    {
        super(s); 
    }
    
}
