public class ConsoleReservationView implements ReservationView {
    @Override
    public void displayReservations(List<Reservation> reservations) {
        System.out.println("Список бронирований:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
        System.out.println("--------------");
    }
}
