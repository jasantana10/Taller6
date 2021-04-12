
package Punto3;


public class test1 
{
    public static void main(String[] args) 
    {
        Profesor pr = new Profesor("Juan", "Hernadez Garcia", "prof 22-387-11");
        
        System.out.println("profesor de nombre: " + pr.getNombre()+" "+ pr.getApellido()+" "+"con id de profesor: "+pr.getIdProfesor());
    }
}
