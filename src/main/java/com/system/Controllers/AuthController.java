import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.mcqexam.model.User;
import com.mcqexam.model.Role;
import com.mcqexam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {
        user.setRole(Role.STUDENT);
        userRepository.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}