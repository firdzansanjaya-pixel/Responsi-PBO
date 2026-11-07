package Responsi;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args){
        System.out.println("======================");
        System.out.println("TEXT DEFENSE");
        System.out.println("RESPONSI!");
        System.out.println("======================");

        Enemy enemy=new Enemy("Goblin", 100);

        archerTower archer=new archerTower(1, "AT1", 20, 5);
        canonTower canon=new canonTower(2, "CT1", 40, 3);

        Tower[] towers={archer, canon};

        upgrade upgradeobj=archer;
        reload reloadobj =archer;

        upgradeobj.upgrade();
        reloadobj.reload();

        System.out.println("\nMusuh terlihat!");
        System.out.println("Nama Monster: " + enemy.getNama());
        System.out.println("HP Monster: " + enemy.getHealth());

        int ronde=1;

        while(enemy.getHealth()>0 && ronde<=5){
            System.out.println("\n===== RONDE " + ronde + " =====");

            for(Tower tower : towers){
                if(enemy.getHealth()>0){
                    tower.serang(enemy);
                }
            }
            ronde++;
        }
        System.out.println("======================");
        if(enemy.getHealth()<=0){
            System.out.println("MAJU MAJU MAJU!");
            System.out.println("KERJA BAGUS");
        }else{
            System.out.println("ITU DIKANANMU DIKANANMU!");
            System.out.println("MANA?MANA?!");
        }
        System.out.println("======================");

        for(Tower tower: towers){
            System.out.println("\nInformasi Tower");
            tower.tampilkanInfo();
        }
    }
}
