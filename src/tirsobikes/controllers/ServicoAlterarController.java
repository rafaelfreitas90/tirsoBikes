package tirsobikes.controllers;

import tirsobikes.views.servico.ServicoAlterarView;

/**
 *
 * @author Rafael
 */
public class ServicoAlterarController {
    
    private static ServicoAlterarController instancia = new ServicoAlterarController();
    private ServicoAlterarView view = new ServicoAlterarView();
    
    public ServicoAlterarController(){
        
    }
    
    //Método para instanciar o controller.
    public static ServicoAlterarController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new ServicoAlterarView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

}
