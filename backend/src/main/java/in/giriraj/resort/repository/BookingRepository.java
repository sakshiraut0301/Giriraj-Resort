package in.giriraj.resort.repository;

import in.giriraj.resort.model.Booking;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
  List<Booking> findByGuestIdOrderByCheckInDesc(UUID guestId);
  long countByStatusIn(List<Booking.Status> statuses);
}
