import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public String getMessageText(String text){
        System.out.printf("%s", text);
        return scanner.nextLine();
    }
}
