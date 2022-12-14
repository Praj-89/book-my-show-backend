package com.example.project.bookmyshowbackend.Model;

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
@Table(name = "users")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String mobileNo;


    //Parent Class
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TicketEntity> ticketEntities;
}
