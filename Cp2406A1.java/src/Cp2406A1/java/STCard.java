package Cp2406A1.java;

/**
 * Created by jc321013 on 15/09/16.
 */
public class STCard {
    private int id;
//    private String title;
//    private String[] categories;

    public STCard(int id) {
        this.id = id;
//        this.title = title;
//        this.categories = categories;
    }

    public String toString(){
        return "ID= " + id;
    }
}
