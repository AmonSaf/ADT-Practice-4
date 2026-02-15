public class Invoice implements Document {
    @Override
    public void open() {
        System.out.println("Открыт счет-фактура.");
    }
}
