package controle;

import dao.Dao;
import dao.DaoAnimal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Animal;
import modelo.ConsultaAnimal;
import modelo.Tutor;

@Named
@ViewScoped
public class NovaConsultaControle implements Serializable {
    private Animal animal;
    //private Dao<Animal> daoAnimal;
    private Dao<Tutor> daotutor;
    private List<Animal> listaAnimais;
    private List<Tutor> listaTutores;
    private Tutor tutor;
    private ConsultaAnimal consulta;
    private DaoAnimal daoAnimal;
    private Dao<ConsultaAnimal> daoConsulta;

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @PostConstruct
    public void iniciar() {
        setAnimal(new Animal());
        consulta= new ConsultaAnimal();
        daoAnimal = new DaoAnimal();
        daotutor = new Dao(Tutor.class);
        daoConsulta = new Dao(ConsultaAnimal.class);
        setListaTutores(daotutor.listarTodos());
    }
    

    public ConsultaAnimal getConsulta() {
        return consulta;
    }

    public void setConsulta(ConsultaAnimal consulta) {
        this.consulta = consulta;
    }

    public void setListaTutores(List<Tutor> listaTutores) {
        this.listaTutores = listaTutores;
    }

    public List<Tutor> getListaTutores() {
        return listaTutores;
    }
    
    public void inserir() {
        daoConsulta.inserir(consulta);
        animal = new Animal();
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
            (FacesMessage.SEVERITY_INFO, "Tutor cadastrado", null)
            );
    }
    
     public void atualizar(){
        listaAnimais = daoAnimal.buscarPorTutor(tutor.getId());
        
    }
       
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Animal> getListaAnimais() {
        return listaAnimais;
    }

    
}