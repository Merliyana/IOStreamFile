package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Untuk simpan ke file
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Info barang
    public String info() {
        return nama + " | Harga: " + harga + " | Stok: " + stok;
    }
}