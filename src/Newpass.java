import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Newpass {
    Scanner scanner;
    public Newpass() {
        scanner = new Scanner(System.in);
    }
    public void addNewpass() {
        System.out.println("\n----------Új jelszó:---------------");
        System.out.println("Használat:");
        String using = this.scanner.nextLine();
        System.out.println("Jelszó:");
        String pass = this.scanner.nextLine();
        System.out.println("Folytatáshoz nyomojon egy Entert........");
        appendToFile(using, pass);
    }
    private void appendToFile(String using, String pass) {
        try {
            tryAppendToFile(using, pass);
        } catch (Exception e) {
            System.out.println("Hiba! A fáljba írás sikertelen!");
        }
    }
    private void tryAppendToFile(String using, String pass) throws IOException{
        FileWriter fileWriter = new FileWriter("data.txt",
        Charset.forName("utf-8"),
        true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        String line = using + ":" + pass;
        printWriter.println(line);
        printWriter.close();
    }
}
