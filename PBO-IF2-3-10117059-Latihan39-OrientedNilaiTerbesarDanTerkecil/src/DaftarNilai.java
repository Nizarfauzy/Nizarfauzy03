
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 */
public class DaftarNilai {
   
    public int jumlahMhs;
    public int nBesar = 0;
    public int nKecil = 100;
    public int nilaiMhs[] = new int[40];
    Scanner scn = new Scanner(System.in);

    public void inputJumlahMhs() {
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scn.nextInt();
    }

    public int hitungNilaiTerbesar(int i) {
        return nBesar = ((nBesar <= nilaiMhs[i]) ? nilaiMhs[i] : nBesar);
    }

    public int hitungNilaiTerkecil(int i) {
        return nKecil = ((nKecil >= nilaiMhs[i]) ? nilaiMhs[i] : nKecil);
    }

    public void hasilNilaiMhs() {
       System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMhs; i++) {
       System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilaiMhs[i] + "\n");
    }
  }
}