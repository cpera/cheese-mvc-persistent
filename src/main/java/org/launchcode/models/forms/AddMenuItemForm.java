package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

/**
 * Created by CPERA on 6/25/2017.
 */
public class AddMenuItemForm {

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    private Menu menu;
    private Iterable<Cheese> cheeses;

    public AddMenuItemForm(){
        }
    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses){
        this.cheeses = cheeses;
        this.menu = menu;
    }

    public int getMenuId(){
        return menuId;
    }
    public void setMenuId(int menuId){
        this.menuId = menuId;
    }

    public int getCheeseId(){
        return cheeseId;
    }
    public void setCheeseId(int cheeseId){
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses(){
        return cheeses;
    }

    public Menu getMenu(){
        return menu;
    }


}
