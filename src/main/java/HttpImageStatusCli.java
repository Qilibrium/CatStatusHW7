import java.util.Scanner;

public class HttpImageStatusCli {
    void askStatus() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code");

        if (scanner.hasNextInt()) {

            new HttpStatusImageDownloader().downloadStatusImage(scanner.nextInt());

        } else if (scanner.hasNextLine()) {
            System.out.println("Please enter valid number");
        }
    }
}
