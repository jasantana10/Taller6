
package Punto2;


public class Empleado 
{
    private String nombre;

    public Empleado() 
    {
        
    }

    public Empleado(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String ToString(){
        return "Empleado{"+this.nombre+"}";
    }
}
