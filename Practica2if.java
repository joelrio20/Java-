package practica2if;



public class Practica2if {

    public static void main(String[] args) {
        Practica2if jr=new Practica2if();
         //jr.if_structura();
         jr.if_anidado();

    }

    public void if_structura() {
        
        int a=200;
        int b=35;
        
        
        if (a>b) {
            System.out.println(a+" es mayor que "+b);
            
        } else {
            System.out.println(a+" es menor que "+b);
            
        }
        
    }
    
    public void if_anidado(){
        
      int a=2008;
      String b=("tsuru");
      
     
      if(a<2008){
      
          
          
      }
      if(b.equals("tsuru")){
            System.out.println("NO pasa");
          
      }else{
          System.out.println("Si pasa");
      }
          
      
    }
    
    
    
    
    
    
    
    

}
