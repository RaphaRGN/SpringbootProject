package com.raphaelprojetos.todo.models;

import jakarta.persistence.*;

@Entity
@Table(name="Lista")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String titulo;
    public int prioridade;
    public String descricao;
    public boolean realizado;

    //Getters and Setters

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}
    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {return realizado;}

    public void setRealizado(boolean realizado) {this.realizado = realizado;}

}
