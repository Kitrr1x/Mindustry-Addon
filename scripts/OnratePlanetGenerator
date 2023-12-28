import arc.graphics.Color;
import arc.math.Mathf;
import arc.util.noise.Simplex;
import mindustry.ctype.ContentList;
import mindustry.graphics.Pal;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.content.Blocks;
import mindustry.game.Sector;
import mindustry.type.Planet;
import mindustry.world.Block;
import mindustry.world.Pos;
import mindustry.world.Tiles;
import mindustry.world.blocks.environment.Floor;

public class OnratePlanetGenerator extends PlanetGenerator implements ContentList {

    Simplex sim;
    Block water = Blocks.water, stone = Blocks.stone, ice = Blocks.iceSnow;

    public OnratePlanetGenerator(){
        sim = new Simplex(Mathf.random(100000));
    }

    @override
    public void generate(TileGen tiles){
        int width = tiles.width;
        int height = tiles.height;
        
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                float noise = sim.octaveNoise2D(7,0.5, 1/60.0, x, y);
                float defaultThreshold = 0.5f;

                if(noise > defaultThreshold){
                    tiles.setFloor(stone);
                    if(noise > defaultThreshold + 0.1f){
                        tiles.setBlock(Blocks.air);
                    } else {
                        tiles.setBlock(ice);
                    }
                } else {
                    tiles.setFloor(water);
                    tiles.setBlock(Blocks.air);
                }
            }
        }
    }
    
    public static class OnratePlanet extends Planet {

        public OnratePlanet() {
            super("onrate", Planets.sun, 1, 1);
            generator = new OnratePlanetGenerator();
            meshLoader = () -> generatePlanetMesh();
            atmosphereColor = Color.valueOf("6a6a6a");
            startSector = 15;
            accessible = true;
            bloom = true;
            hasAtmosphere = true;
            atmosphereRadIn = 0.02f;
                        atmosphereRadOut = 0.3f;

            // Параметры орбиты и вращения
            orbitRadius = 10f;
            orbitTime = 1.5f;
            rotateTime = 30f;
        }
    }
    
    // Регистрация планеты в системе контента игры
    @override
    public void loadContent() {
        new OnratePlanet().load();
    }
}
