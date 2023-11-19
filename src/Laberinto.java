import java.util.Scanner;

public class Laberinto {

    private static final char PARED = 'X';
    private static final char SALIDA = 'S';
    private static final char ENTRADA = 'E';

    private static final int TAMAÑO_MATRIZ = 10;

    private static char[][] laberinto;
    private static int jugadorX;
    private static int jugadorY;

    public static void main(String[] args) {
        // Creamos el laberinto
        laberinto = new char[TAMAÑO_MATRIZ][TAMAÑO_MATRIZ];
        crearLaberinto();

        // Situamos al jugador en la entrada
        jugadorX = 0;
        jugadorY = 0;

        // Bucle principal del juego
        while (true) {
            // Mostramos el laberinto
            mostrarLaberinto();

            // Solicitamos el movimiento del jugador
            char movimiento = solicitarMovimiento();

            // Movemos al jugador
            moverJugador(movimiento);

            // Comprobamos si el jugador ha ganado
            if (jugadorX == TAMAÑO_MATRIZ - 1 && jugadorY == TAMAÑO_MATRIZ - 1) {
                System.out.println("¡Has ganado!");
                break;
            }
        }
    }

    private static void crearLaberinto() {
        for (int i = 0; i < TAMAÑO_MATRIZ; i++) {
            for (int j = 0; j < TAMAÑO_MATRIZ; j++) {
                if (i == 0 || i == TAMAÑO_MATRIZ - 1 || j == 0 || j == TAMAÑO_MATRIZ - 1) {
                    laberinto[i][j] = PARED;
                } else {
                    laberinto[i][j] = ' ';
                }
            }
        }

        laberinto[0][0] = ENTRADA;
        laberinto[TAMAÑO_MATRIZ - 1][TAMAÑO_MATRIZ - 1] = SALIDA;
    }

    private static void mostrarLaberinto() {
        for (int i = 0; i < TAMAÑO_MATRIZ; i++) {
            for (int j = 0; j < TAMAÑO_MATRIZ; j++) {
                System.out.print(laberinto[i][j]);
            }
            System.out.println();
        }
    }

    private static char solicitarMovimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el movimiento (w, a, s, d):");
        String movimiento = scanner.nextLine();

        char caracterMovimiento = movimiento.charAt(0);
        if (caracterMovimiento == 'w') {
            return 'N';
        } else if (caracterMovimiento == 'a') {
            return 'O';
        } else if (caracterMovimiento == 's') {
            return 'S';
        } else if (caracterMovimiento == 'd') {
            return 'E';
        } else {
            System.out.println("Movimiento no válido");
            return solicitarMovimiento();
        }
    }

    private static void moverJugador(char movimiento) {
        switch (movimiento) {
            case 'N':
                jugadorY--;
                break;
            case 'O':
                jugadorX--;
                break;
            case 'S':
                jugadorY++;
                break;
            case 'E':
                jugadorX++;
                break;
        }

        // Comprobamos si el jugador ha chocado con una pared
        if (laberinto[jugadorX][jugadorY] == PARED) {
            System.out.println("No puedes moverte ahí");
            moverJugador(solicitarMovimiento());
        }
    }
}