
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

    /**
     * Metodo para calcular la suma de los numeros comprendidos entre 0 y 10 incluidos.
     */
    public void sumValues(){
        int i=0;
        int suma=0;
        while(i<=10){
            suma = suma + i;
            i++;
        }
        System.out.println(suma);
    }

    /**
     * Metodo para calcular la suma de los numeros comprendidos entre a y b pasados por parametro,
     * incluidos.
     */
    public int sumValuesInterval(int a, int b){
        int suma=0;
        int aux;
        if(a>=0 && b>=0){
            if(a>b){
                aux=a;
                a = b;
                b = aux;
            }
            if(a==b){
                suma = a;
            }
            else{
                while(a<=b){
                    suma = suma + a;
                    a++;
                }
            }
        }
        else{
            System.out.println("ERROR. Los numeros introducidos deben de ser mayores que 0");
            suma = -1;
        }
        return suma;
    }

    /**
     * Metodo para devolver true si el numero introducido es primo y false si no lo es.
     */
    public boolean isPrime(int n){
        int numInicio=2;
        boolean esPrimo = true;
        if(n>1){
            while((numInicio <= n-1) && esPrimo){
                if(n % numInicio == 0){
                    esPrimo = false;
                }
                numInicio++;
            }
        }
        else{
            esPrimo = false;
            System.out.println("ERROR. El numero introducido debe de ser mayor que 1");
        }
        return esPrimo;
    }
}
