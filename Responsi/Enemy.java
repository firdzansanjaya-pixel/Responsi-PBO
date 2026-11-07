package Responsi;

public class Enemy {
    private String nama;
    private int health;

    public Enemy (String nama, int health){
        this.nama=nama;
        this.health=health;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=Math.max(0, health);
    }

    public void terimaDamage(int damage){
        setHealth(health-damage);
        System.out.println(nama + " menerima " + damage + " damage!");
        System.out.println("Sisa HP: " + health);
    }
}
