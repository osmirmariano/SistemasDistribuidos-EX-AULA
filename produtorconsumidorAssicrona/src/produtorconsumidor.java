/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class produtorconsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            dadoscompartilhados dc;
            dc = new dadoscompartilhados(10, 100);

            produtor p;
            p = new produtor(dc);

            consumidor c;
            c = new consumidor(dc);

            p.start();
            c.start();
            p.join();
            c.join();
        }catch(Exception e){
           System.out.println("Erro="+e.getMessage());
        }

    }

}
