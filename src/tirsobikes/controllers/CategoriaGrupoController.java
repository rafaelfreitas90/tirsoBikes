package tirsobikes.controllers;

import tirsobikes.views.produto.ProdutoAddMarcaGrupoView;

/**
 *
 * @author Rafael
 */
public class CategoriaGrupoController {

    private static CategoriaGrupoController instancia = new CategoriaGrupoController();
    private ProdutoAddMarcaGrupoView view;

    public CategoriaGrupoController() {
    }

    //Método para instanciar o controller.
    public static CategoriaGrupoController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(String tipo) {
        view = new ProdutoAddMarcaGrupoView(tipo);
        view.setModal(true);
        view.setVisible(true);
    }
}
