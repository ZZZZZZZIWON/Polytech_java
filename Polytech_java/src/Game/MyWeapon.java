package Game;

import java.util.Random;

public class MyWeapon implements weapon {
    // �냽�꽦 (�븘�뱶)
    private int curPower;

    @Override
    public void fire(int power) {
        this.curPower = curPower - power;
    }

    @Override
    public int getRestPower() {
        return this.curPower;
    }

    @Override
    public int charge(int power) {
        return this.curPower = curPower + power;
    }

    public boolean Success() {
        Random random = new Random();
        return random.nextBoolean();
    }
       }
