package in.giriraj.resort.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity @Table(name = "rooms")
public class Room {
  @Id @GeneratedValue private UUID id;
  @Column(nullable = false, unique = true) private String roomNumber;
  @Column(nullable = false) private String name;
  @Column(nullable = false) private BigDecimal price;
  @Column(nullable = false, length = 1500) private String amenities;
  private String photoUrl;
  public UUID getId() { return id; } public String getRoomNumber() { return roomNumber; } public String getName() { return name; } public BigDecimal getPrice() { return price; } public String getAmenities() { return amenities; } public String getPhotoUrl() { return photoUrl; }
  public void setRoomNumber(String v) { roomNumber=v; } public void setName(String v) { name=v; } public void setPrice(BigDecimal v) { price=v; } public void setAmenities(String v) { amenities=v; } public void setPhotoUrl(String v) { photoUrl=v; }
}
