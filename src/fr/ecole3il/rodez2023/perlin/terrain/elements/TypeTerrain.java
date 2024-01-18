package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;
/**@TypeTerrain Enum des biomes dispo avec leurs nom fichier png*/
public enum TypeTerrain {
	Coniferous_forest("data/coniferouse_forest.png"),
	Deciduous_forest("data/deciduous_forest.png"),
	Desert("data/desert.png"),
	Hills("data/hills.png"),
	Mountain("data/mountain.png"),
	Marsh("data/marsh.png"),
	Ocean("data/ocean.png"),
	Plain("data/plain.png"),
	Tundra("data/tundra.png");
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
