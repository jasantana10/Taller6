
package Punto2;


public class Operario extends Empleado
{
    public Operario(String nombre) 
    {
        super(nombre);
    }
    
    @Override
    public String ToString()
    {
        return super.ToString() + "->" +"Operario";
    }
}
