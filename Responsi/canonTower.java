package Responsi;

public class canonTower extends Tower{

    public canonTower(int id, String nama, int damage, int ammo){
        super(id, "Canon Tower", damage, ammo);
    }

    @Override
    public void serang(Enemy enemy){
        if(enemy != null && enemy.getHealth()>0 && getAmmo()>0){
            System.out.println("Canon tower menembak!");
            enemy.terimaDamage(getDamage());
            setAmmo(getAmmo()-1);
        }else if(getAmmo()<=0){
            System.out.print("Canon tower kehabisan amunisi!");
        }else{
            System.out.println("Monster mati!");
        }
    }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Serangan: Meriam");
    }
}
