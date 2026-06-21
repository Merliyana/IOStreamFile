package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {

        try {
            // 1. Cek file laporan.txt

            File laporan = new File("laporan.txt");

            System.out.println("Apakah laporan.txt ada? " + laporan.exists());

            if (laporan.exists()) {
                System.out.println("Ukuran file: " + laporan.length() + " byte");
            }

            // 2. Membuat folder arsip
            
            File folder = new File("arsip");

            if (folder.mkdir()) {
                System.out.println("Folder arsip berhasil dibuat");
            } else {
                System.out.println("Folder arsip gagal dibuat / sudah ada");
            }

            // 3. File sementara.txt
            File sementara = new File("sementara.txt");

            // Buat file
            sementara.createNewFile();
            System.out.println("Sebelum dihapus: " + sementara.exists());

            // Hapus file
            sementara.delete();
            System.out.println("Sesudah dihapus: " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}