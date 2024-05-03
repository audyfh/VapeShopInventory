import javax.management.openmbean.ArrayType;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tools {
    static void tambahBarang(Scanner in, Barang[] arrayBrg){
        System.out.println("Pilih Kategori : ");
        System.out.println("1. Liquid");
        System.out.println("2. Device");
        System.out.println("3. Part");
        int pilih = in.nextInt();
        in.nextLine();
        Barang brg = null;
        switch (pilih){
            case 1 -> {
                System.out.println("Masukkan Nama Liquid : ");
                String nama = in.nextLine();
                System.out.println("Masukkan Jumlah Stok : ");
                int stok = in.nextInt();
                System.out.println("Masukkan Harga Liquid : ");
                double harga = in.nextDouble();
                in.nextLine();
                System.out.println("Masukkan Kode Barang : ");
                String kode = in.next();
                in.nextLine();
                System.out.println("Masukkan Kadar nikotin : ");
                String nikotin = in.nextLine();
                System.out.println("Masukkan Jenis Liquid : ");
                String jenis = in.nextLine();
                brg = new Liquid(nama,stok,nikotin,jenis,harga,kode);
            }
            case 2 -> {
                System.out.println("Masukkan Nama Device : ");
                String nama = in.nextLine();
                System.out.println("Masukkan Jumlah Stok : ");
                int stok = in.nextInt();
                System.out.println("Masukkan Harga Device : ");
                double harga = in.nextDouble();
                in.nextLine();
                System.out.println("Masukkan Kode Barang : ");
                String kode = in.next();
                in.nextLine();
                System.out.println("Masukkan Jenis Device : ");
                String jenis = in.nextLine();
                System.out.println("Masukkan Warna Device : ");
                String warna = in.nextLine();
                brg = new device(nama,stok,jenis,warna,harga,kode);
            }
            case 3 -> {
                System.out.println("Masukkan Nama Part : ");
                String nama = in.nextLine();
                System.out.println("Masukkan Jumlah Stok : ");
                int stok = in.nextInt();
                System.out.println("Masukkan Harga Part : ");
                double harga = in.nextDouble();
                in.nextLine();
                System.out.println("Masukkan Kode Part : ");
                String kode = in.next();
                in.nextLine();
                System.out.println("Masukkan Jenis Part : ");
                String jenis = in.nextLine();
                System.out.println("Masukkan Merk Part : ");
                String merk = in.nextLine();
                brg = new parts(nama,stok,jenis,merk,harga,kode);
            }
            default -> System.out.println("Masukkan Kategori Yang Benar!");
        }
        if (brg!=null) {
            for (int i = 0; i < arrayBrg.length; i++) {
                if (arrayBrg[i] == null) {
                    arrayBrg[i] = brg;
                    break;
                }
            }
            System.out.println("Barang Telah Ditambahkan!");
        } else System.out.println("Gagal!");
    }
    static void hapusBarang(Barang[] arrayBrg,Scanner in){
        printBarang(arrayBrg);
        System.out.println("Masukkan index barang yang ingin dihapus : ");
        int index = in.nextInt();
        if (index>=0&&index< arrayBrg.length){
            if (arrayBrg[index]!=null) {
                for (int i = index; i < arrayBrg.length - 1; i++) {
                    arrayBrg[i] = arrayBrg[i + 1];
                }
                arrayBrg[arrayBrg.length - 1] = null;
                System.out.println("Barang Telah Dihapus!");
            } else System.out.println("Tidak ada barang!");
        } else System.out.println("Masukkan index barang yang valid!");
    }
    static void ubahStok(Barang[] arrayBrg, Scanner in){
        printBarang(arrayBrg);
        System.out.println("Masukkan index barang yang ingin dirubah");
        int index = in.nextInt();
        System.out.println("Masukkan Stok Baru : ");
        int value = in.nextInt();
        if (index>=0 && index< arrayBrg.length ){
            if (arrayBrg[index]!=null) {
                arrayBrg[index].setStok(value);
            } else System.out.println("Tidak ada Barang!");
        } else System.out.println("Masukkan index barang yang valid!");
    }

    static void ubahHarga(Barang[] arrayBrg,Scanner in){
        printBarang(arrayBrg);
        System.out.println("Masukkan index barang yang ingin dirubah");
        int index = in.nextInt();
        System.out.println("Masukkan Harga Baru : ");
        double value = in.nextDouble();
        if (index>=0 && index< arrayBrg.length ){
            if (arrayBrg[index]!=null) {
                arrayBrg[index].setHarga(value);
            } else System.out.println("Tidak ada Barang!");
        } else System.out.println("Masukkan index barang yang valid!");
    }
    static void ubahStatus(Barang[] arrayBrg,Scanner in){
        printBarang(arrayBrg);
        System.out.println("Masukkan index barang yang ingin dirubah");
        int index = in.nextInt();
        if (index>=0 && index< arrayBrg.length ){
            if (arrayBrg[index]!=null) {
                if (arrayBrg[index].isStatus()) {
                    arrayBrg[index].setStatus(false);
                } else arrayBrg[index].setStatus(true);
            } else System.out.println("Tidak Ada Barang!");
        } else System.out.println("Masukkan index barang yang valid!");
    }
    static void printMenu(){
        System.out.println("=================================");
        System.out.println("Vape Shop Inventory");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Ubah Stok Barang");
        System.out.println("4. Ubah Harga Barang");
        System.out.println("5. Ubah Status Barang");
        System.out.println("6. Cari Barang");
        System.out.println("7. Tampilkan Semua Barang");
        System.out.println("0. Keluar");
        System.out.println("Masukkan Pilihan Anda : ");
    }
    static void printBarang(Barang[] arrayBarang){
        int index = 0;
        for (Barang bg : arrayBarang){
            if (bg!=null) {
                System.out.println("----------------------------------------");
                System.out.println("Barang Index Ke : " + index);
                System.out.println(bg);
                index++;
            }
        }
    }

    static void cariBarang(Barang[] arrayBarang, Scanner in){
        System.out.println("Masukkan Kode atau Nama barang yang ingin dicari : ");
        String find = in.nextLine();
        for (Barang barang : arrayBarang) {
            if (barang!=null&&(find.equalsIgnoreCase(barang.getKodeBarang()) || find.equalsIgnoreCase(barang.getNamaBarang()))) {
                System.out.println(barang);
            }
        }
    }

    static void Start(){
        Scanner in = new Scanner(System.in);
        Barang[] arrayBrg = load("Stock.txt");
        int pilih;
        do {
            printMenu();
            pilih = in.nextInt();
            switch (pilih){
                case 1 -> tambahBarang(in,arrayBrg);
                case 2 -> hapusBarang(arrayBrg,in);
                case 3 -> ubahStok(arrayBrg,in);
                case 4 -> ubahHarga(arrayBrg,in);
                case 5 -> ubahStatus(arrayBrg,in);
                case 6 -> cariBarang(arrayBrg,in);
                case 7 -> printBarang(arrayBrg);
                default -> {
                    System.out.println("Program Selesai");
                    break;
                }
            }
        } while (pilih>=1 && pilih<=7);
        save(arrayBrg,"Stock.txt");
    }

    static Barang[] load(String file){
        Barang[] arrayBarang = new Barang[25];
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            arrayBarang = (Barang[]) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return arrayBarang;
    }

    static void save(Barang[] arrayBarang, String file){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(arrayBarang);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
