package com.example.ORM_EXAMPLE.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="category")
public class CategoryModel {

    @Id
    private String cId;
    @Column
    private String cName;

    @ManyToMany( cascade = CascadeType.ALL)
    private List<ProductModel> productList = new ArrayList<>();
    public CategoryModel(String cId, String cName, List<ProductModel> productList) {
        this.cId = cId;
        this.cName = cName;
        this.productList = productList;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<ProductModel> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductModel> productList) {
        this.productList = productList;
    }
}