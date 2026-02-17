import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.mcqexam.service.QuestionService;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
@RequestMapping("/exam")
public class ExamController {

    private final QuestionService questionService;

    @GetMapping("/start")
    public String startExam(Model model) {
        model.addAttribute("questions", questionService.getAllQuestions());
        return "exam";
    }
}