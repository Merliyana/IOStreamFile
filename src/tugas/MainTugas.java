package tugas;

// NAMA: Merliyana Agustin Effendy Purba
// NPM: (isi NPM kamu)

public class MainTugas {
    public static void main(String[] args) {

        // Array kategori

        String[] kategori = {"Elektronik", "Makanan", "Minuman"};

        System.out.println("== Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        // Buat gudang & tambah barang
        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Laptop", 7000000, 5));
        gudang.tambahBarang(new Barang("HP", 3000000, 10));
        gudang.tambahBarang(new Barang("Snack", 5000, 50));
        gudang.tambahBarang(new Barang("Air Mineral", 3000, 100));
        gudang.tambahBarang(new Barang("Mouse", 100000, 20));

        gudang.tampilkanSemua();

        // Simpan ke file
        gudang.simpanKeBerkas();


        // Load ulang dari file
       
        System.out.println("\n== Setelah dimuat ulang ==");

        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        // Total nilai
        System.out.println("\nTotal nilai persediaan: " + gudangBaru.totalNilai());
    }
}