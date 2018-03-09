package space.aslan;

import java.util.Random;

public enum Material {
    WOOD, ALUMINIUM, STEEL;

    public static Material getRandomMaterial() {

        Random rand = new Random();

        //Material[] materials = { WOOD, ALUMINIUM, STEEL };
        Material[] materials = Material.values();
        int index = rand.nextInt(materials.length);

        return materials[index];
    }

}
