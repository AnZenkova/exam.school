package pro.sky.exam.school.by.Zenkova;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.exam.school.by.Zenkova.QuestionServiceImpl.ExaminerServiceImpl;
import pro.sky.exam.school.by.Zenkova.QuestionServiceImpl.JavaQuestionService;
import pro.sky.exam.school.by.Zenkova.Service.ExaminerService;
import pro.sky.exam.school.by.Zenkova.Service.QuestionService;
import pro.sky.exam.school.by.Zenkova.data.Question;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {

    @Mock
    private QuestionService questionService;

    @InjectMocks
    private ExaminerService examinerService = new ExaminerServiceImpl(questionService);

    @Test
//    public void getQuestions() {
//        List<Question> questions = new ArrayList<Question>();
//        questions.add(new Question("Что такое переменная?", "Переменная — это ячейка в памяти компьютера, которой можно присвоить имя и в которой можно хранить данные."));
//
//        Mockito.when(examinerService.getQuestions(1)).thenReturn(questions);
//        List<Question> questions1 = new ArrayList<>(examinerService.getQuestions(1));
//
//        assertEquals(questions1.get(0), questions);
//    }
//}
