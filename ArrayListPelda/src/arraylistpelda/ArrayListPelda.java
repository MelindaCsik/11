/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpelda;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user3
 */
public class ArrayListPelda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> szamok = new ArrayList<>();
        
        Random rand = new Random();
        
       // ArrayList feltöltése random számokkal        
        for (int i = 0; i < 10; i++) {
         int egySzam= rand.nextInt(10) + 10;
         szamok.add(egySzam);
        }
        
        // ArryaList kiíratás
        for (int i = 0; i <szamok.size(); i++){
            System.out.println(szamok.get(i));
        }
        
        // Hány páros szám van a listában?
        int paros = 0;
        for (int i = 0; i < szamok.size(); i++){
            if (szamok.get(i) % 2 == 0){
                paros = paros + 1;
            }
        }
        
        System.out.println(paros + " páros szám van a liatában.");
        
        
    }
    
}
