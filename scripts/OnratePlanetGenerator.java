import mindustry.ctype.ContentList;
import mindustry.game.Planet;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.graphics.Pal;
import mindustry.type.Planet;
import arc.graphics.Color;
import mindustry.content.Blocks;
import mindustry.content.Planets;
import mindustry.graphics.g3d.PlanetMesh;
import mindustry.world.meta.BuildVisibility;

public class OnratePlanet implements ContentList {

    @override
    public void load(){
        Planets.onrate = new Planet("onrate", Planets.sun, 3, 1);
        Planets.onrate.meshLoader = () -> new PlanetMesh(Planets.onrate, 6, 5, (in, out) -> {
            // customize your noise function here for the landscape
        }, () -> new Color[]{Blocks.grass.mapColor, Blocks.sand.mapColor, Blocks.water.mapColor});
        Planets.onrate.generator = new PlanetGenerator() {
            // override methods to customize landscape and sector generation
            @override
            public void generateSector(Sector sec){
                // your sector generation code here
            }
        };
        Planets.onrate.orbitRadius = 10;
        Planets.onrate.orbitTime = 1.5f;
        Planets.onrate.rotateTime = 30;
        Planets.onrate.bloom = true;
        Planets.onrate.accessible = true;
        Planets.onrate.hasAtmosphere = true;
        Planets.onrate.atmosphereColor = Color.valueOf("6a6a6a");
        Planets.onrate.atmosphereRadIn = 0.02f;
        Planets.onrate.atmosphereRadOut = 0.3f;
        Planets.onrate.startSector = 15;
        Planets.onrate.alwaysUnlocked = true;
        Planets.onrate.buildVisibility = BuildVisibility.shown;

        Planets.all.add(Planets.onrate);
    }
}
