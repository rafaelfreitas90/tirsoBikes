package tirsobikes.controllers;

import tirsobikes.entidades.Fornecedor;
import tirsobikes.views.fornecedor.FornecedorView;

/**
 *
 * @author Rafael
 */
public class FornecedorController {

    private static FornecedorController instancia = new FornecedorController();
    private FornecedorView view = new FornecedorView();

    public FornecedorController() {
    }

    //Método para instanciar o controller.
    public static FornecedorController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.
    public void exibirInterfaceGrafica() {
        if (view == null) {
            view = new FornecedorView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

    public void exibirInterfaceGrafica2(Fornecedor fornecedor) {
        view = new FornecedorView(fornecedor);
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
}
