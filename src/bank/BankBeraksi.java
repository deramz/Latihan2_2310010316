/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

// Class BankBeraksi
public class BankBeraksi {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ABC");

        // Tetapkan saldo awal Rp. 100000 melalui konstruktor
        Bank bank = new Bank(100000);

        // Tampilkan saldo saat ini
        bank.getSaldo();

        // Simpan uang Rp. 500000
        bank.simpanUang(500000);

        // Tampilkan saldo setelah penyimpanan
        bank.getSaldo();

        // Ambil uang Rp. 150000
        bank.ambilUang(150000);

        // Tampilkan saldo setelah penarikan
        bank.getSaldo();
    }
}