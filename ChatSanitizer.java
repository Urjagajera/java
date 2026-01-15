

import java.util.*;

public class ChatSanitizer {

List<String> badwords = Arrays.asList("badword" , "dummy","stupid" );

String sanitize(String msg){
    String cleaned = msg.trim().replaceAll("\\s+" , " ");

    for(String bad : badwords){
        cleaned = cleaned.replaceAll("(?i)\\b" +bad+ "\\b", " ***");
    }
     
    if(cleaned.length() > 0){
        cleaned = cleaned.substring(0 , 1).toUpperCase() + cleaned.substring(1);
    }
    return cleaned;
}

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ChatSanitizer chatSanitizer = new ChatSanitizer();
        System.out.println("!!!!WELCOME!!!!");
        System.out.println("ENTER HERE('Exit to quit') :");

    while(true){

        String name = sc.nextLine();
     if (name.equalsIgnoreCase("exit")){
        System.out.println("CHAT IS ENDED!!");
        break;
     }
   String sanitizedMessage= chatSanitizer.sanitize(name);
   System.out.println("sanitized " + sanitizedMessage +"\n");
   }
   sc.close();
}

    }
    

