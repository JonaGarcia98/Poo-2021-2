package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int opcion = 1;
		String nombre, apellidoPaterno , apellidoMaterno, sexo, estado, fechaNacimiento;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Bienvenido a la consulta de RFC y CURP");
			System.out.println("ELIGA UNA DE LAS SIGUIENTES OPCIONES");
			System.out.println("1.Inverstigar CURP");
			System.out.println("2.Investigar RFC");
			System.out.println("3.Investigar RFC y CURP");
			System.out.println("0.SALIR");
			
			opcion = s.nextInt();
			s.nextLine();
			switch(opcion) {
				case 1 :
					Scanner s1 = new Scanner(System.in);
					System.out.println("Ingrese un nombre");
					nombre = s.nextLine();
					s.nextLine();
					System.out.println("Ingrese el apellido paterno");
					apellidoPaterno = s1.nextLine();
					System.out.println("Ingrese el apellido materno");
					apellidoMaterno = s.nextLine();
					System.out.println("Ingrese el sexo M o H");
					sexo = s.nextLine();
					System.out.println("Ingrese el estado");
					estado = s.nextLine();
					System.out.println("Ingrese la fecha de nacimiento (Solo con numeros de 2 digitos y separados por /)");
					fechaNacimiento = s.nextLine();
					
					Persona persona = new Persona(nombre, apellidoPaterno, apellidoMaterno,sexo, estado , fechaNacimiento);
					CURP curp = new CURP(persona);
					
					System.out.println("La curp es " + curp.getCurp());
					break;
				case 2 :
					
					System.out.println("Ingrese un nombre");
					nombre = s.nextLine();
					s.nextLine();
					System.out.println("Ingrese el apellido paterno");
					apellidoPaterno = s.nextLine();
					System.out.println("Ingrese el apellido materno");
					apellidoMaterno = s.nextLine();
					System.out.println("Ingrese el sexo M ó H");
					sexo = s.nextLine();
					System.out.println("Ingrese el estado");
					estado = s.nextLine();
					System.out.println("Ingrese la fecha de nacimiento (Solo con numeros de 2 digitos y separados por /)");
					fechaNacimiento = s.nextLine();
					
					Persona persona1 = new Persona(nombre, apellidoPaterno, apellidoMaterno,sexo, estado , fechaNacimiento);
					RFC rfc = new RFC(persona1);
					
					System.out.println("La RFC es " + rfc.getRFC());
					break;
				case 3 :
					
					System.out.println("Ingrese un nombre");
					nombre = s.nextLine();
					s.nextLine();
					System.out.println("Ingrese el apellido paterno");
					apellidoPaterno = s.nextLine();
					System.out.println("Ingrese el apellido materno");
					apellidoMaterno = s.nextLine();
					System.out.println("Ingrese el sexo M ó H");
					sexo = s.nextLine();
					System.out.println("Ingrese el estado");
					estado = s.nextLine();
					System.out.println("Ingrese la fecha de nacimiento (Solo con numeros de 2 digitos y separados por /)");
					fechaNacimiento = s.nextLine();
					
					Persona persona2 = new Persona(nombre, apellidoPaterno, apellidoMaterno,sexo, estado , fechaNacimiento);
					RFC rfc2 = new RFC(persona2);
					CURP curp2 = new CURP(persona2);
					
					System.out.println("La RFC es " + rfc2.getRFC());
					System.out.println("La CURP es " + curp2.getCurp());
					break;
				default :
					if(opcion!=0) {
					System.out.println("Ingrese una opcion valida");
					}
				break;
			}
			System.out.println("elegiste la salida, hasta pronto :D");
		}while(opcion != 0);
	}

}
