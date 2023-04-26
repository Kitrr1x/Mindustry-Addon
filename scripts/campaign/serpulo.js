//serpulo presets
const IronMountains = new SectorPreset("IronMountains", Planets.serpulo, 172);
IronMountains.captureWave = 30;
IronMountains.difficulty = 4;

const CobaltMines = new SectorPreset("CobaltMines", Planets.serpulo, 205);
CobaltMines.difficulty = 7;

const abandonedDesert = new SectorPreset("abandonedDesert", Planets.serpulo, 157);
abandonedDesert.captureWave = 30;
abandonedDesert.difficulty = 8;

const reignLair = new SectorPreset("eradLair", Planets.serpulo, 122);
reignLair.captureWave = 30;
reignLair.difficulty = 10;

module.exports = {
  IronMountains: IronMountains,
  CobaltMines: CobaltMines,
  abandonedDesert: abandonedDesert,
  reignLair: reignLair
};