public class parts extends Barang{
    private String namaBarang;
    private int stok;
    private String jenisPart;
    private String merkPart;
    private double harga;
    private String kodeBarang;
    private boolean status;

    public parts(String namaBarang, int stok, String jenisPart, String merkPart, double harga, String kodeBarang, boolean status) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.jenisPart = jenisPart;
        this.merkPart = merkPart;
        this.harga = harga;
        this.kodeBarang = kodeBarang;
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    @Override
    public String getNamaBarang() {
        return namaBarang;
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
