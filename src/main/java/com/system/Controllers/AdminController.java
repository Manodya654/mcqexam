import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.mcqexam.model.Question;
import com.mcqexam.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final QuestionService questionService;

    @GetMapping("/add-question")
    public String addQuestionForm(Model model) {
        model.addAttribute("question", new Question());
        return "add-question";
    }

    @PostMapping("/add-question")
    public String saveQuestion(Question question) {
        questionService.saveQuestion(question);
        return "redirect:/admin/add-question";
    }
}