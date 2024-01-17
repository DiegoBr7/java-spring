package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;


@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer" , "handler"})
@NoArgsConstructor

public class Produto {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome ;
    private double valorUnitario;
    @Builder.Default
    private boolean disponivel = true ;

    @ManyToOne
    @JsonIgnore

    private Restaurante restaurante;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
