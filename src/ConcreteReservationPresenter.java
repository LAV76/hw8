public class ConcreteReservationPresenter implements ReservationPresenter {
    private ReservationModel model;
    private ReservationView view;

    public ConcreteReservationPresenter(ReservationModel model, ReservationView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onBookTable(int tableNumber, String clientName, String date) {
        Reservation reservation = new Reservation(tableNumber, clientName, date);
        model.addReservation(reservation);
        displayAllReservations();
    }

    @Override
    public void onCancelBooking(Reservation reservation) {
        model.cancelReservation(reservation);
        displayAllReservations();
    }

    @Override
    public void displayAllReservations() {
        view.displayReservations(model.getAllReservations());
    }
}