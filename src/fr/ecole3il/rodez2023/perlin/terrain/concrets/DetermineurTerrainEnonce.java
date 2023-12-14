package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class DetermineurTerrainEnonce implements DetermineurTerrain {

	@Override
	public Terrain determinerTerrain(double altitude, double hydrometrie, double temperature) {
		if (altitude < 0) {
			return Terrain.OCEAN;
		} else if (hydrometrie <= 0.25) {
			if (altitude <= 0.7) {
				if (temperature <= 0.25) {
					return Terrain.PLAINE;
				} else if (temperature <= 0.7) {
					return Terrain.FORET_FEUILLUS;
				} else {
					return Terrain.TOUNDRA;
				}
			} else {
				if (temperature <= 0.25) {
					return Terrain.PLAINE;
				} else if (temperature <= 0.7) {
					return Terrain.FORET_CONIFÈRES;
				} else {
					return Terrain.MONTAGNE;
				}
			}
		} else {
			if (altitude <= 0.7) {
				if (temperature <= 0.25) {
					return Terrain.DESERT;
				} else if (temperature <= 0.7) {
					return Terrain.COLLINES;
				} else {
					return Terrain.MONTAGNE;
				}
			} else {
				if (temperature <= 0.25) {
					return Terrain.MARAIS;
				} else if (temperature <= 0.7) {
					return Terrain.FORET_CONIFÈRES;
				} else {
					return Terrain.MONTAGNE;
				}
			}
		}
	}

}
