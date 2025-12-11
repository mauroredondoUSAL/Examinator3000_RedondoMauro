package model;

import java.io.Serializable;

// BEGIN PASO 2
public class Option implements Serializable {
    private static final long serialVersionUID = 1L;

    private String text;      // Texto de la opción [cite: 280]
    private String rationale; // Justificación [cite: 281]
    private boolean correct;  // Si es correcta [cite: 282]

    public Option(String text, String rationale, boolean correct) {
        this.text = text;
        this.rationale = rationale;
        this.correct = correct;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getRationale() {
        return rationale;
    }
    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    public boolean isCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return text;
    }
}
// END PASO 2