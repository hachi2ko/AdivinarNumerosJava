import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	Scanner s = new Scanner(System.in);
    	int r = (int) (Math.random() * 100 + 1);
	int n = 0;
	int i = 0;

        public void Adivinar(){
	    try {
	    System.out.print("Adivina el numero aleatorio: ");
	    n = s.nextInt();
	    i++;

	    if (n != r) {
	        if (n < r) {
		    System.out.println("Tú numero es menor");
		    Adivinar();
		} else if (n > r) {
		           System.out.println("Tú numero es mayor");
			   Adivinar();
		}
	    } else {
	            System.out.println("Acertaste el numero, el cual era: " + r);
		    System.out.println("Conseguido en " + i + " intentos");
	    }
	    } catch (InputMismatchException e) {
	             System.out.println("Error debe ser un numero");
	    } catch (Exception e) {
	    	     System.out.println("Error fatal en la ejecucion de la aplicacion");
	    }
	
	}
}
