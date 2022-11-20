
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Microsoft mc =new Microsoft();
		Oracle or =new Oracle();


		Scanner leer = new Scanner(System.in);
		int opcion;
       	boolean salir = false;
   		System.out.println("Ingrese la baso de datos que quiere entrar:");

       		do {
       		System.out.println("el numero 1 Microsoft");
       		System.out.println("el numero 2 Oracle");
       		System.out.println("el numero 3 para salir del sistema");

       		opcion = leer.nextInt();

       		switch(opcion) {
       			case 1:
       			mc.devolverCapacidadRespuesta(null, opcion, null);
       			break;
            	case 2:
                or.devolverCapacidadRespuesta(null, opcion, null);
            	break;
             	case 3:
             	System.out.println("saliendo");
             	salir=true;
             	break;
       		}
       	} while(!salir);


	}

}