<<<<<<< HEAD
<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author temporario
 */

@Entity
public class Animal implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Integer Id;

    public Animal() {
    }
    
    @Column (length = 30)
    private String especie;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.Id);
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }
    
    @Column (length = 30)
    private String raca;
    
    @Column (length = 30)
    private String nome;
    
    @Column
    private Integer idade;
    
    @ManyToOne
    @JoinColumn( name = "tutor", 
            referencedColumnName = "Id")
    private Tutor tutor;

    public Integer getId() {
        return Id;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
    
  
    
}
=======
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
package modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Animal implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Integer id; 
    
    @Column (length = 30)
    private String especie; 
    
    @Column (length = 30)
    private String raca; 
    
    @Column (length = 30)
    private String nome;
    
    @Column 
    private Integer idade; 
    
    @ManyToOne
    @JoinColumn( name = "tutor", referencedColumnName = "id")
    private Tutor tutor; 
    
    @OneToMany (mappedBy = "animal",
            fetch = FetchType.EAGER,
            cascade = CascadeType.MERGE)
    private List<Consulta> consultas; 
    
 
    public Animal() {
    }

    public Animal(Integer id, String especie, String raca, Integer idade, Tutor tutor) {
        this.id = id;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.tutor = tutor;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    

}
<<<<<<< HEAD
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
=======
>>>>>>> 73ebb0adc5a8d857450f95cde0c142adec861802
