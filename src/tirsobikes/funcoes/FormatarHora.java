/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.funcoes;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Lemaun
 */
public class FormatarHora {

    // Converte uma String para um objeto Date para o banco 
    public static Date forDB(String hora) {
        if (hora == null || hora.equals("")) {
            return null;
        }

        java.util.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("HH:mm");
            date = new Date(((java.util.Date) formatter.parse(hora)).getTime());
        } catch (ParseException e) {
        }
        return date;
    }

    // Converte a data do banco para String
    public static String forUser(Date hora) {
        if (hora == null || hora.equals("")) {
            return null;
        }

        String date = null;
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        date = formatter.format(hora);
        return date;
    }

}
