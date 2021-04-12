
package Punto3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 
{
    public static void main(String[] args) 
    {
        Date fecha = null;
        try
        {
            SimpleDateFormat fechaHora = new SimpleDateFormat("yyyy/MM/dd");
            String Date = fechaHora.format(new Date("2019/11/22"));
            fecha = fechaHora.parse(Date);

        }catch (ParseException ex){
            
        }
        ProfesorInterino pi = new ProfesorInterino("Jhon", "Santana Castañeda", "prof 1010", fecha);
        
        System.out.println("profesor interino "+pi.getNombre()+" "+ pi.getApellido() +" "+"se incorporo en la fecha"
                                +" "+ pi.getFechaIncorporacion());
    }
}
