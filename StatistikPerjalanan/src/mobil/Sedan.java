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
public class Sedan extends Mobil {
    public double kecepatan, jarak;
    
    @Override
    public double hitungBBMin() {        
        double bbmin = jarak / 10;
        return bbmin;
    }
    @Override
    public double hitungLamaPerjalanan() {        
        double durasi = jarak / kecepatan;
        return durasi;
    }
}