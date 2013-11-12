/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.funcoes;

/**
 *
 * @author Lemaun
 */
public class Converter {
    
    public static String banco(String valor){        
        String valorConvertido;
        valorConvertido = valor.replace(".", "");
        valorConvertido = valorConvertido.replace(",", ".");        
        return valorConvertido;
    }
    
}
