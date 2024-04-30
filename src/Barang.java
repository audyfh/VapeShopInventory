public abstract class Barang {
    private String namaBarang;
    private int stok;
    private double harga;
    private String kodeBarang;
    private boolean status;

    abstract public String getNamaBarang();

    abstract public void setNamaBarang(String namaBarang);

    abstract public int getStok();

    abstract public void setStok(int stok);

    abstract public double getHarga();

    abstract public void setHarga(double harga);

    abstract public String getKodeBarang();

    abstract public void setKodeBarang(String kodeBarang);

    abstract public boolean getStatus();

    abstract public void setStatus(boolean status);
}
