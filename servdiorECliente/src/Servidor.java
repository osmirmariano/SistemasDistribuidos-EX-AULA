import java.awt.*;
import java.net.*;
import java.io.*;

class Servidor {
    public static void main( String args[] ) {
        ServerSocket s = (ServerSocket)null;
        Socket s1;
        String cadena = "Tutorial de Java!";
        int longCad;
        DataOutputStream s1out;

        try {
            s = new ServerSocket( 4321,300 );
        } catch( IOException e ) {
            System.out.println( e );
        }

        while( true ) {
            try {

                s1 = s.accept();
                s1out = new DataOutputStream(s1.getOutputStream());


                /*longCad = cadena.length();
                for( int i=0; i < longCad; i++ )
                    s1out.write( (int)cadena.charAt( i ) );
		 */
		 s1out.writeUTF(cadena);    


                s1.close();
            } catch( IOException e ) {
                System.out.println( e );
                }
            }
        }
    }