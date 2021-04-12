
package Punto4;


public class Sobremesa extends Computador
{
    private String descripcionTorre;

    public Sobremesa() 
    {
        super();
    }

    public Sobremesa(int codigo, double precio, String eslogan, String descripcion) 
    {
        super(codigo, precio, eslogan);
        this.descripcionTorre = descripcion;
    }

    public String getDescripcionTorre() 
    {
        return descripcionTorre;
    }

    public void setDescripcionTorre(String descripcionTorre)
    {
        this.descripcionTorre = descripcionTorre;
    }
}
