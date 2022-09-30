package co.gov.mintic.ciclo3.proyectoIngresoEgreso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoIngresoEgresoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoIngresoEgresoApplication.class, args);
//		int dato;
//		Scanner seleccion = new Scanner(System.in);
//		System.out.println("BIENVENIDO SELECCIONA UNA DE LAS OPCIONES A CONTINUACION\n"
//						+ "1. Crear empresa\n"
//						+ "2. Crear empleado\n"
//						+ "3. Nuevo movimiento de dinero");
//		dato = seleccion.nextInt();
//		empresa empresa = new empresa();
//		empleado employed = new empleado();
//		movimientoDinero dinero = new movimientoDinero();
//		switch (dato) {
//			case 1:
//				empresa.setNombreEmpresa();
//				empresa.setDireccion();
//				empresa.setTelefono();
//				empresa.setNIT();
//				empresa.setIdAdministrador();
//				System.out.println(empresa.toString());
//				break;
//			case 2:
//				employed.setNombreEmpleado();
//				employed.setCorreo();
//				employed.setEmpresaPerteneciente();
//				employed.setIdEmpleado();
//				System.out.println(employed.toString());
//				break;
//			case 3:
//				dinero.setMontoMovimiento();
//				dinero.setMontoPositivo();
//				dinero.setMontoNegativo();
//				dinero.setIdEmpleadoMovimiento();
//				System.out.println(dinero.toString());
//				break;
//			default:
//				System.out.println("opcion no valida reincie el programa");
//				break;
//
//		}
//		int opcion;
//		Scanner seleccion1 = new Scanner(System.in);
//		System.out.println("DESEA REALIZAR ALGUN CAMBIO A LA INFORMACION ADICIONADA\n"
//				+ "1. SI\n"
//				+ "2. NO\n");
//		 opcion= seleccion1.nextInt();
//
//		switch (opcion) {
//			case 1:
//				int sel;
//				Scanner seleccion2 = new Scanner(System.in);
//				System.out.println("DONDE DESEA GENERAR LOS CAMBIOS?\n"
//						+ "1. EMPRESA\n"
//						+ "2. EMPLEADO\n"
//						+ "3. MOVIMIENTOS");
//				sel = seleccion2.nextInt();
//				switch (sel) {
//					case 1:
//						System.out.println("DATOS ANTIGUOS");
//						System.out.println(empresa.toString());
//						empresa.setNombreEmpresa();
//						empresa.setDireccion();
//						empresa.setTelefono();
//						empresa.setNIT();
//						empresa.setIdAdministrador();
//						System.out.println(empresa.toString());
//						break;
//					case 2:
//						System.out.println("DATOS ANTIGUOS");
//						System.out.println(employed.toString());
//						employed.setNombreEmpleado();
//						employed.setCorreo();
//						employed.setEmpresaPerteneciente();
//						employed.setIdEmpleado();
//						System.out.println(employed.toString());
//						break;
//					case 3:
//						System.out.println("DATOS ANTIGUOS");
//						System.out.println(dinero.toString());
//						dinero.setMontoMovimiento();
//						dinero.setMontoPositivo();
//						dinero.setMontoNegativo();
//						dinero.setIdEmpleadoMovimiento();
//						System.out.println(dinero.toString());
//						break;
//					default:
//						System.out.println("opcion no valida reincie el programa");
//						break;
//				}
//			case 2:
//				System.out.println("GRACIAS POR SE PARTE DE NUESTA EMPRESA");
//				break;
//			default:
//				System.out.println("opcion no valida reincie el programa");
//				break; //test para cambios
//		}
	}

}
