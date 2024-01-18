package com.consulta.automotores.exception;

public enum ErrorCode {
    NOT_FOUND("P001", "No se encontraron propietarios"),
    DATA_ACCESS("P002", "Error al acceder a la base de datos");
    // Agrega más códigos de error según sea necesario...

    private final String code;
    private final String defaultMessage;

    ErrorCode(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public String getCode() {
        return code;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}

