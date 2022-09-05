<<<<<<< HEAD
<<<<<<< HEAD

package dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Usuario;
import util.JpaUtil;

public class DaoUsuario implements Serializable{
    EntityManager manager;
    
    public Usuario autenticar(Usuario u) {
        Usuario temp = null;
        manager = JpaUtil.getEntityManager();
        String sql = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha";
        TypedQuery<Usuario> query = manager.createQuery(sql, Usuario.class);
        query.setParameter("login", u.getLogin());
        query.setParameter("senha", u.getSenha());
        try {
            temp = query.getSingleResult();
        } catch (Exception e) {  
            temp = null; 
        } finally {
            manager.close();
        }
        return temp;
    }
    
}
=======
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802

package dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Usuario;
import util.JpaUtil;

public class DaoUsuario implements Serializable{
    EntityManager manager;
    
    public Usuario autenticar(Usuario u) {
        Usuario temp = null;
        manager = JpaUtil.getEntityManager();
        String sql = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha";
        TypedQuery<Usuario> query = manager.createQuery(sql, Usuario.class);
        query.setParameter("login", u.getLogin());
        query.setParameter("senha", u.getSenha());
        try {
            temp = query.getSingleResult();
        } catch (Exception e) {  
            temp = null; 
        } finally {
            manager.close();
        }
        return temp;
    }
    
    public boolean jaExiste(String login) {
        Usuario temp = null;
        boolean existe = false; 
        manager = JpaUtil.getEntityManager();
        String sql = "SELECT u FROM Usuario u WHERE u.login = :login";
        TypedQuery<Usuario> query = manager.createQuery(sql, Usuario.class);
        query.setParameter("login", login);
        try {
            temp = query.getSingleResult();
            existe = true; 
        } catch (Exception e) {  
            temp = null; 
        } finally {
            manager.close();
        }
        return existe;
    }
    
}
<<<<<<< HEAD
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
