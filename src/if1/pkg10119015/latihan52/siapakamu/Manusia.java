/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan52.siapakamu;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
       this.umur = umur;
    }
    
    public void siapaKamu(){
            System.out.println("Saya manusia");
    }
}
