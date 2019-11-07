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
public class Energi {
    private int m,v;

    public Energi(int m, int v) {
        this.m = m;
        this.v = v;
        System.out.println("Sebuah bola baseball dengan massa "+m+"g dilempar dengan kecepatan "+v+" m/s.");
        
    }
    
    public double HitungKinetik(){
        return 0.5*this.m*this.v*this.v;
    }
    public double HitungUsaha(){
        return ((m/2)*(v*v-0));
    }
    }
    
    
    

