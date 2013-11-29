package tirsobikes.controllers;

import tirsobikes.views.cliente.ClienteAlterarView;
import tirsobikes.views.fornecedor.FornecedorAlterarView;
import tirsobikes.views.fornecedor.FornecedorView;

/**
 *
 * @author Rafael
 */
public class ClienteAlterarController {
    
    private static ClienteAlterarController instancia = new ClienteAlterarController();
    private ClienteAlterarView view = new ClienteAlterarView();
    
    public ClienteAlterarController(){
        
    }
    
    //Método para instanciar o controller.
    public static ClienteAlterarController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new ClienteAlterarView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

}
