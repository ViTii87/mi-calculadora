
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * Metodo que se encarga de comprobar que el metodo sumValuesInterval(a,b) de la clase calculadora funciona correctamente
     */
    public void testSumValuesInterval(){
        Calculadora testCalculadora1 = new Calculadora();
        boolean error = false; //Contamos con que no haya errores, si los hubiera cambiaremos a true.
        String resultado = "OK";
        
        if(testCalculadora1.sumValuesInterval(0,10) != 55){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando sumValuesInterval(0,10)... Resultado: 55 / Resultado metodo " 
        + testCalculadora1.sumValuesInterval(0,10) + " ... " + resultado);
        
        if(testCalculadora1.sumValuesInterval(5,5) != 5){
            resultado = "ERROR";
            error = true;
        }
        else{
            resultado = "OK";
        }
        System.out.println("Comprobando sumValuesInterval(5,5)... Resultado: 5 / Resultado metodo " 
        + testCalculadora1.sumValuesInterval(5,5) + " ... " + resultado);
        
        if(testCalculadora1.sumValuesInterval(10,0) != 55){
            resultado = "ERROR";
            error = true;
        }
        else{
            resultado = "OK";
        }
        System.out.println("Comprobando sumValuesInterval(10,0)... Resultado: 55 / Resultado metodo " 
        + testCalculadora1.sumValuesInterval(10,0) + " ... " + resultado);
        
        if(testCalculadora1.sumValuesInterval(-5,5) != -1){
            resultado = "ERROR";
            error = true;
        }
        else{
            resultado = "OK";
        }
        System.out.println("Comprobando sumValuesInterval(-5,5)... Resultado: -1 / Resultado metodo " 
        + testCalculadora1.sumValuesInterval(-5,5) + " ... " + resultado);
        
        if(error){
            System.out.println("El metodo NO funciona correctamente");
        }
        else{
            System.out.println("El metodo SI funciona correctamente");
        }
    }
    
    /**
     * Metodo que se encarga de comprobar que el metodo isPrime(n) de la clase calculadora funciona correctamente
     */
    public void testIsPrime(){
        Calculadora testCalculadora1 = new Calculadora();
        boolean error = false; //Contamos con que no haya errores, si los hubiera cambiaremos a true.
        String resultado = "OK";
        
        if(!testCalculadora1.isPrime(2)){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando isPrime(2)... Resultado: true / Resultado metodo " 
        + testCalculadora1.isPrime(2) + " ... " + resultado);
        
        if(testCalculadora1.isPrime(4)){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando isPrime(4)... Resultado: false / Resultado metodo " 
        + testCalculadora1.isPrime(4) + " ... " + resultado);
        
        if(!testCalculadora1.isPrime(5)){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando isPrime(5)... Resultado: true / Resultado metodo " 
        + testCalculadora1.isPrime(5) + " ... " + resultado);
        
        if(testCalculadora1.isPrime(10)){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando isPrime(10)... Resultado: false / Resultado metodo " 
        + testCalculadora1.isPrime(10) + " ... " + resultado);
        
        if(!testCalculadora1.isPrime(13)){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando isPrime(13)... Resultado: true / Resultado metodo " 
        + testCalculadora1.isPrime(13) + " ... " + resultado);
        
        if(!testCalculadora1.isPrime(101)){
            resultado = "ERROR";
            error = true;
        }
        System.out.println("Comprobando isPrime(101)... Resultado: true / Resultado metodo " 
        + testCalculadora1.isPrime(101) + " ... " + resultado);
        
        if(error){
            System.out.println("El metodo NO funciona correctamente");
        }
        else{
            System.out.println("El metodo SI funciona correctamente");
        }
    }
}
