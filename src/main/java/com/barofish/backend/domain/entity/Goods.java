package com.barofish.backend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_code")
    private Long goodsCode;
}
