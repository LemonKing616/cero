import java.util.Scanner;

public class JardínFloreciente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se lee el array
        int[][] jardín = new int[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                jardín[i][j] = sc.nextInt();
            }
        }

        // Se recorre el array para encontrar las flores que florecerán
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (jardín[i][j] == 1) {
                    // Si la flor está colindante con agua, puede florecer
                    if (jardín[i][j - 1] == 2 || jardín[i][j + 1] == 2 || jardín[i - 1][j] == 2 || jardín[i + 1][j] == 2 || jardín[i - 1][j - 1] == 2 || jardín[i - 1][j + 1] == 2 || jardín[i + 1][j - 1] == 2 || jardín[i + 1][j + 1] == 2) {
                        // Si la flor está colindante con una abeja, puede florecer
                        if (jardín[i][j - 3] == 5 || jardín[i][j + 3] == 5 || jardín[i - 3][j] == 5 || jardín[i + 3][j] == 5 || jardín[i - 3][j - 3] == 5 || jardín[i - 3][j + 3] == 5 || jardín[i + 3][j - 3] == 5 || jardín[i + 3][j + 3] == 5) {
                            // Si la flor no está colindante con una mala hierba, puede florecer
                            if (jardín[i][j - 2] != 3 && jardín[i][j + 2] != 3 && jardín[i - 2][j] != 3 && jardín[i + 2][j] != 3 && jardín[i - 2][j - 2] != 3 && jardín[i - 2][j + 2] != 3 && jardín[i + 2][j - 2] != 3 && jardín[i + 2][j + 2] != 3) {
                                System.out.println("La flor de la posición " + i + "," + j + " florecerá");
                            }
                        }
                    }
                }
            }
        }
    }
}