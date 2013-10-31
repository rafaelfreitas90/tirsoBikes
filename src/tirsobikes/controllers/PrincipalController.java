package tirsobikes.controllers;

import tirsobikes.views.PrincipalView;
import tirsobikes.views.produto.ProdutoView;

/**
 *
 * @author Rafael
 */
public class PrincipalController {

    private static PrincipalController instancia = new PrincipalController();
    private PrincipalView view = new PrincipalView();

    public PrincipalController() {
    }

    //Método para instanciar o controller.
    public static PrincipalController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.
    public void exibirInterfaceGrafica() {
        if (view == null) {
            view = new PrincipalView();
        }
        view.setVisible(true);
    }
}
