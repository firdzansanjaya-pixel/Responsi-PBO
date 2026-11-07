package Responsi;

public abstract class Tower {
    public static final int maxAmmo = 100;
    private final int id;
    private String nama;
    private int damage;
    private int ammo;

    public Tower(int id, String nama, int damage){
        this(id, nama, damage, 10);
    }

    public Tower(int id, String nama, int damage, int ammo) {
        this.id=id;
        this.nama=nama;
        this.damage=damage;
        this.ammo=ammo;
    }

    public abstract void serang(Enemy enemy);

    public void tampilkanInfo(){
        System.out.println("ID Tower: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Damage: " + damage);
        System.out.println("Ammo: " + ammo);
    }

    public int getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }
    public int getAmmo(){
        return ammo;
    }
    public void setAmmo(int ammo){
        if(ammo>=0 && ammo<=maxAmmo){
            this.ammo=ammo;
        }
    }
}
