
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
 * Deskripsi Program : Menghitung total gaji berdasarkan status
 * pernikahan dengan ketentuan jika sudah menikah mendapatkan tunjangan 35%(dari
 * gaji pokok) jika belum maka tidak mendapatkan tunjangan (dengan konsep OOP)
 */
public class main {
    
       public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status, kar.gajiPokok);
 }
}