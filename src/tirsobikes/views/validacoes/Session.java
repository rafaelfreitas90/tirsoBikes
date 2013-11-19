

package tirsobikes.views.validacoes;

import tirsobikes.entidades.Usuario;

/**
 *
 * @author RFSUPORTE
 */
public class Session {
    
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario usuarioLogado( ){
        return usuario; 
    }
    
}
