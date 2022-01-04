package ejercicios;


public class Persona {
	
	private String nombre, apellidoPaterno , apellidoMaterno, sexo, estado;
	private String [] fechaNacimiento = new String[3];
	
	

	private String [] consonantes = {"B", 
			"C", 
			"D", 
			"F", 
			"G", 
			"H",
			"J", 
			"K", 
			"L", 
			"M", 
			"N", 
			"Ñ", 
			"P", 
			"Q", 
			"R", 
			"S", 
			"T", 
			"V", 
			"X", 
			"Z", 
			"W"};
	
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno,String sexo,String estado , String fechaNacimiento ) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		
		this.estado = estado;
		this.sexo = sexo;
		
		this.fechaNacimiento = fechaNacimiento.split("/");
	}
	
	public String getConsonantes() {
		String resultado = "";
		String [] nombres = this.nombre.split(" ");
		String nombreString = "";
		boolean insertado = false;
		
		for(String letra : this.apellidoPaterno.split("")) {
			for(String consonante : consonantes) {
				if(letra.toUpperCase().equals(consonante) 
						&& !letra.toUpperCase().equals(this.apellidoPaterno.split("")[0]) && !insertado
				) {
					resultado += consonante;
					insertado = true;
				}
			}
		}
		insertado = false;
		for(String letra : this.apellidoMaterno.split("")) {
			for(String consonante : consonantes) {
				if(letra.toUpperCase().equals(consonante) 
						&& !letra.toUpperCase().equals(this.apellidoMaterno.split("")[0]) && !insertado
				) {
					resultado += consonante;
					insertado = true;
				}
			}
		}
		insertado = false;
		for(String nombre : nombres) {
			String [] nombreArray = nombre.split("");
			for(int i = 0 ; i < nombreArray.length ; i++) {
				for(String consonante : consonantes) {
					if(nombreArray[i].toUpperCase().equals(consonante) 
							&& !nombreArray[i].toUpperCase().equals(nombreArray[0].toUpperCase()) && !insertado
					) {
						resultado += consonante;
						insertado = true;
					}
				}
			}
		}
		
		return resultado;
	}
	public String getEstado() {
		return this.estado;
	}
	public String getSexo() {
		return this.sexo;
	}
	public String [] getFecha() {
		return this.fechaNacimiento;
	}
	public String getNombre() {
		
		return this.nombre;
	}
	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}
}
