const planet = new Planet("Onrate", Planets.sun, 3);

planet.generator = new PlanetGenerator({
    // Определи в этом объекте, как генерируется твоя планета
});

planet.startSector = 15;
planet.alwaysUnlocked = true;

planet.orbitRadius = 10;
planet.orbitTime = 1.5;
planet.rotateTime = 30;
planet.bloom = true;
planet.accessible = true;
planet.hasAtmosphere = true;
planet.atmosphereColor = Color.valueOf("6a6a6a");
planet.atmosphereRadIn = 0.02;
planet.atmosphereRadOut = 0.3;
planet.localizedName = "Onrate";

// Добавление планеты в списки для отображения в игре
Planets.all.add(planet);
