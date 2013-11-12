/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.controllers;

import tirsobikes.entidades.Produto;
import tirsobikes.views.produto.ProdutoAddQtdeView;

/**
 *
 * @author LuisHenrique
 */
public class QuantidadeController {

    private static QuantidadeController instancia = new QuantidadeController();
    private ProdutoAddQtdeView view;

    public QuantidadeController() {
    }

    //Método para instanciar o controller.
    public static QuantidadeController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(Produto produto) {
        view = new ProdutoAddQtdeView(produto);        
        view.setModal(true);        
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
}
