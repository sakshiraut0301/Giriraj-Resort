package in.giriraj.resort.repository;

import in.giriraj.resort.model.Feedback;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,UUID>{
  List<Feedback> findAllByOrderByCreatedAtDesc();
}
