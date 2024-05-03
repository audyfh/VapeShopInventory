import java.io.Serializable;

public class Liquid extends Barang implements Serializable {
    private String namaBarang;
    private int stok;
    private String nikotin;
    private String jenis;
    private double harga;
    private String kodeBarang;
    private boolean status = true;

    public Liquid(String namaBarang, int stok, String nikotin, String jenis, double harga, String kodeBarang) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.nikotin = nikotin;
        this.jenis = jenis;
        this.harga = harga;
        this.kodeBarang = kodeBarang;
    }

    public String getNikotin() {
        return nikotin;
    }

    public void setNikotin(String nikotin) {
        this.nikotin = nikotin;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String getNamaBarang() {
        return this.namaBarang;
    }

    @Override
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Override
    public int getStok() {
        return this.stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public double getHarga() {
        return this.harga;
    }

    @Override
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String getKodeBarang() {
        return this.kodeBarang;
    }

    @Override
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    @Override
    public boolean isStatus() {
        return this.status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nKadar Nikotin : "+getNikotin()+
                "\nJenis : "+getJenis();
    }
}
