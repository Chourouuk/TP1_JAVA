package tp1_java;

import java.util.ArrayList;
import java.util.List;

public class Paire < T , U> {
    private T objet1 ;
    private U objet2 ; 
    
   public Paire ( T objet1 , U objet2)
   {
	   this.objet1 = objet1;
	   this.objet2= objet2;
	   
   }
   public T getobjet1()
   { 
	   return objet1; 
   }
   public U getobjet2()
   {
	   return objet2;
   }
   public String toString() 
      {
	   return "(" +objet1+ "," +objet2+ ")";
	  }
   public static void main(String[] args )
   {
	  Paire<Integer , String> paire1 = new Paire<>(42,"bonjour");
	  Paire<Double , Boolean> paire2 = new Paire<>(3.14,true);
  System.out.println("Premier élèment de la paire 1 : " +paire1.getobjet1());
  System.out.println("Premier élèment de la paire 2 : " +paire2.getobjet2());
       
   }
}
