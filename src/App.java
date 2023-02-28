import java.security.Key;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // MainMenu mainMenu = new MainMenu();
        // mainMenu.selectMenu();
        // 128 bites kulcs (16 darab kar.)
        String key = "343834829224af82";
        Crypto c  = new Crypto();
       
        c.encrypt("titok", key);
        String cryptText = c.encrypt("titok", key);
        System.out.println(cryptText);
        String plainText = c.decrypt(cryptText, key);
        System.out.println(plainText);
    }
    
}
