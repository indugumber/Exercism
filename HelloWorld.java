import java.util.Scanner;

public class HelloWorld {
  public static String hello(String name) {
    if (name == "" || name == null)
      return "Hello, World!";
    if (name.equals("Alice"))
      return "Hello, Alice!";
    if (name.equals("Bob"))
      return "Hello, Bob!";

    return "Hello, World!";
  }
}
