package com.ddm.config.exception;

import com.ddm.common.DDMResponse;
import com.ddm.common.DDMResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Jqy
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final String GLOBAL_ERROR_STRING = "GlobalError";
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({ ValidationException.class })
    @Order(-1)
    public ResponseEntity handleConstraintViolation(ValidationException ex) {
        logger.error(ex.getMessage(), ex);
        return DDMResponse.failure(DDMResponseCode.INTERNAL_ERROR, ex.getMessage());
    }

    @ExceptionHandler({ MethodArgumentNotValidException.class })
    @Order(-1)
    public ResponseEntity handleAnnotationValidation(MethodArgumentNotValidException ex) {
        logger.error(ex.getMessage(), ex);
        return DDMResponse.failure(DDMResponseCode.INTERNAL_ERROR, ex.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity globalException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return DDMResponse.failure(DDMResponseCode.INTERNAL_ERROR);
    }

}
