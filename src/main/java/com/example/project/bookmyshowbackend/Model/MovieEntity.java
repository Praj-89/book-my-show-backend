package com.example.project.bookmyshowbackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "release_date",columnDefinition = "DATE",nullable = false)
    private LocalDate release_date;

    //Parent class of show Entity
    @OneToMany(mappedBy = "movie" ,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows;
}

