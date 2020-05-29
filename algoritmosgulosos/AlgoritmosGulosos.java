package algoritmosgulosos;

import static algoritmosgulosos.EscalonamentoIntervalos.SDM;

/**
 *
 * @author Camila Borba Rocha
 */
public class AlgoritmosGulosos {

    public static void main(String[] args) {
        int[] s = new int[]{4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9};
        int[] f = new int[]{8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};
        int n = 11;

        int[] SDM = SDM(s, f, n);
        for (int i = 0; i < SDM.length; i++) {
            System.out.println(SDM[i]);
        }

    }

}
