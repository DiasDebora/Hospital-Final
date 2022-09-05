/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ConsultaAnimal implements Serializable  {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Integer id;
    
    @ManyToOne
    @JoinColumn( name = "animal", 
            referencedColumnName = "id")
    private Animal animal;
    
    @Column
    @Temporal(TemporalType.DATE)  
    private Date data;
    
    @Column(columnDefinition = "TEXT")
    private String detalhes;
    
    public ConsultaAnimal(){
        
}

    public Integer getId() {
        return id;
    }

    public Animal getAnimal() {
        return animal;
    }

   

    public String getDetalhes() {
        return detalhes;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

   

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
    
 }

