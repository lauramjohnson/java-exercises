package org.launchcode.java.demos.java4python.studio.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by Laura on 3/13/2017.
 */
public class Menu {
    private LocalDateTime dateUpdated = LocalDateTime.now();
    private ArrayList<MenuItem> items = new ArrayList<>();

    public ArrayList<MenuItem> getItems() {
        return items;
    }


    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item){
        this.items.add(item);

    }

    public void removeItem(String name){
        MenuItem removeMe = null;
        for (MenuItem item: this.items){
            if (item.getName().equals(name)){
                removeMe = item;
            }
        }

        this.items.remove(removeMe);

    }
    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    private void setDateUpdated(){
        dateUpdated = LocalDateTime.now();
    }

}

