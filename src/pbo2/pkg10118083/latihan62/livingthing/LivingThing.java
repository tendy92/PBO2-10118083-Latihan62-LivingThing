/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan62.livingthing;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Living Thing
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
        
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    } 
    
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}
