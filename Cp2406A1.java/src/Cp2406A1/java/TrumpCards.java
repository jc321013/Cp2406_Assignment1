package Cp2406A1.java;

/**
 * Created by jc321013 on 3/10/16.
 */
public class TrumpCards extends STCard {
    private String description;

    public TrumpCards (int id, String title, String[] categories, String description) {
        super(id);
        this.description = description;
    }

}
