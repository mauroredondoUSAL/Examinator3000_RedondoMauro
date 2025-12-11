package model.repository;

import model.Question;
import java.util.List;

// BEGIN PASO 3
public interface IRepository {
    void addQuestion(Question q) throws RepositoryException;
    void removeQuestion(Question q) throws RepositoryException;
    void modifyQuestion(Question q) throws RepositoryException;
    List<Question> getAllQuestions() throws RepositoryException;
    
    // Nuevo método para persistir cambios
    void save() throws RepositoryException;
}
// END PASO 3