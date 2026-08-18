package in.giriraj.resort.repository;
import in.giriraj.resort.model.Room;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoomRepository extends JpaRepository<Room, UUID> { }
