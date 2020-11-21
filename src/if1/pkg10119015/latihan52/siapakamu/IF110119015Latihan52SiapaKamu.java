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
public class IF110119015Latihan52SiapaKamu extends Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        
        Dosen orang2 = new Dosen();
        orang2.setNip("41227829930");
        orang2.setNama("Rizki Adam Kurniawan");
        orang2.setUmur(27);
        orang2.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + orang2.getNip());
        orang2.siapaKamu();
        orang2.mengajarApa();
        
        System.out.println();
        
       Mahasiswa orang3 = new Mahasiswa();
       orang3.setNim("10119015");
       orang3.setNama("Agi Sutrisna");
       orang3.setUmur(20);
       orang3.setKelas("PBO");
       System.out.println("NIM MAHASISWA : " + orang3.getNim());
       orang3.siapaKamu();
       orang3.kelasApa();
      
    }
    
}
