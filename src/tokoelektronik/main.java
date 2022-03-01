/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tokoelektronik;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;

public class main {
          public static void main(String[]args){
        //Objek
        toko cessa = new toko();
        smartphone hp =new smartphone();
        tv tipi = new tv();
        kipasangin angin=new kipasangin();
        Scanner input = new Scanner(System.in);
        
        cessa.display();
        System.out.println("Masukan nama admin :");
        cessa.setAdmin(input.next());
        
        System.out.println("Masukan merk smartphone :");
        hp.setMerk(input.next());
        
        System.out.println("Masukan Harga SmartPhone : ");
        hp.setHarga(input.nextFloat());
        
        System.out.println("Masukan total SmartPhone : ");
        hp.setTotal(input.nextInt());
        System.out.println("Masukan jml kamera :");
        hp.setJmlKamera(input.nextInt());
        
        System.out.println("Smartphone merk "+hp.getMerk()+" dengan harga "+hp.getHarga()+ "total hp "+ hp.getTotal()+ "Serta jumlah kamera"+
                hp.getJmlKamera());
        hp.display() ; 

        System.out.println("masukkan merk tv : ");
        tipi.setMerk(input.next());
         
        System.out.println("Masukan Harga tv : ");
        tipi.setHarga(input.nextFloat());
         
        System.out.println("Masukan total tv : ");
        tipi.setTotal(input.nextInt());
         
        System.out.println("Masukan nama tipe :");
        tipi.setTipe(input.next());
         
        System.out.println("tv merk "+tipi.getMerk()+" dengan harga "+tipi.getHarga()+ "total tv"+hp.getTotal()+" Serta nama tipe "+
               tipi.getTipe());
        tipi.display();
    
        System.out.println("masukkan merk kipas angin : ");
        angin.setMerk(input.next());
    
        System.out.println("Masukan Harga kipas angin : ");
        angin.setHarga(input.nextFloat());
    
        System.out.println("Masukan total kipas angin : ");
        angin.setTotal(input.nextInt());
    
        System.out.println("Masukan tipe :");
        angin.setTipe(input.next());
      
        System.out.println("kipas angin merk "+angin.getMerk()+" dengan harga "+angin.getHarga()+"total kipas angin "+angin.getTotal()+" Serta tipe "+
               angin.getTipe());
        angin.display();
     }

}
