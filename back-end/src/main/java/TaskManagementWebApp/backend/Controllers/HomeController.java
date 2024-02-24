package TaskManagementWebApp.backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/profile")
    public String profile() {
        return "This is profile page";
    }
}
