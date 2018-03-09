package space.aslan;

import java.util.Random;

import static space.aslan.App.housekeepdifficulty;

public class Closet {

    private boolean isBroken;
    private Material material;

    public boolean kickTheCloset(int exp) {
        Random rand = new Random();
        if (rand.nextInt(100 - exp) == 0) {
            this.setBroken(true);
            return false;
        }

        Random rand2 = new Random(); // of je gepakt wordt
        if (rand2.nextInt(housekeepdifficulty) == 0)

        {
            System.out.println("You got caught by the housekeeper");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("You broke the closet");
            return false;
        }
        return true;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        this.isBroken = broken;
    }
}
