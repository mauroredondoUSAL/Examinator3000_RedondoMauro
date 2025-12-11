package app;

import model.Model;
import model.backup.JSONQuestionBackupIO;
import model.backup.QuestionBackupIO;
import model.repository.BinaryRepository;
import model.repository.IRepository;
import view.InteractiveView;
import controller.Controller;
import model.automatic.GeminiQuestionCreator;
import model.automatic.QuestionCreator;

import java.util.ArrayList;
import java.util.List;

// BEGIN PASO 5
public class App {
    public static void main(String[] args) {
        
        // 1. Repositorio (Persistencia Binaria)
        IRepository repository = new BinaryRepository();

        // 2. Sistema de Backup (JSON con Gson) -> NUEVO
        QuestionBackupIO backupIO = new JSONQuestionBackupIO();

        // 1. Configurar Lista de Creadores
        List<QuestionCreator> creators = new ArrayList<>();
        
        // Lógica de argumentos: java -jar app.jar -question-creator [model] [key]
        if (args.length >= 3 && args[0].equals("-question-creator")) {
            String modelId = args[1]; // ej: gemini-1.5-flash
            String apiKey = args[2];  // Tu clave AIza...
            try {
                // Instanciamos el creador con la librería GenAi
                creators.add(new GeminiQuestionCreator(modelId, apiKey));
                System.out.println("INFO: IA activada (" + modelId + ")");
            } catch (Exception e) {
                System.err.println("ADVERTENCIA: Error al configurar Gemini: " + e.getMessage());
            }
        }

        // 3. Modelo (recibe ambos)
        Model model = new Model(repository, backupIO, creators);

        // 4. Vista
        InteractiveView view = new InteractiveView();

        // 5. Controlador
        Controller controller = new Controller(model, view);

        // 6. Configurar y arrancar
        view.setController(controller);
        controller.start();
    }
}
// END PASO 5