package pro.sky.exam.school.by.Zenkova.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LargeNumberOfQuestions extends RuntimeException{

    public LargeNumberOfQuestions(String message) {
        super(message);
    }
}
