import java.util.Scanner;

//  HERENCIA 

public class Microsoft extends Conexion implements OperacionesConexion {
	//  ATRIBUTOS
private boolean isCloud;
private int lenguajeConsultaOrrm;

// P CONSTANTES

private int PETICIONES_CONCURRENTES = 1500;

//GET Y SETTER 

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
// CONSTRUCTOR POR DEFECTO VACIO

public Microsoft() {
	
}
// CONSTRUCTOR CON TODOS LOS ATRIBUTOS 
public Microsoft (boolean isCloud, int lenguajeConsultaOrrm) {
	this.isCloud=isCloud;
	this.lenguajeConsultaOrrm=lenguajeConsultaOrrm;
}
Scanner leer=new Scanner(System.in);

//METODO DE OPERCIONES 
public void devolverCapacidadRespuesta(String SistemaOperativo, int CantidadDePeticiones, String Procesador) {
	
	// PUNTO 19
	System.out.println("1.Digite el sistema operativo:");
	SistemaOperativo=leer.nextLine();
	System.out.println("2.Digite la cantidad de peticiones:");
	CantidadDePeticiones=leer.nextInt();
	System.out.println("3.Digite el procesador");
	Procesador=leer.nextLine();
	
	if (PETICIONES_CONCURRENTES<CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
		System.out.println("OPTIMO");
	}
	


if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
	System.out.println("PESIMO");
}
	
	
}

}





