package fr.ecole3il.rodez2023.perlin.terrain.elements;

public interface DetermineurTerrain {
	void visiterConiferousForest(TypeTerrain coniferousForest);
	void visiterDeciduousForest(TypeTerrain deciduousForest);
	void visiterDesert(TypeTerrain desert);
	void visiterHills(TypeTerrain hills);
	void visiterMountain(TypeTerrain mountain);
	void visiterOcean(TypeTerrain ocean);
	void visiterPlain(TypeTerrain plain);
	void visiterTundra(TypeTerrain tundra);
	void visiterMarsh(TypeTerrain marsh);
}
