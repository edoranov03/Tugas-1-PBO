public class Mahasiswa extends Orang {
    private String stb;
    
    public Mahasiswa() {
        super();
        this.stb = "1302002134"; //stambuk anda
    }
    
    public Mahasiswa(String stb, String nama) {
        this.nama = nama;
        this.stb = stb;
    }
    
    public static void info() {
        System.out.println("Ini adalah informasi dari kelas Mahasiswa.");
    }
}