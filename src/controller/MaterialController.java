package controller;

import models.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialController {
    List<Material> materialList = new ArrayList<>();

    public MaterialController(List<Material> materialList) {
        this.materialList = materialList;
    }

    public MaterialController() {
    }
    public void addNewMaterial(Material material){
        materialList.add(material);
    }
    public void deleteMaterial(int index){
        materialList.remove(index);
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
}
