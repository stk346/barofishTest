//package com.barofish.backend.test;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Data
//@Table(name = "members")
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "user_name", columnDefinition = "varchar(20)")
//    private String userName;
//
//    // 다대일 단방향
//    /**
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "team_name")
//    private Team team;
//    */
//
//    // 다대일 양방향
//    /**
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "members")
//    private Team team;
//    */
//
//    // 일대다 단방향
//}
