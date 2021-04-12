
package Punto2;

public class Tecnico extends  Operario
{
    
    public Tecnico(String nombre) 
    {
        super(nombre);
    }
    
    @Override
    public String ToString()
    {
        return super.ToString() + "->" +"Tecnico";
    }
}
