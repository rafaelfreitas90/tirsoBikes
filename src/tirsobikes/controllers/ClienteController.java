package tirsobikes.controllers;

import tirsobikes.entidades.Cliente;
import tirsobikes.views.cliente.ClienteView;

/**
 *
 * @author Rafael
 */
public class ClienteController {

    private static ClienteController instancia = new ClienteController();
    private ClienteView view = new ClienteView();

    public ClienteController() {
    }

    //Método para instanciar o controller.
    public static ClienteController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.
    public void exibirInterfaceGrafica() {
        if (view == null) {
            view = new ClienteView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

    public void exibirInterfaceGrafica2(Cliente cliente) {
        view = new ClienteView(cliente);
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
}
