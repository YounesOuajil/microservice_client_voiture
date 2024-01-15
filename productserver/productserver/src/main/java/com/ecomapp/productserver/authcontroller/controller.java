// UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/client/dashboard")
    public String clientDashboard() {
        return "client/dashboard";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin/dashboard";
    }
}
