public class Dragon {
    private int hitPoints;
    private int damage;
    private int critChance;
    private int healCount;

    public int getHealCount() {
        return healCount;
    }

    public void setHealCount(int healCount) {
        this.healCount = healCount;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public Dragon() {
        hitPoints  = 50;
        damage     = 5;
        critChance = 2;
    }

    public Dragon(int hitPoints, int damage, int critChance) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.critChance = critChance;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}