/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szigetek;
/**
 *
 * @author user3
 */
public class Szigetek {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tomb[] = {0, 0, 200, 548, 20, 0, 0, 0, 310, 980, 1280, 650, 102, 0, 0, 45, 0, 21, 65, 0, 0};
        
        // Készíts programot, amely meghatározza a völgyet tartalmazó szigetek számát!
        
        
        // Készíts programot, amely meghatározza az 200 méternél magasabb szigetek átlagos magasságát!
           int magash = 0;
           int mennyim = 0;          
           
           for( int i = 0; i < tomb.length; i++ ){
            if (tomb[i] > 200){
                magash = magash + tomb[i];
                mennyim = mennyim + 1;
            }
           }
           
           int magas = magash / mennyim;       
           System.out.println("200 méternél magasbb szigetek átlagos magassága:" + magas);
           
        
        // Készíts programot, amely meg­határozza a 100 méternél alacsonyabb szigetek átlagos magasságát!
          int alacsonyh = 0;
          int mennyia = 0;          
          
          for( int i = 0; i < tomb.length; i++ ){
            if (tomb[i] < 100){
                alacsonyh = alacsonyh + tomb[i];
                mennyia = mennyia + 1;
            }
           }
          
          int alacsony = alacsonyh + mennyia;
          System.out.println("100 méternél alacsonyabb");
        
        // Készíts programot, amely meghatározza a tengerszakaszok átlagos hosszát!
        
        
    }
}
    
