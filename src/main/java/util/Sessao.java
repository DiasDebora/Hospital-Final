<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802

package util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

public class Sessao {


    public static void setUsuario(Usuario usuario) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(true);
        session.setAttribute("usuarioLogado", usuario);
    }

    public static Usuario getUsuario() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(false);
        return (Usuario) session.getAttribute("usuarioLogado");
    }

    public static void invalidar() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(false);
        session.setAttribute("usuarioLogado", null);
    }
    
<<<<<<< HEAD
=======

package util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

public class Sessao {


    public static void setUsuario(Usuario usuario) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(true);
        session.setAttribute("usuarioLogado", usuario);
    }

    public static Usuario getUsuario() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(false);
        return (Usuario) session.getAttribute("usuarioLogado");
    }

    public static void invalidar() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(false);
        session.setAttribute("usuarioLogado", null);
    }
    
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
}