// switch to APS

import java.util.Scanner;

public class One {
  public static void main(String[] args) {
    Scanner finn;
    finn = new Scanner(System.in);
    System.out.print("Type: ");
    String line = finn.nextLine();
    int index = Integer.parseInt( line ); // parses and converts
    System.out.println("The " + index + "-th Fibonacci number is: " + fibo(index));
  }
  public static int fibo(int index) {
    if (index == 0) return 1;
    if (index == 1) return 1;
    return One.helper(1, 1, 2, index);
  }
  public static int helper(int older, int old, int count, int limit) {
    if (count == limit) return old + older;
    else {
      System.out.println( count + ": " + (old + older) );
      return One.helper( old, (old + older), count + 1, limit );
    }
  }
}


