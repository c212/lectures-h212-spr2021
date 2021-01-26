// switch to APS

import java.util.Scanner;
import java.math.BigInteger;

public class One {
  public static void main(String[] args) {
    Scanner finn;
    finn = new Scanner(System.in);
    System.out.print("Type: ");
    String line = finn.nextLine();
    int index = Integer.parseInt( line ); // parses and converts
    System.out.println("The " + index + "-th Fibonacci number is: " + fibo(index));
  }
  public static BigInteger fibo(int index) {
    if (index == 0) return new BigInteger("1");
    if (index == 1) return BigInteger.ONE;
    return One.helper(BigInteger.ONE, BigInteger.ONE, 2, index);
  }
  public static BigInteger helper(BigInteger older, BigInteger old, int count, int limit) {
    if (count == limit) return old.add(older);
    else {
      System.out.println( count + ": " + (old.add(older)) );
      return One.helper( old, (old.add(older)), count + 1, limit );
    }
  }
}



