/**
 * Created by Win7 on 3/24/2015.
 */
public class tujuh {
    public static void main(String[] args) {
        double awal=1;
        double akhir=10;
        double jumlah=0;
        double rata;
        while(awal<=akhir);{
            jumlah = jumlah + awal;
            awal++;
        }
        System.out.println("angka pertama="+awal);
        System.out.println("angka akhir"+akhir);
        System.out.println("hitung rata-rata:");

        System.out.println(jumlah);
        rata=jumlah/akhir;
        System.out.println("rata-rata deretan angka="+rata);
        }
}
