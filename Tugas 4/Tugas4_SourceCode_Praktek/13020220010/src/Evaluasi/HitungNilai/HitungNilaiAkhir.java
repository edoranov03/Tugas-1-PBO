/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluasi.HitungNilai;

/**
 *
 * @author STAMBUK:13020220010
 * NAMA : EDO RANOV ANJASMARA
 * MATERI : MODUL 4,EVALUASI PRATIKUM
 * WAKTU : RABU 27/03/2024 13:36
 */
public class HitungNilaiAkhir {
    public double nilaiTugas(int tugas1, int tugas2) {
        double rataTugas = (tugas1 + tugas2) / 2.0;
        return rataTugas;
    }

    public double nilaiAkhir(double tugas, int mid, int uas) {
        double nilaiAkhir = (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
        return nilaiAkhir;
    }
}
