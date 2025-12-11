package view;

import controller.Controller;

// BEGIN PASO 1
// Clase abstracta BaseView según el PDF [cite: 239, 250]
public abstract class BaseView {
    
    protected Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    // Métodos abstractos requeridos [cite: 254]
    public abstract void init();
    public abstract void showMessage(String msg);
    public abstract void showErrorMessage(String errorMsg);
    public abstract void end();
}
// END PASO 1