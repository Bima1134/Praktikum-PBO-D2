/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : BankAccount.java
 * Deskripsi : Header dan Body kelas BankAccount, terdapat metode mengset uang awal, penarikan dan pemasukan uang dari bank
 * Tanggal   : 06-03-2024
 */


public class BankAccount{
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        try{
            if(this.balance >= MIN_BALANCE){
                System.out.println("Curent Balance : $"+this.balance);
            }
            else{
                throw new InsufficientFundsException("Insufficient funds. Minimum balance required $100.0");
            }
        }
        catch(InsufficientFundsException IFE){
            System.out.println(IFE.getMessage());
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawn: $"+amount);
        balance -= amount;
        try{
            if(this.balance >= MIN_BALANCE){
                System.out.println("Curent Balance : $"+this.balance);
            }
            else{
                throw new InsufficientFundsException("Insufficient funds. Minimum balance required $100.0");
            }
        }
        catch(InsufficientFundsException IFE){
            System.out.println(IFE.getMessage());
        }
        catch(Exception e){
            System.out.println("Inputan Tidak Valid");
        }
    }

    public double getBalance() {
        return balance;
    }

}
