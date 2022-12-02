/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak;

/**
 *
 * @author user3
 */
public class MetodusGyak {
    
    public static String parose(int szam) {
        String paros = "";
        
        for (){
    
        }
        return paros;
    }
    
     public static int kozepso(int szam1, int szam2, int szam3) {
        int min = Math.min(Math.min(szam1, szam2), szam3);
        int max = Math.max(Math.max(szam1, szam2), szam3);
        int kozepso = szam1 + szam2 + szam3 - max - min; 
        
        return kozepso;
    }
     
     public static int matrix(int n) {
         int matrix = 0;
         return matrix;
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Ellenőrzi, hogy egy egész szám minden számjegye páros-e
           //System.out.println("A szám " + parose(154));
        
        // 2. Három egész számot kér, és eldönti, hogy az egyik a másik kettő középpontja-e.
           System.out.println(kozepso(8, 2, 5));
        
        // 3. Egy n számot kap paraméterként, és kiír egy nn x n-es mátrixot véletlen
          // 0 illetve 1 számjegyekből
          
           System.out.println("");
    }
    
}
