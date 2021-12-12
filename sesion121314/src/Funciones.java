import java.util.Scanner;

public class Funciones {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un nombre: ");
            String name = entrada.nextLine();

            removeVowels(name);

            removeConsonants(name);

        }

        private static void removeVowels(String name) {
            if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
                System.out.println(name.replaceAll("[aeiouAEIOU]", ""));
            } else {
                System.out.println(name);
            }
            System.out.println();
        }

        private static void removeConsonants(String name) {
            if (!name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
                System.out.println(name.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", ""));
            } else {
                System.out.println(name);
            }
            System.out.println();
        }
    }
