
public class StringsExercises {

  public static void main(String[] args) {

    String a = "    Hola    ";
    String b = "Raul";

    // 1. Concatena dos cadenas de texto.
    System.out.println(a + b);
    // 2. Muestra la longitud de una cadena de texto
    System.out.println(a.length());
    // 3. Muestra el primer y ultimo caracter de un string
    System.out.println(b.charAt(0));
    System.out.println(b.charAt(b.length() - 1));
    // 4. Convierte a mayusculas y minusculas un string
    System.out.println(b.toLowerCase());
    System.out.println(b.toUpperCase());
    // 5. Comprueba si un string contiene una palabra concreta
    System.out.println(a.contains(b));
    // 6. Formatea un string con un entero
    System.out.println(String.format("Tu edad es %d", 28));
    // 7. Elimina los espacios al principio y al final de un string
    System.out.println(a.trim());
    // 8. Sustituye todos los espacios de un string con guiones (-)
    System.out.println(a.replace(" ", "-"));
    // 9. Comprueba si dos strings son iguales
    System.out.println(a.equals(b));
    // 10. Comprueba si dos strings tienen la misma longitud
    System.out.println(a.length() == b.length());
  }
}
