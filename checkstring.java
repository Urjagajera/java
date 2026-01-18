/* 
import java.util.Scanner;

public class checkstring {

    int countPattern(String text , String pattern){
 int count = 0;
 int index = 0;

  while( index <= text.length() - pattern.length()){
     int found = text.indexOf(pattern , index);
     if (found == -1){
        break;
     }
     count++;
     System.out.println("Match at index :" + found);
     index = found + 1;
    }

    String replacePattern(String text , String pattern){
        return text.replaceAll(Pattern.quote(pattern),"###");

        
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        checkstring scanner = new checkstring();

        System.out.println("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Enter search text: ");
        String pattern = sc.nextLine();
         
    }
}
}
*/