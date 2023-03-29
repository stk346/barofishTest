package com.barofish.backend.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "paymentInfos")
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long paymentInfoCode;

    @NotNull
    @OneToOne(mappedBy = "paymentInfo")
    private Order order;

    @NotNull
    @Column(columnDefinition = "varchar(20)")
    private String paymentMethod;

    @NotNull
    @Column(columnDefinition = "TIMESTAMP")
    private Timestamp paymentDate;

    @NotNull
    @Column(columnDefinition = "INTEGER")
    private int totalPaymentAmount;

    @NotNull
    @Column(columnDefinition = "INTEGER")
    private int depositAmount;

    @Column(columnDefinition = "varchar(20)")
    private String depositor;

    @Column(columnDefinition = "varchar(20)")
    private String depositBank;
}
