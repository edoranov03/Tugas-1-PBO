// 13020220010, Edo Ranov Anjasmara, Jumat/01.03.2024, 23:13
import javax.swing.JOptionPane;

public class Cara2{
    public static void main(String[] args) {
        String nim = JOptionPane.showInputDialog("Masukkan NIM:");
        String nama = JOptionPane.showInputDialog("Masukkan nama:");
        String jurusan = JOptionPane.showInputDialog("Masukkan jurusan:");
        String fakultas = JOptionPane.showInputDialog("Masukkan fakultas:");
        
        String message = "Data yang dimasukkan:\n" +
                "NIM: " + nim + "\n" +
                "Nama: " + nama + "\n" +
                "Jurusan: " + jurusan + "\n" +
                "Fakultas: " + fakultas;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
