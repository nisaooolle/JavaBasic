import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TugasJavaBasic {
    public static void main(String[] args) {
        // panggil scanner 
        // digunakan untuk mengeksekusi sistem secara terus menerus
        Scanner sc = new Scanner(System.in);
        // Data variable
        String nama = "Administrator";
        String password;
        int pin = 123456789;
        System.out.println("Silahkan Login terlebih dahulu!!");
        System.out.print("Silahkan Masukan Nama : ");
        nama = sc.next();
        System.out.print("Silahkan Masukan Password : ");
        password = sc.next();
        System.out.print("Silahkan Masukan Pin : ");
        pin = sc.nextInt();
        // kondisi
        if (nama.equals("Administrator") && password.length() >= 5 && pin == 123456789) {
            System.out.println("Akses diterima,Selamat Datang");
            int menu = 1;
            do {
                System.out.println(
                        "Pilih menu di bawah ini : \n 1. Bangun Ruang/Datar \n 2.Konversi \n 3.Secret Menu \n 4.Exit ");
                // input data
                System.out.println("silahkan pilih menu :");
                menu = sc.nextInt();
                System.out.println("Anda memilih menu : " + menu);
                switch (menu) {
                    case 1:
                        int soal = 1;
                        System.out.println("Menu 1");
                        do {
                            System.out.println(
                                    "Pilih Menu di bawah ini :\n 1. Luas (Meter Kuadrat) \n 2. Volume (Liter) \n 3. Exit");
                            // input data
                            System.out.println("silahkan pilih soal : ");
                            soal = sc.nextInt();
                            System.out.println("Anda memilih soal nomer  :" + soal);
                            switch (soal) {
                                case 1:
                                    System.out.println("Luas");
                                    int datar = 1;
                                    do {
                                        System.out.println(
                                                "pilih soal dibawah ini :\n 1. Persegi panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit");
                                        System.out.println("masukkan pilihan : ");
                                        datar = sc.nextInt();
                                        int angka1, angka2;
                                        int a, t;
                                        int r;
                                        switch (datar) {
                                            case 1:
                                                System.out.print("Masukkan Panjang : ");
                                                angka1 = sc.nextInt();

                                                System.out.print("masukkan Lebar : ");
                                                angka2 = sc.nextInt();
                                                System.out.println("Hasilnya luas persegi panjang : "
                                                        + (angka1 * angka2 + "m??"));
                                                break;
                                            case 2:
                                                System.out.println("Masukkan Sisi");
                                                angka1 = sc.nextInt();
                                                System.out.println(
                                                        "Hasilnya luas persegi : "
                                                                + (angka1 * angka1 + "m??"));
                                                break;
                                            case 3:
                                                System.out.print("masukkan alas : ");
                                                a = sc.nextInt();

                                                System.out.print("masukkan Tinggi : ");
                                                t = sc.nextInt();
                                                System.out.println("Hasilnya luas segitiga : "
                                                        + (1 * a * t / 2) + "m??");
                                                break;
                                            case 4:
                                                System.out.println("Masukkan  jari-jari : ");
                                                r = sc.nextInt();
                                                System.out.println(
                                                        "Hasilnya luas lingkaran : " + (22 * r * r / 7 + "m??"));
                                                break;

                                        }
                                    } while (datar < 5);
                                    break;
                                case 2:
                                    System.out.println("Volume");
                                    int ruang = 1;
                                    do {
                                        System.out.println(
                                                "pilih soal dibawah ini :\n 1. Balok \n 2. Kubus \n 3. Bola \n 4. Exit");
                                        System.out.println("masukkan pilihan :");
                                        ruang = sc.nextInt();
                                        int p, l, t;
                                        int s;
                                        int jari;
                                        switch (ruang) {
                                            case 1:
                                                System.out.println("masukkan Panjang : ");
                                                p = sc.nextInt();
                                                System.out.println("masukkan lebar : ");
                                                l = sc.nextInt();
                                                System.out.println("masukkan tinggi :");
                                                t = sc.nextInt();
                                                System.out.println("Hasil volume Balok : " + p * l * t + " liter");
                                                break;
                                            case 2:
                                                System.out.println("masukkan sisi : ");
                                                s = sc.nextInt();
                                                System.out.println("Hasil volume Kubus : " + s * s + " liter");
                                                break;
                                            case 3:
                                                System.out.println("masukkan jari -jari : ");
                                                jari = sc.nextInt();
                                                System.out.println(
                                                        "Hasil volume Bola : " + 4 * 22 * jari * jari * jari / 3 / 7
                                                                + " liter");
                                                break;
                                        }
                                    } while (ruang < 4);
                                    break;
                            }
                        } while (soal < 3);
                        break;
                    case 2:
                        int Konversi = 1;
                        do {
                            System.out.println(
                                    "Pilih Konversi di bawah ini :\n 1. Derajat \n 2. Panjang (meter)  \n 3.  Berat (gram) \n 4.Exit");
                            System.out.println("masukkan pilihan :");
                            Konversi = sc.nextInt();
                            System.out.println("Anda memilih Konversi nomer  :" + Konversi);
                            switch (Konversi) {
                                case 1:
                                    System.out.println("Derajat :");
                                    int derajat = 1;
                                    do {
                                        System.out.println(
                                                "Pilih soal dibawah in : \n 1. Celcius \n 2. Reamur \n 3. Fahrenheit \n 4. Exit");
                                        System.out.println("masukkan pilihan :");
                                        derajat = sc.nextInt();
                                        System.out.println("Anda memilih soal nomer : " + derajat);
                                        switch (derajat) {
                                            case 1:
                                                System.out.println("Celcius");
                                                int Celcius = 1;
                                                do {
                                                    Float C;
                                                    System.out.println(
                                                            "Pilih soal dibawah ini : \n 1. Celcius ke Reamur \n 2. Celcius ke Fahrenheit\n 3. Exit ");
                                                    System.out.println("masukkan pilihan :");
                                                    Celcius = sc.nextInt();
                                                    System.out.println("Anda memilih soal nomer : " + Celcius);
                                                    switch (Celcius) {
                                                        case 1:
                                                            System.out.println("Celcius ke Reamur : ");
                                                            C = sc.nextFloat();
                                                            System.out.println("hasilnya : " + (4 * C / 5) + "??R");
                                                            break;
                                                        case 2:
                                                            System.out.println("Celcius ke Fahrenheit :");
                                                            C = sc.nextFloat();
                                                            System.out.println("hasilnya : " + ((C * 9/5) +32 + "??F"));
                                                            break;

                                                    }
                                                } while (Celcius < 3);
                                                break;
                                            case 2:
                                                System.out.println("Reamur");
                                                int Reamur = 1;
                                                do {
                                                    Float R;
                                                    System.out.println(
                                                            "Pilih soal dibawah ini : \n 1. Reamur ke Celcius  \n 2. Reamur ke Fahrenheit   \n 3. Exit ");
                                                    System.out.println("masukkan pilihan :");
                                                    Reamur = sc.nextInt();
                                                    System.out.println("Anda memilih soal nomer : " + Reamur);
                                                    switch (Reamur) {
                                                        case 1:
                                                            System.out.println("Reamur ke Celcius : ");
                                                            R = sc.nextFloat();
                                                            System.out.println("hasilnya : " + (5 * R / 4) + "??C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Reamur ke Fahrenheit  :");
                                                            R = sc.nextFloat();
                                                            System.out.println("hasilnya : " + (9 * R / 4 + 32) + "??F");
                                                            
                                                            break;

                                                    }
                                                } while (Reamur < 3);
                                                break;
                                            case 3:
                                                System.out.println("Fahrenheit");
                                                int Fahrenheit = 1;
                                                do {
                                                    Float F;
                                                    System.out.println(
                                                            "Pilih soal dibawah ini : \n 1. Fahrenheit ke Celcius  \n 2. Fahrenheit ke Reamur   \n 3. Exit ");
                                                    System.out.println("masukkan pilihan :");
                                                    Fahrenheit = sc.nextInt();
                                                    System.out.println("Anda memilih soal nomer : " + Fahrenheit);
                                                    switch (Fahrenheit) {
                                                        case 1:
                                                            System.out.println("Fahrenheit ke Celcius : ");
                                                            F = sc.nextFloat();
                                                            System.out.println("hasilnya : " + (5 * (F - 32) / 9 + "??C"));
                                                            break;
                                                        case 2:
                                                            System.out.println("Fahrenheit ke Reamur  :");
                                                            F = sc.nextFloat();
                                                            System.out.println("hasilnya : " + (4* (F - 32)/ 9) + "??R");
                                                            break;

                                                    }
                                                } while (Fahrenheit < 3);
                                                break;
                                        }
                                    } while (derajat < 4);
                                    break;
                                case 2:
                                    System.out.println("Panjang (meter)");
                                    int panjang;
                                    do {
                                        Float meter;
                                        System.out.println(
                                                "silahkan pilih : \n 1. KM \n 2. HM \n 3. Dam  \n 4. DM \n 5. CM \n 6. MM \n 7. Exit ");
                                        panjang = sc.nextInt();
                                        System.out.println("Anda memilih : " + panjang);
                                        switch (panjang) {
                                            case 1:
                                                System.out.println("KM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter / 1000) + " km ");
                                                break;
                                            case 2:
                                                System.out.println("HM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter / 100) + " hm ");
                                                break;
                                            case 3:
                                                System.out.println("Dam");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter / 10) + " dam ");
                                                break;
                                            case 4:
                                                System.out.println("DM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter * 10) + " dm ");
                                                break;
                                            case 5:
                                                System.out.println("CM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter * 100) + " cm ");
                                                break;
                                            case 6:
                                                System.out.println("MM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter * 1000) + " mm ");
                                                break;
                                        }
                                    } while (panjang < 7);
                                    break;
                                case 3:
                                    System.out.println("Berat (gram)");
                                    int berat;
                                    do {
                                        Float gram;
                                        System.out.println(
                                                "silahkan pilih : \n 1. Kg \n 2. Hg \n 3. Dag  \n 4. Dg \n 5. Cg \n 6. Mg \n 7. Exit ");
                                        System.out.println("masukkan pilihan :");
                                        berat = sc.nextInt();
                                        System.out.println("Anda memilih : " + berat);
                                        switch (berat) {
                                            case 1:
                                                System.out.println("Kg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram / 1000) + " kg ");
                                                break;
                                            case 2:
                                                System.out.println("Hg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram / 100) + " hg ");
                                                break;
                                            case 3:
                                                System.out.println("Dag");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram / 10) + " dag ");
                                                break;
                                            case 4:
                                                System.out.println("Dg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram * 10) + " gd ");
                                                break;
                                            case 5:
                                                System.out.println("Cg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram * 100) + " cg ");
                                                break;
                                            case 6:
                                                System.out.println("Mg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram * 1000) + " mg ");
                                                break;
                                        }
                                    } while (berat < 7);
                                    break;
                            }
                        } while (Konversi < 4);
                        break;
                    case 3:
                        String angka;
                        System.out.println("Secret Menu : ");
                        System.out.println("masukkan nilai unik : ");
                        angka = sc.next();
                        // kondisi
                        // Leght => menghitung jumlah karakter yg ada di nilai data
                        if (angka.length() > 7 && angka.length() < 10) {
                            int rhs;
                            System.out.println("Selamat Datang VIP!!");
                            do {
                                System.out.println(
                                        "silahkan pilih menu rahasia : \n 1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit ");
                                System.out.println("masukkan pilihan :");
                                rhs = sc.nextInt();
                                System.out.println("Anda memilih : " + rhs);
                                switch (rhs) {
                                    case 1:
                                        // Uppercase => merubah semua karakter kecil mnjdi huruf kapital
                                        System.out.println("Uppercase");
                                        sc.nextLine();
                                        System.out.println("masukkan data : ");
                                        angka = sc.nextLine();
                                        System.out.println(angka.toUpperCase());
                                        break;
                                    case 2:
                                        // Lowercase => merubah semua karakter kapital mnjdi huruf kecil
                                        System.out.println("Lowercase");
                                        sc.nextLine();
                                        System.out.println("masukkan data : ");
                                        angka = sc.nextLine();
                                        System.out.println(angka.toLowerCase());
                                        break;
                                    case 3:
                                        System.out.println("Reverse");
                                        sc.nextLine();
                                        System.out.println("masukkan data : ");
                                        String lorem;
                                        lorem = sc.nextLine();
                                        // untuk membalikkan kalimat
                                        List<String> list = Arrays.asList(lorem.split(" "));
                                        Collections.reverse(list);
                                        System.out.println(
                                                String.join(" ", list));
                                        break;
                                }
                            } while (rhs < 4);
                            break;
                        } else {
                            System.out.println("Nilai unik salah!!");
                        }
                }
            } while (menu < 4);
            System.out.println("Anda sudah keluar!!");
        } else {
            System.out.println("Akses ditolak,silahkan run ulang");
            sc.close();
        }

    }
}
