package com.example.project.bookmyshowbackend.Model;

import com.example.project.bookmyshowbackend.enums.SeatType;
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
public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private SeatType seatType; //only two values claassic or premium;
    private String city;
     // list of shows

    List<ShowEntity> listOfShows;

    List<TheatreSeatEntity> listOfTheatreSeats;
    //list of theatres

}
