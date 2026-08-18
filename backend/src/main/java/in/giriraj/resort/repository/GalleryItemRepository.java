package in.giriraj.resort.repository;
import in.giriraj.resort.model.GalleryItem; import java.util.*; import org.springframework.data.jpa.repository.JpaRepository;
public interface GalleryItemRepository extends JpaRepository<GalleryItem,UUID>{List<GalleryItem> findAllByOrderByCreatedAtDesc();}
