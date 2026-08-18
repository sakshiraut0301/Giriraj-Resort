package in.giriraj.resort.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity @Table(name = "enquiries")
public class Enquiry {
  @Id @GeneratedValue private UUID id;
  @Column(nullable = false) private String name;
  @Column(nullable = false) private String email;
  @Column(nullable = false, length = 2000) private String message;
  @Column(nullable = false) private Instant createdAt = Instant.now();
  public UUID getId() { return id; }
  public String getName() { return name; }
  public String getEmail() { return email; }
  public String getMessage() { return message; }
  public Instant getCreatedAt() { return createdAt; }
  public void setName(String name) { this.name = name; }
  public void setEmail(String email) { this.email = email; }
  public void setMessage(String message) { this.message = message; }
}
