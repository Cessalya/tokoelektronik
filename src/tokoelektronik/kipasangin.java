/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tokoelektronik;

/**
 *
 * @author LENOVO
 */
public class kipasangin extends toko {
    private String Tipe;

    public void setMerk(String m){
        super.Merk = m;
    }
    
    public String getMerk(){
        return Merk;
    }
    
    public void setHarga (float h){
        super.harga = h;
    }
    
    public float getHarga(){
        return harga;
    }
    
    public void setTotal(int t){
        super.total = t;
    }
    
    public int getTotal(){
        return total;
    }
    
    public void setTipe(String T){
        this.Tipe = T;
    }
    
    public String getTipe(){
        return Tipe;
    }
    
    @Override
    public void display(){
        System.out.println("Kipas Angin best seller ditoko kami adalah : " + Merk);
    }
}
