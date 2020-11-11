import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private int claws;
    private int fangs;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.claws = 12;
        this.fangs = 64;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public int getFangs() {
        return fangs;
    }

    public void setFangs(int fangs) {
        this.fangs = fangs;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", claws=" + claws +
                ", fangs=" + fangs +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> monsters = new ArrayList<>();
        monsters.add(0, this.name);
        monsters.add(1, String.valueOf(this.hitPoints));
        monsters.add(2, String.valueOf(this.strength));
        monsters.add(3, "" + claws);
        monsters.add(4, "" + fangs);

        return monsters;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.hitPoints=Integer.parseInt(savedValues.get(2));
            this.hitPoints=Integer.parseInt(savedValues.get(3));
            this.hitPoints=Integer.parseInt(savedValues.get(4));
        }  else{
            System.out.println("No read from ..");
        }

    }
}
