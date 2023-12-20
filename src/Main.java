public class App {
    public static void main(String[] args) {
        // Создаем модель, представление и презентер
        ReservationModel model = new ReservationModel();
        ReservationView view = new ConsoleReservationView();
        ReservationPresenter presenter = new ConcreteReservationPresenter(model, view);

        // Бронирование столика
        presenter.onBookTable(1, "John Doe", "2023-01-01");
        presenter.onBookTable(2, "Jane Smith", "2023-01-02");

        // Отображение всех бронирований
        presenter.displayAllReservations();

        // Отмена бронирования
        List<Reservation> reservations = model.getAllReservations();
        if (!reservations.isEmpty()) {
            Reservation reservationToCancel = reservations.get(0);
            presenter.onCancelBooking(reservationToCancel);
        }

        // Повторное отображение всех бронирований
        presenter.displayAllReservations();
    }
}
