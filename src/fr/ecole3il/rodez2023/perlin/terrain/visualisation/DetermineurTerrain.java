package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public interface DetermineurTerrain {

	public Terrain determinerTerrain(double altitude, double hydrometrie, double temperature);


}
