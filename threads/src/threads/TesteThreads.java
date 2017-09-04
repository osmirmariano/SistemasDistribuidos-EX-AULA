
package threads;
import static java.lang.Thread.sleep;


public class TesteThreads extends Thread{
    int numero;
    public TesteThreads (String nome, int numero){
        super(nome);
        this.numero = numero;
    }
    
    public void run(){
        int x;
        for(x = 0; x < numero; x++){
            System.out.println(getName()+ " na etapa "+x);
            try {
                sleep((int) (Math.random()*2000));
            } 
            catch (Exception e) { }
        }
        System.out.println(" Thread terminada: " +getName());
    }
    
}
