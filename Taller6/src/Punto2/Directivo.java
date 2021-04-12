
package Punto2;


public class Directivo extends Empleado
{

    public Directivo(String nombre) 
    {
        super(nombre);
    }
    
    @Override
    public String ToString()
    {
        return super.ToString() + "->" +"Directivo";
    }
}
