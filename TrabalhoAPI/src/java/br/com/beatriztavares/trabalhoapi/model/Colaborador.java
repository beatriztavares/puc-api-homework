package br.com.beatriztavares.trabalhoapi.model;
// Generated 05/09/2017 21:17:06 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Colaborador generated by hbm2java
 */
@Entity
@Table(name="colaborador"
    ,catalog="trabalho_api"
    , uniqueConstraints = @UniqueConstraint(columnNames="login") 
)
@XmlRootElement
public class Colaborador  implements java.io.Serializable {


     private Integer codigo;
     private String nome;
     private String login;
     private Integer perfil;
     private String senha;

    public Colaborador() {
    }

    public Colaborador(String nome, String login, Integer perfil, String senha) {
       this.nome = nome;
       this.login = login;
       this.perfil = perfil;
       this.senha = senha;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="codigo", unique=true, nullable=false)
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="nome", length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="login", unique=true, length=60)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="perfil")
    public Integer getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

    
    @Column(name="senha", length=60)
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }




}


