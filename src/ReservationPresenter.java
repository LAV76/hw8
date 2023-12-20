public interface ReservationPresenter {
    void onBookTable(int tableNumber, String clientName, String date);
    void onCancelBooking(Reservation reservation);
    void displayAllReservations();
}