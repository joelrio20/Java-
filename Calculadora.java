
 
package calculadora;

import java.util.Scanner;//esta es mi liobreriaes inportanate para que sirva mi escanner.

 
public class Calculadora {//esta es mi clase 

    
    public static void main(String[] args) {
      
    Calculadora joel = new Calculadora(); //a que agregamos la clase y creamos el objeto 
    joel.suma();//aqui se pone el objeto y agrgamaon el metodo que va a realizar
    
    }
    
    public void suma(){//este es mi metodo suma 
        //a qui declaramos las variables 
        int num1;
        int num2;
        int result;
        
       
        Scanner suma =new Scanner(System.in);//para inicializar el scanner 
        num1 = suma.nextInt();
        num2 = suma.nextInt();
        result = num1+ num2;
        
        //esta es para poder mandar a imprimir 
        System.out.println("la suma de:"+ num1 + "+" + num2 +"es: " + result );
        
    }
    
   
    
    
    
    
}
