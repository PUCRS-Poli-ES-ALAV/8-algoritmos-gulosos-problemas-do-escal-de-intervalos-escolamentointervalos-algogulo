package algoritmosgulosos;

/**
 *
 * @author Camila Borba Rocha
 */
public class EscalonamentoIntervalos {

    public static int[] SDM(int[] s, int[] f, int n) {
        int[] x = new int[n];
        x[1] = 1;
        int i = 0;
        for (int k = i+ 1; k < n; k++) {
            if (s[k] >= f[i]) {
                x[k] = 1;
                i = k;
            } else {
                x[k] = 0;
            }
        }
        return x;
    }

}
