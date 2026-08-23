package in.giriraj.resort.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity @Table(name="feedback")
public class Feedback {
  @Id @GeneratedValue private UUID id;
  @ManyToOne(optional=false) @JoinColumn(name="guest_id",nullable=false) private User guest;
  @Column(nullable=false,length=2000) private String message;
  private String mediaUrl;
  private String mediaType;
  @Column(nullable=false) private Instant createdAt=Instant.now();
  public UUID getId(){return id;} public User getGuest(){return guest;} public String getMessage(){return message;} public String getMediaUrl(){return mediaUrl;} public String getMediaType(){return mediaType;} public Instant getCreatedAt(){return createdAt;}
  public void setGuest(User v){guest=v;} public void setMessage(String v){message=v;} public void setMediaUrl(String v){mediaUrl=v;} public void setMediaType(String v){mediaType=v;}
}
