
import java.util.Scanner;



public class Microsoft extends Conexion implements OperacionesConexion {

private boolean isCloud;
private int lenguajeConsultaOrrm;

private int PETICIONES_CONCURRENTES = 1500;


public boolean isCloud() {
	return isCloud;
}
public void setCloud(boolean isCloud) {
	this.isCloud = isCloud;
}
public int getLenguajeConsultaOrrm() {
	return lenguajeConsultaOrrm;
}
public void setLenguajeConsultaOrrm(int lenguajeConsultaOrrm) {
	this.lenguajeConsultaOrrm = lenguajeConsultaOrrm;
}


public Microsoft() {

}

public Microsoft (boolean isCloud, int lenguajeConsultaOrrm) {
	this.isCloud=isCloud;
	this.lenguajeConsultaOrrm=lenguajeConsultaOrrm;
}
Scanner leer=new Scanner(System.in);

Scanner leer1=new Scanner(System.in);
public void devolverCapacidadRespuesta(String SistemaOperativo, int CantidadDePeticiones, String Procesador) {


	System.out.println("1.Digite el sistema operativo:");
	SistemaOperativo=leer.nextLine();
	System.out.println("2.Digite la cantidad de peticiones:");
	CantidadDePeticiones=leer.nextInt();
	System.out.println("3.Digite el procesador");
	Procesador=leer1.nextLine();

	if (PETICIONES_CONCURRENTES<CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
		System.out.println("OPTIMO");
	}
if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
	System.out.println("PESIMO");
}
if (PETICIONES_CONCURRENTES==CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
	System.out.println("OPTIMO");
}
if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
	System.out.println("OPTIMO");
}


}

}