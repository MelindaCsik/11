/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1122;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    
    public static int legkisebb(int szam1, int szam2, int szam3) {
        int min = 100;
        
        if (szam1 < min) {
          min = szam1;
        }
        
        if (szam2 < min) {
          min = szam2;
        }
        
        if (szam3 < min) {
          min = szam3;
        }
                
        return min;
    }
    
    public static String kozepso(int szam1, int szam2, int szam3) {
        String kozepso = "";
        return kozepso;
    }
    
    public static int maganhangzo(String szoveg) {
        int maganhangzokSzama = 0;
        
        
        return maganhangzokSzama;
    }
    
    public static int szavak(String szoveg) {
        int szavakSzama = 0;
        String[] tomb = szoveg.split(" ");
        
        for( int i = 0; i < tomb.length; i++ ) {
        szavakSzama = szavakSzama + 1;
        }
   
        return szavakSzama;
    }
    
    public static String ervenyesJelszo(String jelszo) {
        String a = "Nem megfelelő";
        
        return a;
    }
    
    public static String sorrend(int szam1, int szam2, int szam3) {
        String a = "nincsenek növekvő sorrendben.";
        
        if (szam1 < szam2) {
            if (szam2 < szam3) {
              a = "növekvő sorrendben vannak.";
            }
        }
        
        return a;
    }
    
    public static int osszeg(int szam) {
        int szamOsszeg = 0;
        
        
        return szamOsszeg;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        // 1. Három szám közül visszaadja a lekisebbet.
          System.out.println("Adja meg az első számot:");
           int szam1 = bill.nextInt();
          System.out.println("Adja meg a második számot:");
           int szam2 = bill.nextInt();
          System.out.println("Adja meg a harmadik számot:");
           int szam3 = bill.nextInt();
          
          System.out.println("A legkiebb szám:" + legkisebb(szam1, szam2, szam3));
          
        
        // 2. Visszaadja egy string középső karakterét. (1 vagy 2 középső karakter lehet)
          System.out.println("Írjon be egy mondatott:");
           String szoveg2 = bill.nextLine();
        
          
        // 3. Visszaadja egy string angol magánhangzóinak számát
          System.out.println("Írjon be egy mondatott:");
           String szoveg4 = bill.nextLine();
        
        
        // 4. Visszaadja, hány szó van egy stringben
           System.out.println("Írjon be egy mondatott:");
           String szoveg5 = bill.nextLine();
           
           System.out.println("A mondatban lévő szavak száma:" + szavak(szoveg5));
        
           
        // 5. Visszaadja, hogy egy string érvényes jelszó-e
          // min. 10 karakter hosszú, betű és számjegy, min. 2 szám
           System.out.println("Adja meg a jelszavát:");
           String jelszo = bill.nextLine();
          
           System.out.println("A jelszó ");
          
          
         // 6. A 3 kapott paraméterről eldönt, hogy növekvő sorrendben vannak-e
           System.out.println("Adja meg az első számot:");
           int szam16 = bill.nextInt();
           System.out.println("Adja meg a második számot:");
           int szam26 = bill.nextInt();
           System.out.println("Adja meg az harmadik számot:");
           int szam36 = bill.nextInt();
           
           System.out.println("A számok " + sorrend(szam16, szam26, szam36));
         
         // 7. Visszaadja egy integer szám számjegyeinek összegét
           System.out.println("Adjon meg egy több jegyű számot: ");
           int szam7 = bill.nextInt();
           
         
         // 8 Kiírja a karaktereket 2 megadott karakter között (ango9l abc)
         
    }
    
}
