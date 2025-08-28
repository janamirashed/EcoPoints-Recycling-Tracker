import java.io.Serializable;
import java.time.LocalDate;

public class RecyclingEvent implements Serializable {
    private String materialType;
    private double weight;
    private LocalDate date;
    private double ecoPoints;

    public RecyclingEvent(String materialType, double weight) {
        this.materialType = materialType;
        this.weight = weight;
        this.date = LocalDate.now();
        this.ecoPoints = weight * 10;
    }

    public String getMaterialType() {
        return materialType;
    }
    public double getWeight() {
        return weight;
    }
    public LocalDate getDate() {
        return date;
    }
    public double getEcoPoints() {
        return ecoPoints;
    }
    public String toString() {
        return "Date: " + this.date +
                "\nMaterial Type: " + this.materialType +
                "\nWeight: " + this.weight +
                "\nEcopoints: " + this.ecoPoints;
    }
}