package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="idseq")
//    @SequenceGenerator(name="idseq", sequenceName="seq_id", allocationSize= 1)
//    private Integer id;
//    private String firstName;
//    private String lastName;
    
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "username")
    private User user;
}
