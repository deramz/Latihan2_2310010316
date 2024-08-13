/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

class Bank {
    private int saldo;

    // Konstruktor dengan parameter saldo
    public Bank(int saldo) {
        this.saldo = saldo;
    }

    // Method untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Method untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk melakukan penarikan.");
        }
    }
        // Method untuk mendapatkan saldo saat ini
    public void getSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
}
