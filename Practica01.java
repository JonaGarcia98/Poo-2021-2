package Practica01;
import java.util.*;//Paquete para usar Scanner
public class Practica01 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String[]alumnos=new String[5];
		int[]calificaciones=new int[5];
		double promedio;
		int mas_bajo=100;
		int mas_alto=0;
		int opcion;
		do {
			System.out.println("1)Captura Datos\n2)Imprime Calificacion y promedio");
			System.out.println("3)Imprime Calificaciones y calificacion mas baja");
			System.out.println("4)Imprime Calificaciones y calificacion mas alta\n5)Salir");
			System.out.println("Elige una opcion");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				for(int i=0;i<alumnos.length;i++) {
					System.out.println("Captura el nombre del Alumno ["+(i+1)+"]");
					entrada.nextLine();//Limpiar el buffer
					alumnos[i]=entrada.nextLine();
					System.out.println("Captura la calificacion cerradas del Alumno ["+(i+1)+"]");
					calificaciones[i]=entrada.nextInt();
				}
				break;
			case 2:
				int acumulador=0;
				for(int i=0;i<alumnos.length;i++){
					System.out.println("El Alumno:"+ alumnos[i] +" tiene de calificacion:"+calificaciones[i]);
					acumulador=acumulador+calificaciones[i];
				}
				promedio=acumulador/alumnos.length;
				System.out.println("El promedio de las calificaciones es:"+promedio);
				break;
			case 3:
				for(int i=0;i<alumnos.length;i++) {
					if(calificaciones[i]<mas_bajo) {
						mas_bajo=calificaciones[i];
					}
					System.out.println("El Alumno:"+ alumnos[i] +" tiene de calificacion:"+calificaciones[i]);
				}
				System.out.println("La calificacion mas baja es de:"+mas_bajo);
				break;
			case 4:
				for(int i=0;i<alumnos.length;i++) {
					if(calificaciones[i]>mas_alto) {
						mas_alto=calificaciones[i];
					}
					System.out.println("El Alumno:"+ alumnos[i] +" tiene de calificacion:"+calificaciones[i]);
				}
				System.out.println("La calificacion mas alta es de:"+mas_alto);
				break;
			case 5:
				System.out.println("Elegiste salir, hasta luego...");
				break;
			default:
				System.out.println("Esta Opcion no existe, elige denuevo");
			}
		}while(opcion!=5);
	}
}