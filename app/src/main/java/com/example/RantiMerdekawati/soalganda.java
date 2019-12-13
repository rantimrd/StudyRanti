package com.example.RantiMerdekawati;

public class soalganda {

    public String pertanyaan[] = {
            "Berapa hasil penjumlahan dari 5 + 5 ?",
            "Berapa hasil pengurangan dari 3 - 2 ?",
            "Berbentuk apakah bola basket ?",
            "Berapa warna yang ada di pelangi ?",
            "Apa warna terakhir pelangi ?",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"5","10","15"},
            {"1","5","-1"},
            {"Lingkaran","Persegi Panjang","Segitiga"},
            {"3","5","7"},
            {"Merah","Ungu","Nila"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "10",
            "1",
            "Lingkaran",
            "7",
            "Ungu",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
