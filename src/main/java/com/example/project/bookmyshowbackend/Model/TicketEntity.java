package com.example.project.bookmyshowbackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String alloted_seats;

    private int amount;

    @CreationTimestamp
    Date createdOn;

    //Child's class
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    UserEntity user; //Foreign Key To connect user table

    //showEntity
    //listOfShowEntity

}
