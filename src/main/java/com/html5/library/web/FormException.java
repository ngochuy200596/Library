package com.html5.library.web;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/19/2016.
 */
public class FormException extends RuntimeException {
    List<Error> errors = new ArrayList<>();

    public FormException(BindingResult bindingResult) {
        List<FieldError> objectErrors = bindingResult.getFieldErrors();
        for (FieldError i : objectErrors) {
            Error e = new Error();
            e.setName(i.getField());
            e.setCode(ERROR_CODE.INVALID);
            e.setMessage(i.getDefaultMessage());
            errors.add(e);
        }
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    enum ERROR_CODE {
        INVALID,
        WRONG_FORMAT
    }

    static class Error {
        String name;
        ERROR_CODE code;
        String message;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ERROR_CODE getCode() {
            return code;
        }

        public void setCode(ERROR_CODE code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
