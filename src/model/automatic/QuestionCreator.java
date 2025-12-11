package model.automatic;

import model.Question;

// BEGIN PASO 7
public interface QuestionCreator {
    Question createQuestion(String topic) throws QuestionCreatorException;
    String getDescription();
}
// END PASO 7