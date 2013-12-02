package tirsobikes.controllers;

import tirsobikes.views.produto.ProdutoAddMarcaGrupoView;

/**
 *
 * @author Rafael
 */
public class MarcaController {

    private static MarcaController instancia = new MarcaController();
    private ProdutoAddMarcaGrupoView view;

    public MarcaController() {
    }

    //Método para instanciar o controller.
    public static MarcaController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(String tipo) {
        view = new ProdutoAddMarcaGrupoView(tipo);
        view.setAlwaysOnTop(true);
        view.setModal(true);
        view.setVisible(true);
    }

}
