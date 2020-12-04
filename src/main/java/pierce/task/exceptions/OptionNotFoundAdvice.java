package pierce.task.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OptionNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(OptionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String optionNotFoundHandler(OptionNotFoundException ex) {
        return ex.getMessage();
    }
}
