import java.util.Scanner;

//  HERENCIA

public class Oracle extends Conexion implements OperacionesConexion{
	
//  ATRIBUTOS
	private boolean plsql;
	private int cantidadDeUsuariosPermitidos;
	
	//  CONSTANTES
	private int PETICIONES_CONCURRENTES = 1000;
	
	// 
	
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
		
		
		System.out.println("Digite el sistema operativo:");
		SistemaOperativo=leer.nextLine();
		System.out.println("Digite la cantidad de peticiones:");
		CantidadDePeticiones=leer.nextInt();
		System.out.println("Digite el procesador");
		Procesador=leer.nextLine();
		
		
		if (PETICIONES_CONCURRENTES==CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
			System.out.println("OPTIMO");
		}
		if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
			System.out.println("OPTIMO");
		}
	
	}

	// CONSTRUCTOR POR DEFECTO VACIO
	public Oracle() {
		
	}
	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Oracle(boolean plsql, int cantidadDeUsuariosPermitidos) {
		this.plsql=plsql;
		this.cantidadDeUsuariosPermitidos=cantidadDeUsuariosPermitidos;
	}
}
