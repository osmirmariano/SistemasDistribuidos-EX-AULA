/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class dadoscompartilhados{
   int[] buffer;
   int tam;
   int numdados;
   boolean produzindo=true, consumindo=false;

   public dadoscompartilhados(int tam, int numdados){
       this.tam=tam;
       this.numdados=numdados;
       buffer = new int[tam];
       for(int i=0; i<tam; i++){
           buffer[i]=-1;
       }
   }
}
