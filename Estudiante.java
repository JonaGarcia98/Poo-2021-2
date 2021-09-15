import java.util.Scanner;

public class Estudiante{

    private String Nombre;
    private String Id;
    private String Materia;
    private double Calificacion;
    private String Estado;

	public Estudiante(String Nombre, String Id, String Materia, double Calificacion, String Estado)
   /*{

    this.Nombre = "lucifer";

    this.Id = "666";

    this.Materia = "Etica y valores";

    this.Calificacion = 0;

    this.Estado = "Chiapas";
	}*/
    public Estudiante(String Nombre, String Id, String Materia, double Calificacion, String Estado)
    {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Materia = Materia;
        this.Calificacion = Calificacion;
        this.Estado = Estado;
    }
    // public Estudiante()
    // {

    // }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getMateria() {
        return Materia;
    }
    public void setMateria(String materia) {
        Materia = materia;
    }
    public double getCalificacion() {
        return Calificacion;
    }
    public void setCalificacion(double calificacion) {
        Calificacion = calificacion;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }



    public static void imprimirEstudiante(Estudiante e)
    {
        System.out.println("Nombre: "+e.getNombre()+" Matricula: "+e.getId()+" Materia: "
        +e.getMateria()+" Calificacion: "+e.getCalificacion()+" Estado: "+e.getEstado());
    }
}


