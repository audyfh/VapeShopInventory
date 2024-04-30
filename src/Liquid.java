public class Liquid extends Barang{
    private String namaBarang;
    private int stok;
    private int nikotin;
    private String jenis;
    private double harga;
    private String kodeBarang;
    private boolean status;

    public int getNikotin() {
        return nikotin;
    }

    public void setNikotin(int nikotin) {
        this.nikotin = nikotin;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String getNamaBarang() {
        return null;
    }

    @Override
    public void setNamaBarang(String namaBarang) {

    }

    @Override
    public int getStok() {
        return 0;
    }

    @Override
    public void setStok(int stok) {

    }

    @Override
    public double getHarga() {
        return 0;
    }

    @Override
    public void setHarga(double harga) {

    }

    @Override
    public String getKodeBarang() {
        return null;
    }

    @Override
    public void setKodeBarang(String kodeBarang) {

    }

    @Override
    public boolean getStatus() {
        return false;
    }

    @Override
    public void setStatus(boolean status) {

    }
}
