
/**
 * Clase para las operaciones de la calculadora.
 * Rodrigo Garoz
 * Andrea Elias
 */

public class Calculadora 
	implements iCalculadora{
        static boolean INSTANCE_FLAG = false;
    
        /**
         * Constructor clase calculadora
         */
        //Se aplica el Singleton
        public Calculadora() throws SingletonException
        {
            if (INSTANCE_FLAG)
                throw new SingletonException("Solamente puede crear una instancia de Calculos."); 
            else
                INSTANCE_FLAG = true; //set flag for 1 instance
        }
        
            public void finalize()
        {
            INSTANCE_FLAG = false; //clear if destroyed 
        }
	/** 
	 * Metodo para hacer la suma de la calculadora
	 * @param a double - sumando
	 * @param b double - sumando
	 * @return Double - El resultado de la suma de a y b
	 */
        @Override
	public double sumar(double a, double b) {
		return a+b;
	}
	
	/** 
	 * Metodo para hacer la resta de la calculadora
	 * @param a double - 
	 * @param b double - 
	 * @return Double - El resultado de la resta entre a y b
	 */
        @Override
	public double restar(double a, double b) {
		return a-b;
	}
	
	/** 
	 * Metodo para hacer la multiplicacion de la calculadora
	 * @param a double - factor
	 * @param b double - factor
	 * @return Double - El resultado de la multiplicacion entre a y b
	 */
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	/** 
	 * Metodo para hacer la division de la calculadora
	 * @param a double - dividendo
	 * @param b double - divisor
	 * @return Double - El resultado de la division entre a y b
	 */
	public double dividir(double a, double b) {
		if(b != 0) {
			return a/b;
		}
		else {
			return 0;
		}
	}
}
