package com.example.project.bookmyshowbackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Theaters")
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "city",nullable = false)
    private String city; //only two values classic or premium;

    @Column(name = "address",nullable = false)
    private String address;
     // list of shows
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> listOfShows;

    //TheaterType type

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonIgnore
     private  List<TheaterSeatsEntity> listOfTheatreSeats;
    //list of theatres

}
