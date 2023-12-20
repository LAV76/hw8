public class Reservation {
    private int tableNumber;
    private String clientName;
    private String date;

    // Конструктор, геттеры и сеттеры

    @Override
    public String toString() {
        return "Reservation{" +
                "tableNumber=" + tableNumber +
                ", clientName='" + clientName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}