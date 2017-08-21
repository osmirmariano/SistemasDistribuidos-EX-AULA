import java.awt.*;
import java.net.*;
import java.io.*;

class Servidor2 {
    public static void main( String args[] ) {
        ServerSocket s = (ServerSocket)null;
        Socket s1;
        String msg;
        int longCad;
        DataOutputStream s1out;
        DataInputStream recebe;

        try {
            s = new ServerSocket( 4321,300 );            
        } catch( IOException e ) {
            System.out.println( e );
        }

        while( true ) {
            try {

                s1 = s.accept();
                //s1out = new DataOutputStream(s1.getOutputStream());
                recebe = new DataInputStream(s1.getInputStream());
                
                /*longCad = cadena.length();
                for( int i=0; i < longCad; i++ )
                    s1out.write( (int)cadena.charAt( i ) );
		 */
                
                
		 //s1out.writeUTF(cadena);    
                msg=recebe.readUTF();
                System.out.println("\nDados: "+msg); 

                s1.close();
            } 
            catch( IOException e ) {
                System.out.println( e );
            }
        }
    }
}
