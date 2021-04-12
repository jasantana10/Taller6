
package Punto2;


public class Oficial extends Operario
{
    
    public Oficial(String nombre) 
    {
        super(nombre);
    }
    
    @Override
    public String ToString()
    {
        return super.ToString() + "->" +"Oficial";
    }   
}
