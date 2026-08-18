package in.giriraj.resort.model;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;
@Entity @Table(name="gallery_items") public class GalleryItem {
  @Id @GeneratedValue private UUID id; @Column(nullable=false) private String mediaUrl; @Column(nullable=false) private String mediaType; @Column(nullable=false) private Instant createdAt=Instant.now();
  public UUID getId(){return id;} public String getMediaUrl(){return mediaUrl;} public String getMediaType(){return mediaType;} public Instant getCreatedAt(){return createdAt;}
  public void setMediaUrl(String v){mediaUrl=v;} public void setMediaType(String v){mediaType=v;}
}
