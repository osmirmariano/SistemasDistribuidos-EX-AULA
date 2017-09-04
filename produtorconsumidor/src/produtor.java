/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
 import java.util.*;
public class produtor  extends Thread  {
   dadoscompartilhados dc;

   public produtor(dadoscompartilhados dc){
     this.dc=dc;
   }
   public void run(){
       int cont=0;
       while(cont < dc.numdados){
         while(dc.consumindo)
            
         {
            //dc.produzindo=false;
            try{
                Thread.sleep((int)Math.random()*2);
            }
            catch(Exception e){}
         }
        //dc.produzindo=true;
	//dc.consumindo=false;
         System.out.println("comecei a produzir");
         for(int i=0; i<dc.tam; i++){
           //if(dc.buffer[i]==-1){
             //dc.buffer[i]=(int)(Math.random()*1000);
			 dc.buffer[i]=i+1;
             cont++;
             if(cont >= dc.numdados){
                 break;
             }
           //}
         }
		 dc.produzindo=false;
         dc.consumindo=true;
		 System.out.println("terminei de produzir - cont="+cont);
         
       }
   }
}
