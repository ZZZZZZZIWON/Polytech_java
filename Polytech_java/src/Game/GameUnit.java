package Game;

public class GameUnit extends MyWeapon {
    static int bossPower = 10000;
    private int unitPower = 5000;
    private MyWeapon weapon;
    private String name;

    public GameUnit(String name) {
        this.name = name;
        weapon = new MyWeapon();
        weapon.charge(unitPower);
    }


    public void attack(int power){

        if(this.unitPower < 0) {

            if (weapon.Success()) {
                System.out.println(this.name + "�쓽 怨듦꺽 �꽦怨�");
                GameUnit.bossPower = bossPower - power;
                this.weapon.fire(500);
                System.out.println("�쁽�옱 " + name + "�쓽 Unit Power = " + this.unitPower);
                this.weapon.charge(500);
                System.out.println("�쁽�옱 Boss�쓽 Power = " + GameUnit.bossPower);
                System.out.println("�쁽�옱 " + name + "�쓽 Unit Power = " + this.unitPower);
                System.out.println();
            } else {
                System.out.println(this.name + "�쓽 怨듦꺽 �떎�뙣");
                this.unitPower -= power;
                System.out.println("�쁽�옱 Boss�쓽 Power = " + GameUnit.bossPower);
                System.out.println("�쁽�옱 " + name + "�쓽 Unit Power = " + this.unitPower);
                System.out.println();
            }
        }
    };

    public int charge(int power) {
        this.weapon.charge(power);
        return power;
    }

    public static void main(String[] args) {
        GameUnit unit1 = new GameUnit("unit1");
        GameUnit unit2 = new GameUnit("unit2");
        while(true) {
            unit1.attack(500);
            unit2.attack(500);
            if(GameUnit.bossPower < 0) {
                System.out.println("WIN");
                break;
            }

        }
    }
}
