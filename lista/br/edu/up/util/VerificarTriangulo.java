package lista.br.edu.up.util;

public class VerificarTriangulo {
    public static boolean lados(double l1, double l2, double l3) {
        boolean formam;

        if ((l1 < (l2 + l3)) || (l2 < (l1 + l3)) || (l3 < (l1 + l2))) {
            formam = true;
        } else {
            formam = false;
        }
        return formam;
    }
}