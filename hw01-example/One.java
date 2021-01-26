/*

-bash-4.2$ javac One.java
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
-bash-4.2$ java One
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
Type: 6
You typed: 6
6 + 3 = 63
6 + 3 = 9
-bash-4.2$ java One

 */

import java.util.Scanner;

public class One {
  public static void main(String[] args) {
    Scanner finn;
    finn = new Scanner(System.in);
    System.out.print("Type: ");
    String line = finn.nextLine();
    System.out.println("You typed: " + line);

    int index = Integer.parseInt( line ); // parses and converts

    System.out.println( line + " + 3 = " + ( line + 3 ) ); // with input 6 prints 63

    System.out.println( line + " + 3 = " + ( index + 3 ) ); // with input 6 prints 9

  }
}
