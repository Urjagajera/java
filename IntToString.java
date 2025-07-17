import java.util.*;

public class IntToString {
   
public static void main(String[] args) {


   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();

   
String s = String.valueOf(n);

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } 
 
 }
}
