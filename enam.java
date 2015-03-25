/**
 * Created by Win7 on 3/24/2015.
 */
public class enam {
    public static void main(String[] args) {
        System.out.println("menghitung jumlah");

        int awal = 1;
        int akhir = 10;
        int jumlah = 0;
        System.out.println("deretan pertama:");
        System.out.println("deretan akhir:");

        while (awal <= akhir) {
            jumlah = jumlah + awal;

            awal++;
        }
        System.out.println(jumlah);
    }
}