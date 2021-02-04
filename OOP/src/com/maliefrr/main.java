package com.maliefrr;

class Mahasiswa {
    public String nama;
    public String jurusan;
    public String NilaiHuruf;
    public int Jumlah;
    private String NIM;
    private double IPK;

    Mahasiswa(String InputNama,String jurusan,String NIM,String NilaiHuruf) {
        this.nama = InputNama ;
        this.jurusan = jurusan;
        this.NIM = NIM;
        this.NilaiHuruf = NilaiHuruf.toLowerCase(); 
    }

    public double Convert(){
        if (this.NilaiHuruf == "a") {
            return 4;
        }
        else if (this.NilaiHuruf == "b"){
            return 3;
        }
        else if (this.NilaiHuruf == "c"){
            return 2;
        }
        else if (this.NilaiHuruf == "d"){
            return 1;
        }
        else {
            return 0;
        }
    }

    public void Show(){
        System.out.println("Nama\t: " + this.nama);
        System.out.println("NIM\t: " + this.NIM);
        System.out.println("Jurusan\t: " + this.jurusan);
    }

    public void GetIPK() {
        System.out.println("IPK\t: "+ Convert());
    }
}

public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alief","Ilmu Komputer","F1G119031","b");
        mahasiswa1.Show();
        mahasiswa1.GetIPK();
    }  
}
