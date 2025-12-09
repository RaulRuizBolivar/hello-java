public class BeginnerExercises {

  public static void main(String[] args) {

    // 1. Declara una variable de tipo String y asignale tu nombre.
    String name = "Raul";
    // 2. Crea una variable de tipo int y asignale tu edad.
    int age = 28;
    // 3. Crea una variable de tipo double con tui altura en metros.
    double height = 1.78;
    // 4. Declara una variable de tipo boolean que indique si te gusta programar.
    boolean loveProgramming = true;
    // 5. Declara una constante con tu email.
    final String email = "raul.ruiz.bolivar@gmail.com";
    // 6. Crea una variable de tipo char y guardale tu inicial.
    char initial = 'R';
    // 7. Declara una variable de tipo String con tu localidad, y a continuacion
    // cambia su valor y vuelve a imprimirla
    String town = "Camarma de Esteruelas";
    town = "Camarma";
    System.out.println(town);
    // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
    int a = 10;
    int b = 20;
    System.out.println(a + b);
    // 9. Imprime el tipo de dos variables creadas anteriormente.
    var type1 = town.getClass().getSimpleName();
    var type2 = email.getClass().getSimpleName();
    System.out.println(type1);
    System.out.println(type2);
    // 10. Intenta declarar una variable sin inicializarla y luego asignale un valor
    // antes de imprimirla.
    // n = 12;
    // System.out.println(n);
  }
}
