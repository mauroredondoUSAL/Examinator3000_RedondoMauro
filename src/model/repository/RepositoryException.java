package model.repository;

// BEGIN PASO 2
// Excepción personalizada para errores del repositorio [cite: 254]
public class RepositoryException extends Exception {
    public RepositoryException(String message) {
        super(message);
    }
    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
// END PASO 2