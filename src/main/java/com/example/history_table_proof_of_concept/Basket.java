package com.example.history_table_proof_of_concept;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "basket")
@Audited
public class Basket {

    public Basket(Integer id, String count) {
        this.id = id;
        this.count = count;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name="hibernate_sequence", sequenceName ="hibernate_sequence", allocationSize = 1)
    private Integer id;

    @Column
    private String count;

//    @OneToMany(mappedBy="basket")
////    @Transient
//    private List<Fruit> fruits;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public List<Fruit> getFruits() {
//        return fruits;
//    }
//
//    public void setFruits(List<Fruit> fruits) {
//        this.fruits = fruits;
//    }

    public Basket() {
    }
}
