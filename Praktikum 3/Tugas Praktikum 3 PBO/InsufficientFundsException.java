/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : InsufficientFundsException.java
 * Deskripsi : Eksepsi buatan sendiri, yaitu ketika user melakukan withdrawn atau mengset balance dibawah 100$
 * Tanggal   : 06-03-2024
 */


public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super("Insufficient funds. Minimum balance required $100.0");
      }
    
}
