/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
 import java.util.*;
public class consumidor  extends Thread  {
    dadoscompartilhados dc;

    public consumidor(dadoscompartilhados dc){
      this.dc=dc;
    }
    public void run(){
        int cont=0;

        while(cont < dc.numdados){
            /*while(dc.produzindo){
                //dc.consumindo=false;
                try{
                    Thread.sleep((int)Math.random()*2);
                }
                catch(Exception e){}
            }*/
            //dc.consumindo=true;
            //dc.produzindo=false;
        
            System.out.println("comecei a consumir");
            for(int i=0; i<dc.tam; i++){
                if(dc.buffer[i]!=-1){
                    System.out.println("dado-"+cont+"="+dc.buffer[i]);
                    dc.buffer[i]=-1;
                    cont++;
                    if(cont >= dc.numdados){
                        break;
                    }
                }
            }
            dc.consumindo=false;
            dc.produzindo=true;
            System.out.println("terminei de consumir");	 
        }
    }
}