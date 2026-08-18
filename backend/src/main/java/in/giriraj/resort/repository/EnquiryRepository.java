package in.giriraj.resort.repository;

import in.giriraj.resort.model.Enquiry;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnquiryRepository extends JpaRepository<Enquiry, UUID> { }
