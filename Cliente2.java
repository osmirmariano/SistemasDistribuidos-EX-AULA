import java.awt.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;

class Cliente2{
    public static void main( String args[] ) throws IOException {
        int c;
	String msg;
        String ip;
        int porta;
        Socket s;
        DataInputStream sIn;
        DataOutputStream s1out;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Informe o numero da porta: ");
        porta = entrada.nextInt();
        System.out.println("Informe o numero do IP: ");
        ip = entrada2.nextLine();
        
        try {
            //s = new Socket(InetAddress.getByName("127.0.0.1"),4321 ); //pelo numero IP
           
            s = new Socket();
           
            InetSocketAddress endereco = new InetSocketAddress(ip, porta);
            s.connect(endereco,1000);  
            //s = new Socket("localhost",4321 );  pelo nome

            //sIn = new DataInputStream(s.getInputStream());
            s1out = new DataOutputStream(s.getOutputStream());
            /*
            while( ( c = sIn.read() ) != -1 )
                System.out.print( (char)c );
            */
            Scanner entrada3 = new Scanner(System.in);
            String msgem;
            System.out.println("Digite a mensagem: ");
            msgem = entrada3.nextLine();
            
            s1out.writeUTF(msgem);
            
            //msg=sIn.readUTF();
            //System.out.println("\nDados: "+msg);    
            //System.out.println("\nDados: "+endereco);    

            s.close();

        } 
        catch( IOException e ) {
            System.out.println( e );
        }
  }
}
