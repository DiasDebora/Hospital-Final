<<<<<<< HEAD
<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Animal;
import modelo.ConsultaAnimal;
/**
 *
 * @author temporario
 */
@Named
@ViewScoped
public class ConsultaControle implements Serializable{
    
    private Dao<Animal> daoAnimal;
    private Dao<ConsultaAnimal> daoConsulta;
    private List<Animal> animais;
    private ConsultaAnimal consulta;
    
     @PostConstruct
    public void iniciar() {
        daoAnimal = new Dao(Animal.class);
        daoConsulta = new Dao(ConsultaAnimal.class);      
        setConsulta(new ConsultaAnimal());
        setAnimais(daoAnimal.listarTodos());
    }
    
    public void inserir() {
        daoConsulta.inserir(getConsulta());
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Consulta inserida", null));
        setConsulta(new ConsultaAnimal());
        
        
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public ConsultaAnimal getConsulta() {
        return consulta;
    }

    public void setConsulta(ConsultaAnimal consulta) {
        this.consulta = consulta;
    }

    
    
}
=======
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
package controle;

import dao.Dao;
import dao.DaoAnimal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Animal;
import modelo.Consulta;
import modelo.Tutor;

@Named
@ViewScoped
public class ConsultaControle implements Serializable {

    private Dao<Tutor> daoTutor;
    private Dao<Consulta> daoConsulta;
    private DaoAnimal daoAnimal;
    private List<Tutor> tutores;
    private List<Animal> animais;
    private Consulta consulta;
    private Tutor tutorSelecionado; 
    private Animal animalSelecionado; 
    private boolean mostraPopup; 

    @PostConstruct
    public void iniciar() {
        daoTutor = new Dao(Tutor.class);
        daoConsulta = new Dao(Consulta.class);
        daoAnimal = new DaoAnimal();
        tutores = daoTutor.listarTodos();
        consulta = new Consulta();
        consulta.setDataConsulta(new java.util.Date());
        animais = new ArrayList(); 
        tutorSelecionado = new Tutor(); 
        animalSelecionado = new Animal();
        mostraPopup = false; 
    }
    
    public void inserirConsulta(){
        consulta.setAnimal(animalSelecionado);
        daoConsulta.inserir(consulta);
        animalSelecionado.getConsultas().add(consulta);
        consulta = new Consulta();
        consulta.setDataConsulta(new java.util.Date());         
        this.fecharPopup();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Consulta cadastrada", null));
    }
    
    public void excluirConsulta(Consulta selecionada){
        daoConsulta.excluir(selecionada.getId());
        animalSelecionado.getConsultas().remove(selecionada);
    }
    
    
    public void atualizarAnimais(){
        animais = daoAnimal.buscarPorTutor(tutorSelecionado.getId()); 
    }
    
    public void abrirPopup(){
        this.mostraPopup = true;
    }
    
    public void fecharPopup(){
        this.mostraPopup = false; 
    }

    public List<Tutor> getTutores() {
        return tutores;
    }

    public void setTutores(List<Tutor> tutores) {
        this.tutores = tutores;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Tutor getTutorSelecionado() {
        return tutorSelecionado;
    }

    public void setTutorSelecionado(Tutor tutorSelecionado) {
        this.tutorSelecionado = tutorSelecionado;
    }

    public Animal getAnimalSelecionado() {
        return animalSelecionado;
    }

    public void setAnimalSelecionado(Animal animalSelecionado) {
        this.animalSelecionado = animalSelecionado;
    }

    public boolean isMostraPopup() {
        return mostraPopup;
    }

    public void setMostraPopup(boolean mostraPopup) {
        this.mostraPopup = mostraPopup;
    }

}
<<<<<<< HEAD
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
