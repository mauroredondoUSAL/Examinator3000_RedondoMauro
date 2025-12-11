package model.backup;

import model.Question;
import java.util.List;

// BEGIN PASO 5
public interface QuestionBackupIO {
    void exportQuestions(List<Question> questions, String filename) throws QuestionBackupIOException;
    List<Question> importQuestions(String filename) throws QuestionBackupIOException;
}
// END PASO 5