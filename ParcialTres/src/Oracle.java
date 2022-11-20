
import java.util.Scanner;



public class Oracle extends Conexion implements OperacionesConexion{


	private boolean plsql;
	private int cantidadDeUsuariosPermitidos;
	
	private int PETICIONES_CONCURRENTES = 1000;
	

	public boolean isPlsql() {
		return plsql;
	}
	public void setPlsql(boolean plsql) {
		this.plsql = plsql;
	}
	public int getCantidadDeUsuariosPermitidos() {
		return cantidadDeUsuariosPermitidos;
	}
	public void setCantidadDeUsuariosPermitidos(int cantidadDeUsuariosPermitidos) {
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}

	public void devolverCapacidadRespuesta(String SistemaOperativo, int CantidadDePeticiones, String Procesador) {

		Scanner leer=new Scanner(System.in);

		Scanner leer1=new Scanner(System.in);
		System.out.println("Digite el sistema operativo:");
		SistemaOperativo=leer.nextLine();
		System.out.println("Digite la cantidad de peticiones:");
		CantidadDePeticiones=leer.nextInt();
		System.out.println("Digite el procesador");
		Procesador=leer1.nextLine();


		if (PETICIONES_CONCURRENTES==CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
			System.out.println("OPTIMO");
		}
		if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
			System.out.println("OPTIMO");
		}
		
		
		if (PETICIONES_CONCURRENTES<CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
			System.out.println("OPTIMO");
		}

	    if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
		    System.out.println("PESIMO");
	    }
		

	}
	
	
	public Oracle() {

	}
	
	public Oracle(boolean plsql, int cantidadDeUsuariosPermitidos) {
		this.plsql=plsql;
		this.cantidadDeUsuariosPermitidos=cantidadDeUsuariosPermitidos;
	}
}