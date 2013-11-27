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
public class FormatarData {

    // Converte uma String para um objeto Date para o banco 
    public static Date forDB(String data) {
        if (data == null || data.equals("")) {
            return null;
        }

        java.util.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new Date(((java.util.Date) formatter.parse(data)).getTime());
        } catch (ParseException e) {
        }
        return date;
    }

    // Converte a data do banco para String
    public static String forUser(Date data) {
        if (data == null || data.equals("")) {
            return null;
        }

        String date = null;
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        date = formatter.format(data);
        return date;
    }

    public static Date juntaDataHota(String data, String hora) {
        Date dataHora = new Date();
        String juntas = data + hora;
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (data == null || hora == null) {
            return null;
        }

        try {
            dataHora = new Date(((java.util.Date) formatter.parse(juntas)).getTime());
        } catch (ParseException e) {
        }
        return dataHora;
    }
}
