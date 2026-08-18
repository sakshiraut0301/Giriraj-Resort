package in.giriraj.resort.config;

import in.giriraj.resort.model.User;
import in.giriraj.resort.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DemoDataConfig {
  @Bean CommandLineRunner seedAdmin(UserRepository users, PasswordEncoder passwords) {
    return args -> { if (users.findByEmailIgnoreCase("girirajresortmulshi@gmail.com").isEmpty()) {
      User admin = new User(); admin.setFullName("Giriraj Resort Admin"); admin.setEmail("girirajresortmulshi@gmail.com");
      admin.setPasswordHash(passwords.encode("giriraj")); admin.setRole(User.Role.ADMIN); users.save(admin);
    }};
  }
}
