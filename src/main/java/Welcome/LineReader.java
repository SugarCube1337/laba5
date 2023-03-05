package Welcome;

import java.util.Scanner;

/**
 * The class reads the data entered by the user,
 *  and also outputs a message to the user and a message
 *  about the error
 */

public class LineReader implements Welcome.ConsoleReader {
    private Scanner scanner;
    public LineReader(){
        this.scanner = new Scanner(System.in);
    }
    public LineReader(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
