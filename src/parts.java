import java.io.Serializable;

public class parts extends Barang implements Serializable {
    private String namaBarang;
    private int stok;
    private String jenisPart;
    private String merkPart;
    private double harga;
    private String kodeBarang;
    private boolean status = true;

    public parts(String namaBarang, int stok, String jenisPart, String merkPart, double harga, String kodeBarang) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.jenisPart = jenisPart;
        this.merkPart = merkPart;
        this.harga = harga;
        this.kodeBarang = kodeBarang;
    }

    @Override
    public String getNamaBarang() {
        return namaBarang;
    }

    @Override
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getJenisPart() {
        return jenisPart;
    }

    public void setJenisPart(String jenisPart) {
        this.jenisPart = jenisPart;
    }

    public String getMerkPart() {
        return merkPart;
    }

    public void setMerkPart(String merkPart) {
        this.merkPart = merkPart;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String getKodeBarang() {
        return kodeBarang;
    }

    @Override
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    @Override
    public boolean isStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nJenis : "+getJenisPart()+
                "\nMerk : "+getMerkPart();
    }

    public void tampilkanDataBarang() {
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Stok \t\t\t: " + stok);
        System.out.println("Jenis Device \t: " + jenisPart);
        System.out.println("Warna Device \t: " + merkPart);
        System.out.println("Harga \t\t\t: Rp." + harga);
        System.out.println("Kode Barang \t: " + kodeBarang);
        System.out.println("Status \t\t\t: " + (status ? "Tersedia" : "Tidak Tersedia"));
    }
}
