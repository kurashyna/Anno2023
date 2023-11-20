package Game.Buildings;

import Game.Resource;

import java.util.HashMap;

public class WoodenCabin extends Building{

    private final String name = "Wooden Cabin";
    public WoodenCabin() {
        super("Wooden Cabin", 2, 2, 2, 1, 1);
        this.setResourcesConsumption(null); // TODO : Remplacer par des 0.
        this.setResourcesNeeded(new HashMap<>(){{
            put(Resource.WOOD, 1);
        }});

        this.setResourcesGenerating( new HashMap<>(){{
            put(Resource.FOOD, 2);
            put(Resource.WOOD, 2);
        }});
    }
}
