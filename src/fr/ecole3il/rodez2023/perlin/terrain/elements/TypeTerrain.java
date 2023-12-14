package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

public enum TypeTerrain {

	private String nomfichier;
	public BufferedImage getImage() {
		return Utils.chargerTuile(nomfichier);
	}
}
