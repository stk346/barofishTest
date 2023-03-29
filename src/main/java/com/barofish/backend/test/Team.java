//package com.barofish.backend.test;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Data
//@Table(name = "teams")
//public class Team {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "team_name", columnDefinition = "varchar(20)")
//    private String teamName;
//
//    // 다대일 단방향
//    /**
//     */
//
//    // 다대일 양방향
//    /**
//    @OneToMany(mappedBy = "team")
//    private List<Member> members;
//    */
//
//    // 일대다 단방향
//    @OneToMany
//    @JoinColumn(name = "id")
//    private List<Member> members;
//}
