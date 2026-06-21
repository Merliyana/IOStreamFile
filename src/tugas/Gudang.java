package tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang b) {
        daftar.add(b);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Barang ==");
        for (Barang b : daftar) {
            System.out.println(b.info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftar) {
                pw.println(b.keBaris());
            }
            System.out.println("Data berhasil disimpan");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void muatDariBerkas() {
        daftar.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(namaBerkas))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bagian = line.split(";");
                if (bagian.length == 3) {
                    String nama = bagian[0];
                    double harga = Double.parseDouble(bagian[1]);
                    int stok = Integer.parseInt(bagian[2]);

                    daftar.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("Data berhasil dimuat");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;
        for (Barang b : daftar) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }
}