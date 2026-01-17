import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LibraryLogger {
    private static final String LOG_FILE = "library_logs.txt";

    // Write a log entry to file
    public static void log(String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            out.println(timestamp + " - " + message);

        } catch (IOException e) {
            System.out.println("Error writing log: " + e.getMessage());
        }
    }

    // Read all logs
    public static void showLogs() {
        System.out.println("\n===== Library Logs =====");
        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No logs found.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Simulating some operations
        LibraryLogger.log("Book issued: 'Java Programming' to Student: Arhan");
        LibraryLogger.log("Book issued: 'Data Structures' to Student: Naina");
        LibraryLogger.log("Book returned: 'Java Programming' by Student: Deepak");

        // Show logs
        LibraryLogger.showLogs();
    }
}