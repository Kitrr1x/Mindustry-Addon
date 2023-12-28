import mindustry.ctype.ContentList;
import mindustry.game.Planet;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.graphics.Pal;
import mindustry.type.Planet;
import arc.graphics.Color;
import mindustry.content.Blocks;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;

public class OnratePlanet implements ContentList {
    private static final float orbitTime = 1.5f;
    private static final float rotateTime = 30f;
    private static final float orbitRadius = 10f;

    @override
    public void load(){
        Planet onrate = new Planet("onrate", Planets.sun, 3);
        onrate.generator = new PlanetGenerator() {
            @override
            public void generate(Planet planet, Sector sector){
                // Пользовательские функции генерации для планеты
            }
        };

        onrate.orbitRadius = orbitRadius;
        onrate.orbitTime = orbitTime;
        onrate.rotateTime = rotateTime;
        onrate.bloom = true;
        onrate.accessible = true;
        onrate.hasAtmosphere = true;
        onrate.atmosphereColor = new Color(0x6a6a6aff);
        onrate.atmosphereRadIn = 0.02f;
        onrate.atmosphereRadOut = 0.3f;
        onrate.localizedName = "Onrate";
        onrate.startSector = 15;
        onrate.alwaysUnlocked = true;

        onrate.meshLoader = () -> new HexMesh(onrate, 6);

        Planets.all.add(onrate);
    }
}
