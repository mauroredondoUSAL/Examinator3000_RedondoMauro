package model.backup;

// BEGIN PASO 5
public class QuestionBackupIOException extends Exception {
    public QuestionBackupIOException(String message) {
        super(message);
    }
    public QuestionBackupIOException(String message, Throwable cause) {
        super(message, cause);
    }
}
// END PASO 5