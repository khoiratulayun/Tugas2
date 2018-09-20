/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2pemrogramanaplikasimobileayun;

/**
 *
 * @author ASUS
 */
public class Tugas2PemrogramanAplikasiMobileAyun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int umur = 21;
    String paras = "cantik";
    String ide = "pintar";
    
    if (paras=="cantik" && ide=="pintar" && umur >=20 && umur <=23){
        System.out.println("Pasti Mau !");
    }
    else if(paras=="cantik" && umur >=20 && umur <=23){
        System.out.println("Oklah.");
    }
    else if(paras=="cantik" && umur >23){
        System.out.println("Saya Pikir Dulu..");
    }
    else{
        System.out.println("No Way !");
    }
  
    }
}
