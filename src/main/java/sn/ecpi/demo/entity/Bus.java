package sn.ecpi.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name="_bus")
@Getter
@Setter
@NoArgsConstructor
public class Bus {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable = false)
    private String modele;
    @Column(length = 4, nullable = false)
    private int anneeFabrication;
    @Column(nullable = false)
    private String capacitePassagers;
    @Column(nullable = false)
    private  double kilometrage;
    private String description;
}
