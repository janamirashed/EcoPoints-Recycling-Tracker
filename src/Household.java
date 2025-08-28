import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Household implements Serializable {
    private String id;
    private String name;
    private String address;
    private LocalDate joinDate;
    private List<RecyclingEvent> events;
    private double totalPoints;

    public Household(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.joinDate = LocalDate.now();
        this.events = new ArrayList<>();
        this.totalPoints = 0.0;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public LocalDate getJoinDate() {
        return joinDate;
    }
    public List<RecyclingEvent> getEvents() {
        return events;
    }
    public double getTotalPoints() {
        return totalPoints;
    }

    public void addEvent(RecyclingEvent event) {
        events.add(event);
        totalPoints += event.getEcoPoints();
    }

    public double getTotalWeight() {
        double total = 0.0;
        for (RecyclingEvent event : events) {
            total += event.getWeight();
        }
        return total;
    }
}