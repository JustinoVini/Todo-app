package br.com.vinjustino.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

// As linhas abaixo, geram os atributos necessarios para a classe domain todo.
@Entity
public class Todo implements Serializable {

    public static final long seriaVersionUID = 1L;

    // As anotações abaixo, definem que o ID será gerado automaticamente pelo banco.
    // e que a mesma é a nossa chave primaria.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String descricao;
    private LocalDateTime dataParaFinalizar;
    private boolean finalizado;

    // A linha abaixo cria um construtor padrão para a classe.
    public Todo(){
    }

    // A linha abaixo cria um construtor com atributos para a classe.
    public Todo(Integer id, String titulo, String descricao, LocalDateTime dataParaFinalizar, boolean finalizado) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataParaFinalizar = dataParaFinalizar;
        this.finalizado = finalizado;
    }

    // Criação dos métodos acessores.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataParaFinalizar() {
        return dataParaFinalizar;
    }

    public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
        this.dataParaFinalizar = dataParaFinalizar;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    // A linha abaixo cria o hashcode e equals da classe.

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Todo other = (Todo) obj;
        if(id == null){
            if(other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
