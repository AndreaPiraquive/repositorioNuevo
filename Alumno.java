package modelo;

/**
 *
 * @author andrea.piraquive
 */
public class Alumno {
    
    public enum Estudios {BACHILLERATO, GRADO_MEDIO, UNIVERSITARIOS}
    private String nombre; 
    private int edad; 
    private String localidad; 
    private Estudios estudios; 
    
    public Alumno(){
        this.estudios = Estudios.GRADO_MEDIO;
        this.nombre = "David"; 
        this.edad = 21;
        this.localidad = "Alcorcon"; 
    }
    
    public Alumno (String nombre, int edad, String localidad, Estudios estudios){
        this.estudios = estudios; 
        this.nombre = nombre;
        this.edad = edad; 
        this.localidad = localidad; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Estudios getEstudios() {
        return estudios;
    }

    public void setEstudios(Estudios estudios) {
        this.estudios = estudios;
    }
    
    
}
