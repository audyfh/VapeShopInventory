
public class User {
    private String nama;
    private int umur;
    private String jeniskelamin;
    private String alamat;
    private String notelp;
    private int point;
    
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }


    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }


    public String getJeniskelamin() {
        return jeniskelamin;
    }
    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }


    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public String getNotelp() {
        return notelp;
    }
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }


    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }


    public String toString() {
        return "Nama: " + getNama() + "\n" + "Umur: " + getUmur() + "\n" + "Jenis Kelamin: " + getJeniskelamin() + "\n" + "No Telepon: " + getNotelp() + "\n" +
        "Alamat: " + getAlamat() + "\n" + "Total Point: " + getPoint();
    }
}
