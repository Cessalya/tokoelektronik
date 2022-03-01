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
public class smartphone extends toko {
     private int jmlkamera;
    public void setjmlkamera(int a){
        jmlkamera = a;
    }
    
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
    
    public void setJmlKamera(int k){
        this.jmlkamera = k;
    }
    
    public int getJmlKamera(){
        return this.jmlkamera;
    }
    
    @Override
    public void display(){
        System.out.println("HP best seller ditoko kami adalah : " + Merk);
    }
}
