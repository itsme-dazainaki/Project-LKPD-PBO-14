/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Radaza Putri
 */
public abstract class Mobil {    
    public abstract double hitungBBMin();
    public abstract double hitungLamaPerjalanan();
    
    public void tampilHasil() {        
        System.out.println("Perkiraan Bahan Bakar Minimal yang Diperlukan adalah  : " + this.hitungBBMin());
        System.out.println("Perkiraan Lama Perjalanan yang Akan Ditempuh adalah   : " + this.hitungLamaPerjalanan());
    }
}