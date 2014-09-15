/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;
import java.util.Scanner;
/**
 *
 * @author Rian Andrian
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner (System.in); 
    public static void main(String[] args) {
        // TODO code application logic here
        Anak ank = new Anak();
        ank.methodAnak();
        
        Mahasiswa mhs = new Mahasiswa();
        String inNama = input.nextLine();
        mhs.setNama(inNama);
        System.out.println("nama = "+mhs.getNama());
        
        
    }
    
}

class Induk{
    public Induk(){
        System.out.println("ini konstraktor kelas induk");
    }
    
    public void methodInduk(){
        System.out.println("ini method induk");
    }
}

class Anak extends Induk{
    public void methodAnak(){
        this.methodInduk();
    }
}

class Mahasiswa{
    String nama;
    String alamat;
    
    String getNama(){
        return nama;
    }
    
    Void setNama(String nm){
        nama = nm;
        return null;
    }
}