package com.svlada.entity;

/**
 * Created by dsarmiento on 05/04/2017.
 */
import javax.persistence.*;

@Entity
@Table(name="hero")
public class Hero {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="secreto")
    private boolean secreto;

    public Hero()
    {

    }

    public Hero(Long id,String name,boolean secreto)
    {
        this.id = id;
        this.name = name;
        this.secreto = secreto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getSecreto() {
        return secreto;
    }

    public void setSecreto(boolean secrete) {
        secreto = secrete;
    }
}