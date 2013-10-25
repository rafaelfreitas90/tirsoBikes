package tirsobikes.controllers;


import tirsobikes.views.produto.ProdutoViewAddMarcaGrupo;

/**
 *
 * @author Rafael
 */
public class CategoriaGrupoController {
    
    private static CategoriaGrupoController instancia = new CategoriaGrupoController();
    private ProdutoViewAddMarcaGrupo view ;
    
    public CategoriaGrupoController(){
        
    }
    
    //Método para instanciar o controller.
    public static CategoriaGrupoController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.    
   public void exibirInterfaceGrafica(String tipo){           
        if (view == null){
            view = new ProdutoViewAddMarcaGrupo(tipo);
        }
        
        view.setVisible(true);
    }
    
}
