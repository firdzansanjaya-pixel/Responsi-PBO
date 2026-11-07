package Responsi;

public class archerTower extends Tower implements upgrade, reload{

    public archerTower(int id, String nama, int damage, int ammo){
        super(id, "Archer Tower", damage, ammo);
    }

    @Override
    public void serang(Enemy enemy){
        if(enemy != null && enemy.getHealth()>0 && getAmmo()>0){
            System.out.println("Archer tower menembakkan panah!");
            enemy.terimaDamage(getDamage());
            setAmmo(getAmmo()-1);
        }else if (getAmmo()<=0){
            System.out.println("Archer tower kehabisan amunisi!");
        }else{
            System.out.println("Monster mati!");
        }
    }

    @Override
    public void upgrade(){
        setDamage(getDamage()+5);
        System.out.println("Archer tower berhasil diupgrade!");
    }

    @Override
    public void reload(){
        setAmmo(getAmmo()+5);
        System.out.println("Amunisi Archer tower berhasil ditambah!");
        }
}
