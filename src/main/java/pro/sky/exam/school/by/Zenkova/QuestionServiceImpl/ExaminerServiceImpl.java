package pro.sky.exam.school.by.Zenkova.QuestionServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.exam.school.by.Zenkova.Exception.LargeNumberOfQuestions;
import pro.sky.exam.school.by.Zenkova.Service.ExaminerService;
import pro.sky.exam.school.by.Zenkova.Service.QuestionService;
import pro.sky.exam.school.by.Zenkova.data.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class ExaminerServiceImpl implements ExaminerService {

    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new LargeNumberOfQuestions("Запрошено большее количесво вопросов, чем есть в базе");
        }
        Set<Question> examine = new HashSet<>();
        while (examine.size() <= amount) {
            Question question = questionService.getRandomQuestion();
            if (examine.contains(question) || examine.contains(null)) {
                question = questionService.getRandomQuestion();
            }
                examine.add(question);
        }
        return examine;
    }
}
