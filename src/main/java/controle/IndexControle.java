<<<<<<< HEAD
<<<<<<< HEAD
package controle;

import dao.Dao;
import dao.DaoUsuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Usuario;
import util.Sessao;

@Named
@ViewScoped
public class IndexControle implements Serializable {
    private Usuario usuario;
    DaoUsuario dao; 
    
    @PostConstruct
    public void iniciar(){
        usuario = new Usuario(); 
        dao = new DaoUsuario(); 
    }
    
    public String autenticar(){
        Usuario temp = dao.autenticar(usuario); 
        if ( temp == null ){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
            (FacesMessage.SEVERITY_ERROR, "Usuário ou senha inválidos", null)
            );
            return null ;
        }
        Sessao.setUsuario(temp);
        return "menu"; 
    }
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
=======
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
package controle;

import dao.Dao;
import dao.DaoUsuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Usuario;
import util.Sessao;

@Named
@ViewScoped
public class IndexControle implements Serializable {
    private Usuario usuario;
    DaoUsuario dao; 
    
    @PostConstruct
    public void iniciar(){
        usuario = new Usuario(); 
        dao = new DaoUsuario(); 
    }
    
    public String autenticar(){
        Usuario temp = dao.autenticar(usuario); 
        if ( temp == null ){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
            (FacesMessage.SEVERITY_ERROR, "Usuário ou senha inválidos", null)
            );
            return null ;
        }
        Sessao.setUsuario(temp);
        return "menu"; 
    }
    
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
<<<<<<< HEAD
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
}