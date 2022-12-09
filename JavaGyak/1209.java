/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1209;

/**
 *
 * @author user3
 */
public class Main {

    public static int kamat (int osszeg, int kamat, int ev) {
        int vegosszeg = 0;
        
        for (int i = 0; i < ev; i++) {
            vegosszeg = osszeg * kamat;
        }
        return vegosszeg;
    }
     
    public static void main(String[] args) {
        // Kiszámolja, hogy egy befetetett összegből mennyi lesz egy 
         // megadott fix kamattal megadott év alatt.
         int osszeg = 1000;
         int kamat = 10;
         int ev = 5;         
         
         System.out.println();
    }
    
}
