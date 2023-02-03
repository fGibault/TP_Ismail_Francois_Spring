package controlleur;

import modele.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.ReservationService;

import java.util.List;

@RestController
public class ReservationControlleur {
    @Autowired
    private ReservationService reservationService;

    public ReservationControlleur(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @GetMapping("/reservations")
    public List<Reservation> list(){
        return reservationService.listsAll();
    }
    @PostMapping  //inserer Reservation
    public void registerNewReservation(@RequestBody Reservation reservation){reservationService.save(reservation);}
}
