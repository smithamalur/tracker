package me.smalur.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Smitha on 6/29/2017.
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends  RuntimeException {

    public BadRequestException(String message){
        super(message);
    }
}
