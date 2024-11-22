import java.util.Scanner;

public class Main {
    //Juego del ahorcado
    public static void main(String[] args) {

        // Clase escaner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asiganaciones
        String palabraSecreta = "inteligencia";
        int intetosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglo char de la palabra a adivinar
        //para char es '' comillas simples // para String es "" comillas dobles

        char[] letrasAdivinadas = new char[ palabraSecreta.length()];

        //Estructura de contrl: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }

        //Estructura de contrl: Iterativa (Bucle)
        while (!palabraAdivinada && intentos < intetosMax ){
                                                      // De las letras adivinadas es un array de letras
                                                        //lo cual forma una palabra
                                                             // Esto se usa cuando tenemos una palabra de chars
                                                             //valueOF recibe un ARRAY de Chars como parametro y lo convierte a string
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letracorrecta = false;

            //Estructura de contrl: Iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++){

                //Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letracorrecta = true;
                }
            }

            //Estructura de control condicional
            if (!letracorrecta){
                intentos++;
                System.out.println("¡Incorrecto, te quedad: " + (intetosMax - intentos) + " intentos!");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("!Felicidades!, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        //Estructura de control condicional
        if (!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos, !Game Over¡");
        }

        // Para que no se quede escuchando el teclado
        scanner.close();
    }
}