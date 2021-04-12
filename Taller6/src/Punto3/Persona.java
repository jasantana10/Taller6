
package Punto3;

public class Persona 
{
    private String nombre;
    private String apellidos;

    public Persona() 
    {
        
    }

    public Persona(String nombre, String apellido) 
    {
        this.nombre = nombre;
        this.apellidos = apellido;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellidos;
    }

    public void setApellido(String apellido) 
    {
        this.apellidos = apellido;
    }
}
