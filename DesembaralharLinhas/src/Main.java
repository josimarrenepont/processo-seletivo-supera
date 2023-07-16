import com.sun.org.apache.xerces.internal.impl.xs.models.XSCMUniOp;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++){
            String linha = scanner.nextLine();
            String linhaDecifrada = desembaralharLinha(linha);
        }
    }

    private static String desembaralharLinha(String linha) {
        int tamanho = linha.length();
        int meio = tamanho / 2;

        StringBuilder sb = new StringBuilder(tamanho);
        for(int i= meio - 1; i >= 0; i--){
            sb.append(linha.charAt(i));
        }
        for(int i = tamanho - 1; i >= meio; i--){
            sb.append(linha.charAt(i));
        }
        return sb.toString();
    }
}