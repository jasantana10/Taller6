
package Punto3;

import java.util.Date;

public class ProfesorInterino extends Profesor
{
    private Date fechaIncorporacion;

    public ProfesorInterino() 
    {
        super();
    }

    public ProfesorInterino(String nombre, String apellido, String idProfesor, Date fechaIncor) 
    {
        super(nombre, apellido, idProfesor);
        this.fechaIncorporacion = fechaIncor;
    }

    public Date getFechaIncorporacion() 
    {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion)
    {
        this.fechaIncorporacion = fechaIncorporacion;
    }
}
