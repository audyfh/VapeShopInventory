public class device extends Barang{
    private String namaBarang;
    private int stok;
    private String jenisDevice;
    private double harga;
    private String kodeBarang;
    private boolean status;
    private String warnaDevice;



    public device(String namaBarang, int stok, String jenisDevice, String warnaDevice, double harga, String kodeBarang, boolean status) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.jenisDevice = jenisDevice;
        this.warnaDevice = warnaDevice;
        this.harga = harga;
        this.kodeBarang = kodeBarang;
        this.status = status;
    }

    public String getJenisDevice() {
        return jenisDevice;
    }

    public void setJenisDevice(String jenisDevice) {
        this.jenisDevice = jenisDevice;
    }
    public String getWarnaDevice() {
        return warnaDevice;
    }

    public void setWarnaDevice(String warnaDevice) {
        this.warnaDevice = warnaDevice;
    }

    public boolean isStatus() {
        return status;
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
    }

    @Override
    public boolean getStatus() {
        if (status == true) {
            System.out.println("Tersedia");
        } else {
            System.out.println("Tidak Tersedia");
        }

        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
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
