import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApplication {

    static final String FILE_NAME = "notes.txt";
    static Scanner sc = new Scanner(System.in);

    static void writeNote() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            System.out.print("Enter your note: ");
            sc.nextLine();
            String note = sc.nextLine();

            bw.write(note);
            bw.newLine();
            bw.close();

            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing note.");
        }
    }

    static void readNotes() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            System.out.println("\nYour Notes:");
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("No notes found.");
        }
    }

    static void clearNotes() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
            bw.write("");
            bw.close();
            System.out.println("All notes cleared.");
        } catch (IOException e) {
            System.out.println("Error clearing notes.");
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nNotes Application");
            System.out.println("1. Write Note");
            System.out.println("2. View Notes");
            System.out.println("3. Clear Notes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    writeNote();
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    clearNotes();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
