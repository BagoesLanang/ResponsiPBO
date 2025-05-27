
package model;


public class Rental {
    private int id;
    private String nama;
    private String kontak;
    private String jenis;
    private int durasi;
    private int totalHarga;
    private String status;
    
    public Rental(String nama, String kontak, String jenis, int durasi, String status){
        this.nama = nama;
        this.kontak = kontak;
        this.jenis = jenis;
        this.durasi = durasi;
        this.status = status;
    }
    
    private int hitungHarga(){
        switch (jenis){
            case "Toyota": return 30000000 * durasi;
            case "Xenia": return 20000000 * durasi;
            case "BMW": return 50000000 * durasi;
            case "Pajero": return 40000000 * durasi;
            default: return 0;
        }
    }
    
    public String getNama() {return nama;}
    public String getKOntak() {return kontak;}
    public String getJenis() {return jenis;}
    public int getDurasi() {return durasi;}
    public int getTotalHarga () {return totalHarga;}
    public String getStatus() {return status;}
}
