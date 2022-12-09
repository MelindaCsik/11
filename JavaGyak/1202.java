/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1202;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Írj egy programot, ami megkeresi egy tömb 2. legnagyobb elemét.
          int[] tomb = {5,17,4,7,55};
        
          for (int i = 0; i < tomb.length; i++) {
           
          }
               
        
        // 2. Írj egy programot, ami összehasonlít két egyenlő méretű tömböt, 
         // és megállapítja, hogy azonosak-e.
          int[] tomb2 = {4,5,6,7};
          int[] tomb3 = {4,5,6,7};
          String azonose = "A két tömb azonos."; 
          
          for (int i = 0; i < tomb2.length; i++) {
               if (tomb2[i] != tomb3[i]) {
                   azonose = "A két tömb nem azonos";
               }   
          }
          
          System.out.println(azonose);
         
    }
    
}
