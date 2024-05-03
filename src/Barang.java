import java.io.Serializable;

public  class Barang implements Serializable {
    private String namaBarang;
    private int stok;
    private double harga;
    private String kodeBarang;
    private boolean status = true;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String status;
        if (isStatus()){
            status = "Tersedia";
        } else status = "Kosong";
        return "----------------------------------------"+
                "\nNama Barang : "+getNamaBarang()+
                "\nStok : "+getStok()+
                "\nHarga : "+getHarga()+
                "\nKode Barang : "+getKodeBarang()+
                "\nStatus : "+status;

    }
}
