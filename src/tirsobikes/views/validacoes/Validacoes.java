package tirsobikes.views.validacoes;

import tirsobikes.funcoes.Converter;

/**
 *
 * @author Lemaun
 */
public class Validacoes {

    //valida numero
    public static boolean validaNumero(String numero) {
        numero = Converter.banco(numero);
        try {
            double d = Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
