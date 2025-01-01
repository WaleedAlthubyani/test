package com.example.project.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Deal {//Waleed

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "int not null")
    private Integer currentParticipants;

    @Column(columnDefinition = "int not null")
    private Integer participantsLimit;

    @Column(columnDefinition = "varchar(9) not null")
    private String status;

    @Column(columnDefinition = "int not null")
    private Integer quantity;

    @Column(columnDefinition = "double not null")
    private Double originalPrice;

    @Column(columnDefinition = "double not null")
    private Double discountedPrice;

    @Column(columnDefinition = "timestamp not null")
    private LocalDateTime startedAt;

    @Column(columnDefinition = "timestamp not null")
    private LocalDateTime endsAt;

}
