package com.barofish.backend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "goods_discounts")
public class GoodsDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_discount_code")
    private Long goodsDiscountCode;
}
