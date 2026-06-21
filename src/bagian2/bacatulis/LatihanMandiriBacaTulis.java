package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiriBacaTulis {
    public static void main(String[] args) {

        try {
            // =========================
            // 1. Tulis 5 nama hari
            // =========================
            FileWriter writer = new FileWriter("hari.txt");
            writer.write("Senin\n");
            writer.write("Selasa\n");
            writer.write("Rabu\n");
            writer.write("Kamis\n");
            writer.write("Jumat\n");
            writer.close();

            // Baca dan tampilkan
            System.out.println("Isi awal:");
            BufferedReader reader = new BufferedReader(new FileReader("hari.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // =========================
            // 2. Tambah 2 hari (append)
            // =========================
            FileWriter writerAppend = new FileWriter("hari.txt", true);
            writerAppend.write("Sabtu\n");
            writerAppend.write("Minggu\n");
            writerAppend.close();

            // Tampilkan semua isi
            System.out.println("\nSetelah ditambah:");
            reader = new BufferedReader(new FileReader("hari.txt"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // =========================
            // 3. Hitung jumlah baris
            // =========================
            reader = new BufferedReader(new FileReader("hari.txt"));
            int jumlahBaris = 0;

            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            reader.close();

            System.out.println("\nJumlah baris: " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}