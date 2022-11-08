import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TugasJavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        if (nama.equals("Administrator") && password.length() >= 5 && pin == 123456789) {
            System.out.println("Akses diterima,Selamat Datang");
            int menu = 1;
            do {
                System.out.println(
                        "Pilih menu di bawah ini : \n 1. Bangun Ruang/Datar \n 2.Konversi \n 3.Secret Menu \n 4.Exit ");
                // input data
                menu = sc.nextInt();
                System.out.println("Anda memilih menu : " + menu);
                switch (menu) {
                    case 1:
                        int soal = 1;
                        System.out.println("soal 1");
                        do {
                            System.out.println(
                                    "Pilih Menu di bawah ini :\n 1. Luas (Meter Kuadrat) \n 2. Volume (Liter) \n 3. Exit");
                            soal = sc.nextInt();

                            System.out.println("Anda memilih soal nomer  :" + soal);
                            switch (soal) {
                                case 1:
                                    System.out.println("Luas");
                                    int datar = 1;
                                    do {
                                        System.out.println(
                                                "pilih soal dibawah ini :\n 1. Persegi panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit");
                                        System.out.println("masukkan pilihan");
                                        datar = sc.nextInt();
                                        int angka1, angka2;
                                        int a,t;
                                        int r;
                                        switch (datar) {
                                            case 1:
                                                System.out.println("Masukkan Panjang : ");
                                                angka1 = sc.nextInt();

                                                System.out.print("masukkan Lebar : ");
                                                angka2 = sc.nextInt();
                                                System.out.println("Hasilnya luas persegi panjang : "
                                                        + (angka1 * angka2 + "meter Kuadrat"));
                                                break;
                                            case 2:
                                                System.out.println("Masukkan Sisi");
                                                angka1 = sc.nextInt();
                                                System.out.println(
                                                        "Hasilnya luas persegi : "
                                                                + (angka1 * angka1 + "meter Kuadrat"));
                                                break;
                                            case 3:
                                                System.out.print("masukkan alas : ");
                                                a = sc.nextInt();

                                                System.out.print("masukkan Tinggi : ");
                                                t = sc.nextInt();
                                                System.out.println("Hasilnya luas segitiga : "
                                                        + (1 * a * t/2 )+ "meter Kuadrat");
                                                break;
                                            case 4:
                                                System.out.println("Masukkan  jari-jari : ");
                                                r = sc.nextInt();
                                                System.out.println(
                                                        "Hasilnya luas lingkaran : " + (22 * r * r/7 + "meter Kuadrat"));
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
                                                System.out.println("Hasil volume Balok : " + p * l * t + "liter");
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
                                                        "Hasil volume Bola : " + 4 * 22 * jari * jari /3 /7+ "liter");
                                                break;
                                            default:
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
                            Konversi = sc.nextInt();
                            System.out.println("Anda memilih Konversi nomer  :" + Konversi);
                            switch (Konversi) {
                                case 1:
                                    System.out.println("Derajat :");
                                    int derajat = 1;
                                    do {
                                        System.out.println(
                                                "Pilih soal dibawah in : \n 1. Celcius \n 2. Reamur \n 3. Fahrenheit \n 4. Exit");
                                        derajat = sc.nextInt();

                                        System.out.println("Anda memilih soal nomer : " + derajat);
                                        switch (derajat) {
                                            case 1:
                                                System.out.println("Celcius");
                                                int Celcius = 1;
                                                do {
                                                    int  C;
                                                    System.out.println(
                                                            "Pilih soal dibawah ini : \n 1. Celcius ke Reamur \n 2. Celcius ke Fahrenheit\n 3. Exit ");
                                                    Celcius = sc.nextInt();
                                                    System.out.println("Anda memilih soal nomer : " + Celcius);
                                                    switch (Celcius) {
                                                        case 1:
                                                            System.out.println("Celcius ke Reamur : ");
                                                            C = sc.nextInt();
                                                            System.out.println("hasilnya : " + (4 * C/5) + "°R");
                                                            break;
                                                        case 2:
                                                            System.out.println("Celcius ke Fahrenheit :");
                                                            C = sc.nextInt();
                                                            System.out.println("hasilnya : " + (9 * C + 32 / 5 + "°R"));
                                                            break;

                                                    }
                                                } while (Celcius < 3);
                                                break;
                                            case 2:
                                                System.out.println("Reamur");
                                                int Reamur = 1;
                                                do {
                                                    int R;
                                                    System.out.println(
                                                            "Pilih soal dibawah ini : \n 1. Reamur ke Celcius  \n 2. Reamur ke Fahrenheit   \n 3. Exit ");
                                                    Reamur = sc.nextInt();
                                                    System.out.println("Anda memilih soal nomer : " + Reamur);
                                                    switch (Reamur) {
                                                        case 1:
                                                            System.out.println("Reamur ke Celcius : ");
                                                            R = sc.nextInt();
                                                            System.out.println("hasilnya : " + (5 * R/4) + "°C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Reamur ke Fahrenheit  :");
                                                            R = sc.nextInt();
                                                            System.out.println("hasilnya : " + (9 * R + 32/4) + "°F");
                                                            break;

                                                    }
                                                } while (Reamur < 3);
                                                break;
                                            case 3:
                                                System.out.println("Fahrenheit");
                                                int Fahrenheit = 1;
                                                do {
                                                    int  F;
                                                    System.out.println(
                                                            "Pilih soal dibawah ini : \n 1. Fahrenheit ke Celcius  \n 2. Fahrenheit ke Reamur   \n 3. Exit ");
                                                    Fahrenheit = sc.nextInt();
                                                    System.out.println("Anda memilih soal nomer : " + Fahrenheit);
                                                    switch (Fahrenheit) {
                                                        case 1:
                                                            System.out.println("Fahrenheit ke Celcius : ");
                                                            F = sc.nextInt();
                                                            System.out.println("hasilnya : " + (5 * F - 32 /9) + "°C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Fahrenheit ke Reamur  :");
                                                            F = sc.nextInt();
                                                            System.out.println("hasilnya : " + (4 * F - 32/9) + "°F");
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
                                                        "Hasil konverensi " + meter + "=" + (meter * 1000) + " km ");
                                                break;
                                            case 2:
                                                System.out.println("HM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter * 100) + " hm ");
                                                break;
                                            case 3:
                                                System.out.println("Dam");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter * 10) + " hm ");
                                                break;
                                            case 4:
                                                System.out.println("DM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter / 10) + " hm ");
                                                break;
                                            case 5:
                                                System.out.println("CM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter / 100) + " hm ");
                                                break;
                                            case 6:
                                                System.out.println("MM");
                                                System.out.println("Masukkan Nilai (meter)");
                                                meter = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + meter + "=" + (meter / 1000) + " hm ");
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
                                        berat = sc.nextInt();
                                        System.out.println("Anda memilih : " + berat);
                                        switch (berat) {
                                            case 1:
                                                System.out.println("Kg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram * 1000) + " km ");
                                                break;
                                            case 2:
                                                System.out.println("Hg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram * 100) + " km ");
                                                break;
                                            case 3:
                                                System.out.println("Dag");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram * 10) + " km ");
                                                break;
                                            case 4:
                                                System.out.println("Dg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram / 10) + " km ");
                                                break;
                                            case 5:
                                                System.out.println("Cg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram / 100) + " km ");
                                                break;
                                            case 6:
                                                System.out.println("Mg");
                                                System.out.println("Masukkan Nilai (gram)");
                                                gram = sc.nextFloat();
                                                System.out.println(
                                                        "Hasil konverensi " + gram + "=" + (gram / 1000) + " km ");
                                                break;

                                            default:
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
                        if (angka.length() > 7 && angka.length() < 10) {
                            int rhs;
                            System.out.println("Selamat Datang VIP!!");

                            do {
                                System.out.println(
                                        "silahkan pilih menu rahasia : \n 1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit ");
                                rhs = sc.nextInt();

                                System.out.println("Anda memilih : " + rhs);
                                switch (rhs) {
                                    case 1:
                                        String lorem;
                                        System.out.println("Uppercase");
                                        sc.nextLine();
                                        System.out.println("masukkan data : ");
                                        lorem = sc.nextLine();
                                        System.out.println(lorem.toUpperCase());
                                        break;
                                    case 2:
                                        String cihuy;
                                        System.out.println("Lowercase");
                                        sc.nextLine();
                                        System.out.println("masukkan data : ");
                                        cihuy = sc.nextLine();
                                        System.out.println(cihuy.toLowerCase());
                                        break;
                                    case 3:
                                        String hello;
                                        System.out.println("Reverse");
                                        sc.nextLine();
                                        System.out.println("masukkan data : ");
                                        hello = sc.nextLine();
                                        List<String> list = Arrays.asList(hello.split(""));
                                        Collections.reverse(list);
                                        System.out.println(
                                                String.join("", list));
                                        break;
                                }
                            } while (rhs < 4);
                            break;
                        } else {
                            System.out.println("Kembali ke menu awal");
                        }
                }
            } while (menu < 4);
            System.out.println("Anda sudah keluar!!");
        } else {
            System.out.println("Akses ditolak");
            sc.close();
        }

    }
}
