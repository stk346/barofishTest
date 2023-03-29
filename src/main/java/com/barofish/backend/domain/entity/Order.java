package com.barofish.backend.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NotNull
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_code")
    private Long orderCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;

    @OneToOne
    @JoinColumn(name = "payment_info_code")
    private PaymentInfo paymentInfo;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime orderDate;

    @Column(columnDefinition = "varchar(20)")
    private String orderStatus;

    @Column(name = "cs_status", columnDefinition = "varchar(20)")
    private String CSStatus;

    @Column(columnDefinition = "varchar(20)")
    private String paymentStatus;

    @Column(columnDefinition = "INTEGER")
    private int totalDeliveryFee;

    @Column(columnDefinition = "INTEGER")
    private int totalGoodsAmount;

    private Timestamp createCurrentDate() {
        return Timestamp.valueOf(LocalDateTime.now());
    }
}
