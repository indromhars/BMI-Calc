import java.util.Scanner;

public class BodyMassIndex {

    static void BMICalc() {
        {
            //membuat variabel
            Scanner input = new Scanner (System.in);
            String nama;
            int nis, kelas;
            float tinggi, berat, meter, hasil;
    
            System.out.println("\nProgram Menghitung Berat badan Ideal dengan BMI");
            System.out.println("----------------------------------------------------------------------------------");
            //Nama
            System.out.println("Masukkan Nama anda: ");
            nama = input.nextLine();
            //NIS
            System.out.println("\nMasukkan NIS anda: ");
            nis = input.nextInt();
            //Kelas
            System.out.println("\nMasukkan Kelas anda: ");
            kelas = input.nextInt();
            //Tinggi
            System.out.println("\nMasukkan Tinggi anda: ");
            tinggi = input.nextFloat();
            //Berat
            System.out.println("\nMasukkan Berat badan anda: ");
            berat = input.nextFloat();
            
            //menutup scanner
            input.close();
    
            //Rumus menghitung meter
            meter = tinggi / 100;
    
            //Rumus menghitung BMI
            hasil = (berat/(meter*meter));
    
            //mencetak hasil
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("BMI anda: "+ hasil);
            System.out.println("----------------------------------------------------------------------------------");
    
            //membuat kondisi if else untuk menentukan hasil
            if (hasil >= 18.5 && hasil < 24.9) {
                System.out.println("BMI ananda " + nama + " dengan NIS " + nis + " dan dari kelas " + kelas + " dinyatakan " + "Normal");
            }
            
            else if (hasil >= 25 && hasil < 29.9) {
                System.out.println("BMI ananda " + nama + " dengan NIS " + nis + " dan dari kelas " + kelas + " dinyatakan " + "Overweight");
            }
    
            else if (hasil > 30) {
                System.out.println("BMI ananda " + nama + " dengan NIS " + nis + " dan dari kelas " + kelas + " dinyatakan " + "Obesitas");
            }
    
            else if (hasil < 18.5 ) {
                System.out.println("BMI ananda " + nama + " dengan NIS " + nis + " dan dari kelas " + kelas + " dinyatakan " + "Underweight");
            }
    
            System.out.println("----------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        BMICalc();
    }

}