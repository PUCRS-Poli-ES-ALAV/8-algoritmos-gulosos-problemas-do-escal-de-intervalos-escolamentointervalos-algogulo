package algoritmosgulosos;

/**
 *
 * @author Camila Borba Rocha
 */
public class EscalonamentoIntervalos {
     public static int[] SDM(int[] s, int[] f, int n) {
        int[] x = new int[n];
        int k;
        for (int i = 1; i <= n; i++) {
                x[i] = 1;
                k= i+1;
                while(k<n && s[k] < f[i]){
                    k = k + 1;
                }
                i = k;
        }
        return x;
    }
}
