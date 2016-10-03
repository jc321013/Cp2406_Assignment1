package Cp2406A1.java;

/**
 * Created by jc321013 on 3/10/16.
 */
public class TrumpCards extends STCard {
    private String description;

    public TrumpCards (int id, String title, String[] categories, String description) {
        super(id, "Quartz", new String[]{""}, "SiO_2", "tectosilicate", "hexagonal", new String[]{"igneous", "metamorphic", "sedimentary"}, "7.0", "2.65", "poor/none", "high", "moderate");
        this.description = description;
    }

}
