import java.io.Serializable;

public class device extends Barang implements Serializable {
    private String namaBarang;
    private int stok;
    private String jenisDevice;
    private double harga;
    private String kodeBarang;
    private boolean status = true;
    private String warnaDevice;



    public device(String namaBarang, int stok, String jenisDevice, String warnaDevice, double harga, String kodeBarang) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.jenisDevice = jenisDevice;
        this.warnaDevice = warnaDevice;
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

    public String getJenisDevice() {
        return jenisDevice;
    }

    public void setJenisDevice(String jenisDevice) {
        this.jenisDevice = jenisDevice;
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

    public String getWarnaDevice() {
        return warnaDevice;
    }

    public void setWarnaDevice(String warnaDevice) {
        this.warnaDevice = warnaDevice;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nJenis Device : "+getJenisDevice()+
                "\nWarna Device : "+getWarnaDevice();
    }

    public void tampilkanDataBarang() {
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Stok \t\t\t: " + stok);
        System.out.println("Jenis Device \t: " + jenisDevice);
        System.out.println("Warna Device \t: " + warnaDevice);
        System.out.println("Harga \t\t\t: Rp." + harga);
        System.out.println("Kode Barang \t: " + kodeBarang);
        System.out.println("Status \t\t\t: " + (status ? "Tersedia" : "Tidak Tersedia"));
    }
}
