import mindustry.ctype.ContentList;
import mindustry.game.Planet;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.type.SectorPreset;
import mindustry.graphics.Pal;
import mindustry.content.Blocks;
import arc.graphics.Color;
import mindustry.Vars;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;

public class OnratePlanetGenerator extends PlanetGenerator implements ContentList {

    public static Planet onrate;

    @override
    public void load() {
        onrate = new Planet("onrate", Planets.sun, 1); // Onrate будет первой планетой вокруг солнца
        onrate.generator = this;
        onrate.startSector = 15;
        onrate.alwaysUnlocked = true;

        // Настройки внешнего вида планеты
        onrate.meshLoader = () -> new HexMesh(onrate, 6);
        onrate.atmosphereColor = Color.valueOf("6a7a89");
        onrate.atmosphereRadIn = 0.02f;
        onrate.atmosphereRadOut = 0.3f;
        onrate.hasAtmosphere = true;
        onrate.atmosphereColor = Pal.lancerLaser;

        // Добавляем планету в список игровых планет
        Planets.all.add(onrate);
    }

    // Генерация поверхности планеты
    @override
    public void generate(SectorPreset sector) {
        // Логика генерации местности и ресурсов твоей планеты здесь
    }

    // Дополнительные настройки для секторов после генерации
    @override
    public void postGenerate(SectorPreset sector) {
        sector.difficulty = 3;
        // Такие параметры, как уровень сложности
    }
}
