public class ConstantesAndVariables {

  public static void main(String[] args) {

    // Variables

    String name = "Raul";
    System.out.println(name);

    name = "MrRaso";
    System.out.println(name);

    int age = 28;
    System.out.println(age);

    var email = "raul.ruiz.bolivar@gmail.com";
    System.out.println(email);
    email = email.concat(".prueba");
    System.out.println(email);

    // Constantes

    final String EMAIL = "raul.ruiz.bolivar@gmail.com";
    System.out.println(EMAIL);
  }
}
