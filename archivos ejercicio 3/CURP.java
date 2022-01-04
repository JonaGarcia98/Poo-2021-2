package ejercicios;

import java.util.Arrays;

public class CURP {
	private Persona persona;

	private String [] entidades = { "AS", "BS", "CL", "CS", "DF", "GT", "HG", "MC", "MS", "NL", "PL", "PL",
			"QR", "SL", "TC", "TL", "YN" , "BC" , "CC", "CM", "CH", "DG",
			"GR" , "JC", "MN", "NT" , "OC", "QT", "SP", "SR", "TS", "VZ", "ZS"};
	private String [] estadosMexico = {
			"AGUASCALIENTES",
			"BAJA CALIFORNIA SUR",
			"COAHUILA",
			"CHIAPAS",
			"DISTRITO FEDERAL",
			"GUANAJUATO",
			"HIDALGO",
			"MÉXICO",
			"MORELOS",
			"NUEVO LEÓN",
			"PUEBLA",
			"QUINTANA ROO",
			"SINALOA",
			"TABASCO",
			"TLAXCALA",
			"YUCATÁN",
			"BAJA CALIFORNIA",
			"CAMPECHE",
			"COLIMA",
			"CHIHUAHUA",
			"DURANGO",
			"GUERRERO",
			"JALISCO",
			"MICHOACÁN",
			"NAYARIT",
			"OAXACA",
			"QUERÉTARO",
			"SAN LUIS POTOSÍ",
			"SONORA",
			"TAMAULIPAS",
			"VERACRUZ",
			"ZACATECAS"		
	};
	
	
	public CURP(Persona persona) {
		this.persona = persona;
	}
	
	public String numerosAleatorios() {
		String resultado = "";
        int max1 = 10;
        int min1 = 1;
        int range1 = max1 - min1 + 1;
        
        int max2 = 90;
        int min2 = 65;
        int range2 = max2 - min2 + 1;
        
        int numero1 = (int)(Math.random() * range2) + min2;
        int numero2 = (int)(Math.random() * range1) + min1;

        
		return Character.toString(numero1) + Integer.toString(numero2);
	}
	
	public String getEntidad() {
		String resultado = "";
		int index = 0 ;
		
		for(int i = 0 ; i < estadosMexico.length ; i++) {
			if(this.persona.getEstado().toUpperCase().equals(estadosMexico[i])) {
				index = i;
			}
		}
		resultado = entidades[index];
		return resultado;
	}
	
	public String primerasLetras() {
		int numeroNombres = 0 ;
		String nombre = "";
		String [] nombrePersona = this.persona.getNombre().split("");
		String [] apellidoPaterno = this.persona.getApellidoPaterno().split("");
		String [] apellidoMaterno = this.persona.getApellidoMaterno().split("");
		
		
		for(String letra : nombrePersona) {
			if(letra == letra.toUpperCase() && !letra.equals(" ")) {
				numeroNombres++;
			}
		}
		
		nombre += apellidoPaterno[0];
		
		if(numeroNombres > 1) {
			for(String letra : nombrePersona) {
				if(letra == letra.toUpperCase() && !letra.equals(" ")) {
					nombre += letra;
				}
			}
		}else {
			nombre += apellidoMaterno[0];
			nombre += apellidoMaterno[0];
		}
		nombre += nombrePersona[0];
		
		return nombre;
	}
	
	public String getFechaNacimiento(){
		String resultado = "";
		String [] fecha = this.persona.getFecha();
		
		for(int i = fecha.length - 1 ; i >= 0 ; i--) {
			resultado += fecha[i];
		}
		
		return resultado;
	}
	
	public String getCurp() {
		return (this.primerasLetras() + this.getFechaNacimiento() + this.persona.getSexo() + this.getEntidad() + this.persona.getConsonantes() + this.numerosAleatorios()).toUpperCase();
	}
}
