package service;

import modele.Reservation;
import repository.ReservationRepository;

import java.util.List;

public class ReservationService {
    private ReservationRepository reservationRepository;
    public List<Reservation> listsAll() {

        return reservationRepository.findAll();
    }

    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
