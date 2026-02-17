import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.mcqexam.repository.QuestionRepository;
import com.mcqexam.model.Question;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }
}