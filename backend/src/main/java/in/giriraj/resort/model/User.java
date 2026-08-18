package in.giriraj.resort.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity @Table(name = "users")
public class User {
  @Id @GeneratedValue private UUID id;
  @Column(nullable = false) private String fullName;
  @Column(nullable = false, unique = true) private String email;
  @Column(nullable = false) private String passwordHash;
  @Enumerated(EnumType.STRING) @Column(nullable = false) private Role role = Role.GUEST;
  public enum Role { GUEST, ADMIN }
  public UUID getId() { return id; }
  public String getFullName() { return fullName; }
  public String getEmail() { return email; }
  public String getPasswordHash() { return passwordHash; }
  public Role getRole() { return role; }
  public void setFullName(String fullName) { this.fullName = fullName; }
  public void setEmail(String email) { this.email = email; }
  public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
  public void setRole(Role role) { this.role = role; }
}
