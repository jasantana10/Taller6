
package Punto3;


public class Profesor extends Persona
{
    private String idProfesor;

    public Profesor()
    {
        
    }

    public Profesor(String nombre, String apellido, String idProfesor) 
    {
        super(nombre, apellido);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() 
    {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) 
    {
        this.idProfesor = idProfesor;
    }
}
