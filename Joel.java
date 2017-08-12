
 
package joel;
import java.util.Scanner;

public class Joel {

   
    public static void main(String[] args) {
        Joel practica = new Joel();
        practica.areafiguras();
    }
    
    public void areafiguras(){
        
      int password;
       System.err.println("ingresa la contraseña");
      Scanner areafiguras= new Scanner(System.in);
      password=areafiguras.nextInt();
        
      if(password==123456){
      String opci;
      System.err.println("ingrsa la figura que quieres calcular");
      opci=areafiguras.nextLine();
      
      
       if (opci.equals("triangulo")){
      
      int b;
      int a;
      int area;
      
       System.err.println("ingres la base");
       a=areafiguras.nextInt();
        System.err.println("ingresa la altura");
       b=areafiguras.nextInt();
    
       area= b*a/2;
       
        System.out.println(area);
      }
      if(opci.equals("cuadrado")){
          
          int lado1, lado2,area;
          
          System.err.println("ingresa los lados");
          lado1=areafiguras.nextInt();
          lado2=areafiguras.nextInt();
          
          area=lado1*lado2;
          
          System.out.println(area);
      }
          
          
      }
      else{
          System.err.println("error de contraseña. Porfavor ingresa bien tu contraseña");
      }
      
      
      
    }
}

    

