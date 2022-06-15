/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

/**
 *
 * @author asus
 */
import java.util.ArrayList;


public class Client implements User{ //polimorphisme
    
    private ArrayList<String> namaClient = new ArrayList<String>(); // private modifier yang hanya dapat diakses oleh class itu sendiri dan sebagai enkapsulasi
    private ArrayList<String> alamat = new ArrayList<String>(); // Arraylist untuk menambahakan data
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>(); 
    
    public Client(){ // public adalah keyword yang dapat dikases oleh class lain
        this.namaClient.add("Bagas");// keyword this adalah data terkini yang hanya diakses oleh class itu snediri
        this.alamat.add("Sukun"); //this juga termasuk enkapsulasi
        this.telepon.add("088746378990");
        this.saldo.add(1900000);
        
        this.namaClient.add("Firdi");
        this.alamat.add("Kediri");
        this.telepon.add("0895368907623");
        this.saldo.add(100);
    }
    
    public int getId(String nama){ //mengidntifikasi data
        return this.namaClient.indexOf(nama); //mengembalikan nilai
    }
    
    @Override // Override digunakan untuk mewarisi ulang class parent juga sebagai inheritance
    public void setNama(String nama) { // void adalah method yang tidak mengembalikan nilai
        this.namaClient.add(nama); //
    }

    @Override 
    public void setAlamat(String alamat) { // set/setter untuk memberi nilai pada variable
        this.alamat.add(alamat); 
    }

    @Override
    public void setTelepon(String telepon) {  
        this.telepon.add(telepon);
    }
    
    public void addSaldo(int saldo){ 
        this.saldo.add(saldo);
    }
    
    public void setSaldo(int id,int saldo){ //set sebagai mutator fungsi menamabahkan nilai
        this.saldo.set(id,saldo);
    }

    @Override
    public String getNama(int id) { 
        return this.namaClient.get(id); // dalam method void getter harus menggunakan return atau pengmbalian nilai
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public int getSaldo(int id){ // get sebagai acessor mengaembalikan nilai
        return this.saldo.get(id);
    }
    
    public void tampilClient(){
        int n = this.namaClient.size();//untuk menampilkan jumlah elemen dari ArrayList
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Saldo   = "+getSaldo(i));
        }
    }
}