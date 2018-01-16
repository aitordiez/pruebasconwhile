
/**
 * Write a description of class PruebasConWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebasConWhile
{
    /**
     *Imprima todos los múltiplos de 5 comprendidos entre 10 y 95. 
     */
    public void multiplesOfFive(){
     int index = 10;
     while (index <= 95){
         System.out.println(index);
         index= index+5;
     }
    } 
    
    /**
     * Sumar los valores comprendidos entre 1 y 10 e imprimir la suma después
     * de que el bucle haya finalizado
     */
    public void sumaEntre1y10(){
        int index =0;
        int suma=0;
        while(index < 10){
              index++;
              suma=index+suma;
        }
        System.out.println(suma);
    }

    /**
     * Hacer un método sum con un bucle while que sume todos los números
     * comprendidos entre dos números a y b. Los valores de a y b pueden
     * pasarse al método sum como parámetros.
     */
    public void sum(int a, int b){
     int index=a;
     int suma=0;
     while(index <= b){
      suma=suma+index;
      index++;
     }
     System.out.println(suma);
    }

    public boolean isPrime(int n){
        int contador=2;
        boolean primo=true;
        while ((primo)&& (contador!=n))
        {
            if(n % contador==0){
                primo=false;
            }
            contador++;
        }
        return primo;
    }
 }
    
