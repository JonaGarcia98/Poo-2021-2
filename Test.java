import java.util.Scanner;
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante estudiantes[] = new Estudiante[10];
        estudiantes[0] = new Estudiante("Paco","012345","OCLE",60.5,"Aprobado");
        estudiantes[1] = new Estudiante("Juan","012346","OCLE",70,"Aprobado");
        estudiantes[2] = new Estudiante("Pepe","012347","OCLE",40,"Reprobado");
        estudiantes[3] = new Estudiante("Ramon","012348","OCLE",20,"Reprobado");
        estudiantes[4] = new Estudiante("Memo","012349","OCLE",80,"Aprobado");
        

        for (int i = 5; i < estudiantes.length; i++) {
            // estudiantes[i] = new Estudiante();
            estudiantes[i] = new Estudiante("","","",0,"");
            System.out.print("Introduce el Nombre del estudiante: ");
            estudiantes[i].setNombre(sc.nextLine());
            System.out.print("Introduce la Matricula del estudiante: ");
            estudiantes[i].setId(sc.nextLine());
            System.out.print("Introduce la Materia del estudiante: ");
            estudiantes[i].setMateria(sc.nextLine());
            System.out.print("Introduce la Calificacion del estudiante: ");
            estudiantes[i].setCalificacion(sc.nextDouble());
            estudiantes[i].setEstado((estudiantes[i].getCalificacion()>=60)?"Aprobado":"Reprobado");
            sc.nextLine();
            // if(estudiantes[i].getCalificacion()>60)
            // {
            //     estudiantes[i].setEstado("Aprobado");
            // }
            // else
            // {
            //     estudiantes[i].setEstado("Reprobado");
            // }
        }

        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante.imprimirEstudiante(estudiantes[i]);
        }

    }
}
