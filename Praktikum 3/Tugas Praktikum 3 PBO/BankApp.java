/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : BankAccount.java
 * Deskripsi : Realisasi Aplikasi Bank
 * Tanggal   : 06-03-2024
 */

public class BankApp {
    public static void main(String[] args) {
  
         BankAccount akun1 = new BankAccount(500.0);
  
         // skenario saldo mencukupi
         akun1.withdraw(200.0);
         System.out.println("Saldo Akun1 saat ini: $" + akun1.getBalance());
  
         // skenario saldo tidak mencukupi
         akun1.withdraw(400.0);
    }
  }
  