public class Operators {

  public static void main(String[] args) {

    // Operadores

    // Aritmeticos

    int a = 5;
    int b = 3;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    // Asignacion

    a = b;
    System.out.println(a);

    a = b * 2;
    System.out.println(a);

    a += 1; // a = a + 1;
    System.out.println(a);

    a -= 1;
    System.out.println(a);

    a *= 2;
    System.out.println(a);

    a /= 2;
    System.out.println(a);

    a %= 2;
    System.out.println(a);

    // Comparacion o relacionales

    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a >= b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a <= b);

    // Logicos

    // Y (AND)
    System.out.println(true && true);
    System.out.println(false && true);
    System.out.println(true && false);
    System.out.println(false && false);

    // O (OR)
    System.out.println(true || true);
    System.out.println(false || true);
    System.out.println(true || false);
    System.out.println(false || false);

    // NO (NOT)
    System.out.println(!true);
    System.out.println(!false);
  }
}
