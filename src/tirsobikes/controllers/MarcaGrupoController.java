package tirsobikes.controllers;

import tirsobikes.views.ProdutoView;
import tirsobikes.views.ProdutoViewAddMarcaGrupo;

/**
 *
 * @author Rafael
 */
public class MarcaGrupoController {
    
    private static MarcaGrupoController instancia = new MarcaGrupoController();
    private ProdutoViewAddMarcaGrupo view = new ProdutoViewAddMarcaGrupo();
    
    public MarcaGrupoController(){
        
    }
    
    //Método para instanciar o controller.
    public static MarcaGrupoController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new ProdutoViewAddMarcaGrupo();
        }
        view.setVisible(true);
    }
    
}
