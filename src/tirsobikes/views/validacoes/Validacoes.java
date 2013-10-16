/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.views.validacoes;

/**
 *
 * @author Lemaun
 */
public class Validacoes {

    //valida numero
    public static boolean validaNumero(String numero) {
        try {
            double d = Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
