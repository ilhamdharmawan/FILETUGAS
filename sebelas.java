/**
 * Created by Win7 on 3/24/2015.
 */
public class sebelas {
    public static void main(String[] args) {
        int d;
        int i;
        int c=4;

        for(d=1;d<=c;d++) {
            if (d % 2 == 0) {
                System.out.print(" ");
            }
            for (i = 1; i <= c; i++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
