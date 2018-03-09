package space.aslan;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    private int exp = 0;
    private int tries = 0;
    static final int housekeepdifficulty = 20;

    public static void main(String[] args) {

        App app = new App();

        app.letsStart();

    }

    // trap tegen de kast, random 1 op 100
    public void letsStart() {


        while (true) {
            Material material = Material.getRandomMaterial();
            System.out.println(" Kicking the " + material + " closet");
            tries++;
            Closet closet = new Closet();

            if (!closet.kickTheCloset(exp)) {
                //exp++;
            }

            if (this.fightWitch()) {
                this.talkToAslan();
                break;

            } else {
                System.out.println(" You'll have to try again");
                exp++;
            }
        }
    }

    public boolean fightWitch() {

        Witch witch = new Witch();

        while (true) {
            System.out.println(" Attacking the witch");

            Random rand = new Random();
            // Going into the closet
            if (rand.nextInt(100 - exp) == 0) {
                witch.setDefeated(true);
                System.out.println(" You defeated the witch");
                return true;
            } else {
                return false;
            }
        }
    }

    private void talkToAslan() {
        Lion lion = new Lion();
        System.out.println("You have reached aslan!" + lion.toString());
        System.out.println("It took you " + tries + " tries");
    }
}







