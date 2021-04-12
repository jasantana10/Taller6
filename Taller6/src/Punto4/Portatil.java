
package Punto4;


public class Portatil extends Computador
{
    private int peso;

    public Portatil() 
    {
        super();
    }

    public Portatil(int codigo, double precio, String eslogan, int peso) 
    {
        super(codigo, precio, eslogan);
        this.peso = peso;
    }

    public int getPeso() 
    {
        return peso;
    }

    public void setPeso(int peso) 
    {
        this.peso = peso;
    }
}
