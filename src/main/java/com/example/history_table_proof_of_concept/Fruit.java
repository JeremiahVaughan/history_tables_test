package com.example.history_table_proof_of_concept;

import org.hibernate.envers.Audited;

import javax.persistence.*;


@Entity
@Table(name = "fruit")
@Audited
public class Fruit {

    public Fruit(Integer id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name="hibernate_sequence", sequenceName ="hibernate_sequence", allocationSize = 1)
    private Integer id;

    @Column
    private String name;

    @Column
    private String color;

    @Column
    private String texture;

    @Column
    private String taste;

//    @ManyToOne
//    @JoinColumn(name = "basket_id")
//    private Basket basket;

    @Column
    private Integer basket_id;

    public Integer getBasket_id() {
        return basket_id;
    }

    public void setBasket_id(Integer basket_id) {
        this.basket_id = basket_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit() {

    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
