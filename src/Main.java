import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentCreator creator = null;

        System.out.println("Выбери документ: report / resume / letter / invoice");
        String choice = sc.nextLine();

        switch (choice) {
            case "report":
                creator = new ReportCreator();
                break;
            case "resume":
                creator = new ResumeCreator();
                break;
            case "letter":
                creator = new LetterCreator();
                break;
            case "invoice":
                creator = new InvoiceCreator();
                break;
        }

        if (creator != null) {
            Document doc = creator.createDocument();
            doc.open();
        }
    }
}
