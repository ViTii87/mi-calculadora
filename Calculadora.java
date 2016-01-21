
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{

    /**
     * Constructor de objetos calculadora
     */
    public Calculadora()
    {
    
    }

    /**
     * Metodo para calcular los multiplos de 5 entre 10 y 95 sin estar incluidos.
     */
    public void multiplesOfFive(){
        int i=11;
        while(i<95){
            if(i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    
}
