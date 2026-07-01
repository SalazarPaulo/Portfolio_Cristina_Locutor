package dev.locutor.portfolio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiExceptionHandler.class);

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<ProblemDetail> handleDatabaseError(DataAccessException exception) {
        LOGGER.error("Database access failed.", exception);
        return buildProblem(
                HttpStatus.SERVICE_UNAVAILABLE,
                "La base de datos no está disponible. Verifica Oracle XE y la configuración local."
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ProblemDetail> handleUnexpectedError(Exception exception) {
        LOGGER.error("Unexpected API error.", exception);
        return buildProblem(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Ocurrió un error interno al procesar la solicitud."
        );
    }

    private ResponseEntity<ProblemDetail> buildProblem(HttpStatus status, String detail) {
        ProblemDetail problem = ProblemDetail.forStatusAndDetail(status, detail);
        problem.setTitle(status.getReasonPhrase());
        return ResponseEntity.status(status).body(problem);
    }
}
