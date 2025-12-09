public class Strings {

  public static void main(String[] args) {

    String name = "Raul";
    var surname = new String("Ruiz");

    // Operadores
    System.out.println(name + " " + surname);

    // Longitud
    System.out.println(name.length());

    System.out.println(name.charAt(name.length() - 1));

    // Subcadena
    System.out.println(name.substring(1));
    System.out.println(name.substring(1, 2));

    // Mayusculas y minusculas
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());

    // Comprobar si tiene algo
    System.out.println("Hola, Java".contains("Raul"));
    System.out.println("Hola, Java".contains("ava"));

    // Comparacion
    System.out.println(name.equals("Raul"));
    System.out.println(name.equalsIgnoreCase("raul"));

    // Trim
    System.out.println("     Hola         ".trim());

    // Replace
    System.out.println("     Hola         ".replace("H", "h").trim());

    // Format
    int age = 28;
    System.out.println(String.format("Hola %s, tienes %d de edad", name, age));

  }
}
