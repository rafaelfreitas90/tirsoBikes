package tirsobikes.controllers;

import tirsobikes.views.fornecedor.FornecedorAlterarView;
import tirsobikes.views.fornecedor.FornecedorView;

/**
 *
 * @author Rafael
 */
public class FornecedorAlterarController {
    
    private static FornecedorAlterarController instancia = new FornecedorAlterarController();
    private FornecedorAlterarView view = new FornecedorAlterarView();
    
    public FornecedorAlterarController(){
        
    }
    
    //Método para instanciar o controller.
    public static FornecedorAlterarController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new FornecedorAlterarView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

}
