

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
public class ForEgitura {
    public static void main( String [] parametroak ) {
        int kont = 0;
        
        for ( kont = 1; kont <= 10; kont++ ) {
           System.out.println( +kont+ "for egiturarekin zorte ona eduki" );
        }
        
        System.out.println( "Zenbakia\tZenbakia ber bi" );
        for ( kont = 1; kont <= 10; kont++){
            System.out.println( kont+ "\t\t" +kont*kont );
        }
        
        for ( kont = 10; kont >= 0; kont-- ) {
            System.out.println( kont+ " segundo" );
        }
        
        for ( kont = 10; kont < 60; kont += 10 ) {
            System.out.println( kont );
        }
        
        char karak = 'a';
        for ( karak = 'a'; karak <= 'z'; karak++ ) {
            System.out.println( karak+ " karaktereari dagokion ASCII kodigoa: " +(int)karak );
        }
        
        for ( kont = 1; kont <= 85; kont = (5 + kont ) * 2 ) {
            System.out.println( kont );
        }
        
        int gramoak, balioa;
        System.out.println( "Gramoak\tBalioa" );
        for ( gramoak = 5, balioa = 20; gramoak <= 60; gramoak += 5, balioa += 12 ) {
            System.out.println ( gramoak+ "\t" +balioa);
        }
        
        int i = 0;
        
        double[ ] astekoTenp = {20.3, 23.8, 12.2, 13.5, 40.8, 26.8, 14.5 };
        
        for ( i = 0; i < 7; i++ ) {
            System.out.println( (i+1)+". eguneko tenperatua: "+ astekoTenp [ i ] );
            
        }

        //for-each begizta
        int j = 0;
        for (double zbk : astekoTenp) { 
            j++;
            System.out.println( j+". eguneko tenperatua: "+ zbk );

        } 
            
    }
    
}
