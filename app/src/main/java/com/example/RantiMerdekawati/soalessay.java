package com.example.RantiMerdekawati;

public class soalessay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Berapa hasil dari gambar di atas ?",
            "Apa warna bendera Indonesia ?",
            "Ada berapa apel dari gambar di atas ?",
            "Apa bentuk dari gambar di atas ?",
            "Apa warna bunga matahari ?",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "smile",
            "bendera",
            "apel",
            "shape",
            "matahari",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "9",
            "Merah putih",
            "2",
            "Belah ketupat",
            "Kuning",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
