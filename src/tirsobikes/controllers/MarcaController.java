package tirsobikes.controllers;

import tirsobikes.views.produto.ProdutoAddMarcaGrupoView;
import tirsobikes.views.produto.ProdutoView;

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
<<<<<<< HEAD
    public void exibirInterfaceGrafica(String tipo) {
        view = new ProdutoAddMarcaGrupoView(tipo);
        view.setModal(true);
        view.setVisible(true);
    }
=======
   public void exibirInterfaceGrafica(String tipo){           
        if (view == null){
            view = new ProdutoViewAddMarcaGrupo(tipo);
            
        }
        
        view.setVisible(true);
    }
   

    
>>>>>>> 440650086568349834966d0d1e884d57c751361a
}
