package in.giriraj.resort.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity @Table(name = "bookings")
public class Booking {
  @Id @GeneratedValue private UUID id;
  @Column(nullable = false, unique = true) private String reference;
  @Column(nullable = false) private String roomName;
  private String contactNumber;
  @ManyToOne(optional = true)
  @JoinColumn(name = "guest_id", nullable = true)
  private User guest;
  private String guestName;
  private LocalDate checkIn; private LocalDate checkOut; private Integer guests; private BigDecimal totalAmount;
  @Enumerated(EnumType.STRING) private Status status = Status.PENDING;
  public enum Status { PENDING, CONFIRMED, CANCELLED, COMPLETED }
  public UUID getId() { return id; }
  public String getReference() { return reference; }
  public String getRoomName() { return roomName; }
  public String getContactNumber() { return contactNumber; }
  public User getGuest() { return guest; }
  public String getGuestName() { return guestName; }
  public LocalDate getCheckIn() { return checkIn; }
  public LocalDate getCheckOut() { return checkOut; }
  public Integer getGuests() { return guests; }
  public BigDecimal getTotalAmount() { return totalAmount; }
  public Status getStatus() { return status; }
  public void setReference(String reference) { this.reference = reference; }
  public void setRoomName(String roomName) { this.roomName = roomName; }
  public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
  public void setGuest(User guest) { this.guest = guest; }
  public void setGuestName(String guestName) { this.guestName = guestName; }
  public void setCheckIn(LocalDate checkIn) { this.checkIn = checkIn; }
  public void setCheckOut(LocalDate checkOut) { this.checkOut = checkOut; }
  public void setGuests(Integer guests) { this.guests = guests; }
  public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
  public void setStatus(Status status) { this.status = status; }
}
