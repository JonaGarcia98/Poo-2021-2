package ejercicios;

public class RFC extends CURP {
	public RFC(Persona persona) {
		super(persona);
	}
	public String numerosAleatorios() {
		String resultado = "";
        int max1 = 10;
        int min1 = 1;
        int range1 = max1 - min1 + 1;
        
        int max2 = 90;
        int min2 = 65;
        int range2 = max2 - min2 + 1;
        
        int max3 = 90;
        int min3 = 65;
        int range3 = max3 - min3 + 1;
        
        int numero1 = (int)(Math.random() * range2) + min2;
        int numero3 = (int)(Math.random() * range3) + min3;
        int numero2 = (int)(Math.random() * range1) + min1;

        
		return Character.toString(numero1) + Integer.toString(numero2) + Character.toString(numero3);
	}
	public String getRFC() {
		return (super.primerasLetras() + super.getFechaNacimiento() + this.numerosAleatorios()).toUpperCase();
	}
}
