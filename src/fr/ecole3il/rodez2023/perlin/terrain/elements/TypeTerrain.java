package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

public enum TypeTerrain {
	Coniferous_forest("coniferouse_forest.png"),
	Deciduous_forest("deciduous_forest.png"),
	Desert("desert.png"),
	Hills("hills.png"),
	Mountain("mountain.png"),
	Ocean("ocean.png"),
	Plain("plain.png"),
	Tundra("tundra.png");
	
	 private final String nomfichier;

	 private TypeTerrain(String nomfichier) {
		 this.nomfichier=nomfichier;
	 }
	public BufferedImage getImage() {
		return Utils.chargerTuile(nomfichier);
	}
}
