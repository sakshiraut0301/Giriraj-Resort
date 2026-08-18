package in.giriraj.resort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
  @GetMapping("/") public String home() { return "forward:/index.html"; }
  @GetMapping("/rooms") public String rooms() { return "forward:/pages/rooms.html"; }
  @GetMapping("/experiences") public String experiences() { return "forward:/pages/experiences.html"; }
  @GetMapping("/contact") public String contact() { return "forward:/pages/contact.html"; }
  @GetMapping("/gallery") public String gallery() { return "forward:/pages/gallery.html"; }
  @GetMapping("/login") public String login() { return "forward:/pages/login.html"; }
  @GetMapping("/dashboard") public String dashboard() { return "forward:/pages/user-dashboard.html"; }
  @GetMapping("/admin") public String admin() { return "forward:/pages/admin-dashboard.html"; }
}
