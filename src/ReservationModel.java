public class ReservationModel {
    private List<Reservation> reservations;

    public ReservationModel() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations);
    }
}