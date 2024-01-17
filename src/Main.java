import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu = "Pilihan Menu : \n" +
                "1. Nasi Goreng (Rp. 15,000.00) \n" +
                "2. Mie Ayam (Rp. 10,000.00) \n" +
                "3. Bakso (Rp. 13,000.00)";

        Scanner input = new Scanner(System.in);

        System.out.println("#CATATAN PESANAN#");

        String nama, pilihan, jumlah;

        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();

        System.out.println(menu);

        System.out.print("Masukkan Pilihan Menu : ");
        pilihan = input.nextLine();

        System.out.print("Jumlah Pesan : ");
        jumlah = input.nextLine();
        System.out.println("==============================");

        double harga1 = 15000.00;
        double harga2 = 10000.00;
        double harga3 = 13000.00;
        double total = 0.00;

        boolean pilihanBenar = true;

        System.out.println("#CATATAN PESANAN#");
        System.out.println("Nama Pemesan :" + nama);
        System.out.println("Pesanan :" + getMenu(pilihan));
        System.out.println("Harga :" + (pilihan.equals("1") ? harga1 : (pilihan.equals("2") ? harga2 : harga3)));
        System.out.println("Jumlah Pesan :" + jumlah);
        total = Double.parseDouble(jumlah) * (pilihan.equals("1") ? harga1 : (pilihan.equals("2") ? harga2 : harga3));

        System.out.println("Total Bayar : Rp. " + total);
        System.out.println();

        do {
            System.out.print("Masukkan Nama : ");
            nama = input.nextLine();

            System.out.println(menu);

            do {
                System.out.print("Masukkan Pilihan Menu : ");
                pilihan = input.nextLine();

                System.out.print("Jumlah Pesan : ");
                jumlah = input.nextLine();

                System.out.println("==============================");
                System.out.println("#CATATAN PESANAN#");
                System.out.println("Nama Pemesan :" + nama);
                System.out.println("Pesanan :" + getMenu(pilihan));
                System.out.println("Harga :" + (pilihan.equals("1") ? harga1 : (pilihan.equals("2") ? harga2 : harga3)));
                System.out.println("Jumlah Pesan :" + jumlah);

                total = Double.parseDouble(jumlah) * (pilihan.equals("1") ? harga1 : (pilihan.equals("2") ? harga2 : harga3));

                System.out.println("Total Bayar : Rp. " + total);

                System.out.println();
            } while (!pilihanBenar);
        } while (true);
    }

    private static String getMenu(String pilihan) {
        switch (pilihan) {
            case "1":
                return "Nasi Goreng";
            case "2":
                return "Mie Ayam";
            case "3":
                return "Bakso";
            default:
                System.out.println("Salah pilih!:(");
                System.exit(0);
                return "";
        }
    }

}