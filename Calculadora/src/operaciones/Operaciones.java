package operaciones;
public class Operaciones{
	/*
	 * @author:kaiet barayazarra
	 * @version:1.0
	 */
	/*
	 * @param suma de los valores
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /*
	 * @param resta de los valores
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /*
   	 * @param multiplicador de los valores
   	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /*
   	 * @param divisor de los valores
   	 */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /*
   	 * @param resta de los valores
   	 */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}