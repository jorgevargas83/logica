import java.util.Scanner;

public class Logica {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Favor de ingresar una palabra:");
            String palabra = scanner.nextLine();
            System.out.println("La palabra " + palabra + " tiene un punteo de: " + calcularPunteo(palabra.toUpperCase()));
        }
    }

    public static int calcularPunteo(String palabraCalcular) {
        int punteo = 0;

        for (int i = 0; i < palabraCalcular.length(); i++) {
            switch (palabraCalcular.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'R':
                case 'S':
                case 'T':
                    punteo = punteo + 1;
                    break;

                case 'D':
                case 'G':
                    punteo = punteo + 2;
                    break;

                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    punteo = punteo + 3;
                    break;

                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    punteo = punteo + 4;
                    break;

                case 'K':
                    punteo = punteo + 5;
                    break;

                case 'J':
                case 'X':
                    punteo = punteo + 8;
                    break;

                case 'Q':
                case 'Z':
                    punteo = punteo + 10;
                    break;
            }
        }
        return punteo;
    }
}
