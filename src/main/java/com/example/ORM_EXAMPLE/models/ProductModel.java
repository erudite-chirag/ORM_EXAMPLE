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
@Table(name = "product")
public class ProductModel {
    @Id
    private String pId;
    @Column
    private String pName;

    @ManyToMany(mappedBy = "productList")
    private List<CategoryModel> categoryList=new ArrayList<>();

    public ProductModel(String pId, String pName, List<CategoryModel> categoryList) {
        this.pId = pId;
        this.pName = pName;
        this.categoryList = categoryList;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<CategoryModel> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryModel> categoryList) {
        this.categoryList = categoryList;
    }
}
