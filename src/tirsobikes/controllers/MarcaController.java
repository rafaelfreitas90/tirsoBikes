package tirsobikes.controllers;


import tirsobikes.views.produto.ProdutoViewAddMarcaGrupo;

/**
 *
 * @author Rafael
 */
public class MarcaController {
    
    private static MarcaController instancia = new MarcaController();
    private ProdutoViewAddMarcaGrupo view ;
    
    public MarcaController(){
        
    }
    
    //Método para instanciar o controller.
    public static MarcaController getInstancia(){
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
