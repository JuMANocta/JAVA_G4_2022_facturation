package com.facturation;

import lombok.Data;

@Data //@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor, @AllArgsConstructor
public class Produit {
    private int id;
    private String name;
    private String detail;
    private String company;
    private int stock;
    private double price;
}
