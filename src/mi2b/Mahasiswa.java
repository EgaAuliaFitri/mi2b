/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi2b;

/**
 *
 * @author acer
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="ega";
        mhs.nobp ="2101092045";
        mhs.kelas ="2B";
        mhs.prodi ="MI";
        mhs.jurusan ="TI";
        
        System.out.println("Nama : " +mhs.nama+ "\n"
                + "No BP :" +mhs.nobp+"\n"
                        + "Jurusan : "+mhs.jurusan+"\n"
                               + "Prodi : " +mhs.prodi+"\n"
                                        + "Kelas : " +mhs.kelas);
        
        System.out.println("");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama ="Puci";
        mhs2.nobp ="2101092049";
        mhs2.kelas ="2B";
        mhs2.prodi ="MI";
        mhs2.jurusan ="TI";
        
        System.out.println("Nama : " +mhs2.nama+ "\n"
                + "No BP :" +mhs2.nobp+"\n"
                        + "Jurusan : "+mhs2.jurusan+"\n"
                               + "Prodi : " +mhs2.prodi+"\n"
                                        + "Kelas : " +mhs2.kelas);
    }
    
}
