package com.ecommerce.wanted_cqrs.entity;

import com.ecommerce.wanted_cqrs.entity.type.ProductStatusType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private String name;
    private String slug;
    private String shortDescription;
    private String fullDescription;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ProductStatusType productStatusType;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
