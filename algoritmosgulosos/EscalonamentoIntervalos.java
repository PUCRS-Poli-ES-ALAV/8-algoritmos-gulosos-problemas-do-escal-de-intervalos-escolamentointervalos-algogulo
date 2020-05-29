package algoritmosgulosos;


/**
 *
 * @author Camila Borba Rocha
 */
public class EscalonamentoIntervalos {

    public static int[] SDM(int[] s, int[] f, int n) {
        if (s.length > f.length) {
            int[] x = new int[s.length];
        } else {
            int[] x = new int[f.length];
        }
        int[] x = new int[n];
        x[1] = 1;
        int j = 0;
        for (int k = 2; k < n; k++) {
            if (s[k] >= f[j]) {
                x[k] = 1;
                j = k;
            } else {
                x[k] = 0;
            }
        }
        return x;
    }

}
