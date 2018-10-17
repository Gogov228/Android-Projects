package com.example.nickolay.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ModelItem {
    private String name;
    private int imgId;

    public ModelItem(String name, int imgId){
        this.name=name;
        this.imgId=imgId;
    }

    public String getName() {
        return name;
    }

    public int getImgId() {
        return imgId;
    }

    public static List<ModelItem> getFakeItem(){
        ArrayList<ModelItem> itemList=new ArrayList<>();
        itemList.add(new ModelItem("Со вкусом сгущёнки",R.drawable.a));
        itemList.add(new ModelItem("Достойная, трёхстойная",R.drawable.b));
        itemList.add(new ModelItem("Ммммммм, ультра",R.drawable.c));
        itemList.add(new ModelItem("Ощущения богатства",R.drawable.d));
        itemList.add(new ModelItem("Like a panda",R.drawable.q));
        itemList.add(new ModelItem("Свежесть ромашки",R.drawable.w));
        itemList.add(new ModelItem("Словно пёрышко",R.drawable.r));
        itemList.add(new ModelItem("Мягкая как панда",R.drawable.t));
        itemList.add(new ModelItem("Её много))",R.drawable.y));
        itemList.add(new ModelItem("Классика мягкости",R.drawable.e));

        return itemList;
    }
}
