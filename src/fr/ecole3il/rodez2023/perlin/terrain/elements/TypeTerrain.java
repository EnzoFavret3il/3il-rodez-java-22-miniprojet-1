package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;
/**@TypeTerrain Enum des biomes dispo avec leurs nom fichier png*/
public enum TypeTerrain {
	Coniferous_forest("coniferouse_forest.png"),
	Deciduous_forest("deciduous_forest.png"),
	Desert("desert.png"),
	Hills("hills.png"),
	Mountain("mountain.png"),
	Ocean("ocean.png"),
	Plain("plain.png"),
	Tundra("tundra.png");
	/**@nomfichier attribut pour le nom du fichier*/
	 private String nomfichier;
	 /**Constructeur de classe*/
	 private TypeTerrain(String nomfichier) {
		 this.nomfichier=nomfichier;
	 }
	public BufferedImage getImage() {
		return Utils.chargerTuile(nomfichier);
	}
	@Override
	/**{@return} valeur que le toString doit retourner
	 * @name() !C'est incroyable comme méthode*/
	public String toString() {
		return "You're in a "+name()+ "biome";
	}
	
}
