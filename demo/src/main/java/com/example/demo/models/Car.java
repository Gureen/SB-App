package com.example.demo.models;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String brand;
    private String color;
    private int cost;
    private int horsepower;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private LocalDate date;


    public Car(String name, String brand, String color, int cost, int horsepower) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.cost = cost;
        this.horsepower = horsepower;

    }



}
