/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan50.energikinetik;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi e = new Energi(145, 25);
        System.out.println("Memiliki Energi Kinetik Sebesar "+e.HitungKinetik()+" Joule");
        System.out.println("Dan Usaha untuk mencapai kecepatan tersebut adalah "+e.HitungUsaha());
    
    }
    
}
