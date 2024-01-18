package com.consulta.automotores.exception;

public class NotFoundException extends RuntimeException {
    private final ErrorCode errorCode;

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode.getDefaultMessage());
        this.errorCode = errorCode;
    }

    public NotFoundException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getDefaultMessage(), cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
