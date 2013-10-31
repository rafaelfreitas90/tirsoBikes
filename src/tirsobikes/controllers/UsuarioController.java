package tirsobikes.controllers;

import tirsobikes.views.LoginView;

/**
 *
 * @author Rafael
 */
public class UsuarioController {
    
    private static UsuarioController instancia = new UsuarioController();
    private LoginView view = new LoginView();
    
    public UsuarioController(){
        
    }
    
    //Método para instanciar o controller.
    public static UsuarioController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new LoginView();
        }
        view.setVisible(true);
    }

}
