package pro.sky.exam.school.by.Zenkova.Service;

import pro.sky.exam.school.by.Zenkova.data.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
