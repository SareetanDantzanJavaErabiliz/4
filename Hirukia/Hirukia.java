/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.util.Scanner;

public class Hirukia {
    public static void main( String [] parametroak ) {
        
        int kont = 0, oin = 0, lerroKont = 0;
        
        System.out.print( "Sartu hirukiaren oinarrian nahi dituzun asteriskoak:" );
            
        // Scanner klaseko Irakur objketua sortzen dugu
        Scanner irakur = new Scanner( System.in );
        
        try {

            // Metodo honek asterisko kopurua irakurtzen du
            oin = irakur.nextInt ( );
        }
        catch( Exception e ) {

            // Asterisko kopurua ez da egokia
            oin = 0;
        }

        // hirukia margotu
        while ( ( kont <= oin ) && ( oin != 0 ) ) {
		for ( lerroKont = 1; lerroKont <= kont; lerroKont++ ) {
			System.out.print( "*" );
		}
		System.out.println( "\n" );
		kont++;
	}
        
        if ( oin == 0 ) {
            System.out.println( "Sartu duzuna ez da egokia" );
        }

    }
    
}
