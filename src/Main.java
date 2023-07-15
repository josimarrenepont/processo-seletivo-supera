import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        List<Integer> valoresOrdenados = ordenarValores(valores);

        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }
    }

    private static List<Integer> ordenarValores(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }

        }

    Collections.sort(pares);
    Collections.sort(impares, Collections.reverseOrder());
    List<Integer> valoresOrdenados = new ArrayList<>(pares);
    valoresOrdenados.addAll(impares);
    return valoresOrdenados;
    }

}