package Cp2406A1.java;

/**
 * Created by jc321013 on 3/10/16.
 */
public class PlayCard extends STCard{
    private String title;
    private String chemicalFormula;
    private String classification;
    private String crystalSystem;
    private String[] occurrence = new String[]{};
    private float hardness;
    private float specificGravity;
    private String cleavage;
    private String crustalAbundance;
    private String economicValue;

    public PlayCard(int id, String title, String[] categories, String chemicalFormula, String classification, String crystalSystem, String[] occurrence, String hardness, String specificGravity, String cleavage, String crustalAbundance, String economicValue) {
        super(id);
        this.title = title;
        this.chemicalFormula = chemicalFormula;
        this.classification = classification;
        this.crystalSystem = crystalSystem;
        this.occurrence = occurrence;
        this.hardness = Float.parseFloat(hardness);
        this.specificGravity = Float.parseFloat(specificGravity);
        this.cleavage = cleavage;
        this.crustalAbundance = crustalAbundance;
        this.economicValue = economicValue;
    }
}
