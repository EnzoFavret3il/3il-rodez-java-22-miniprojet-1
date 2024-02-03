package fr.ecole3il.rodez2023.perlin.terrain.elements;
/**@author EnzoFavret*/
public class Carte {
	/**@nom --> nom de la carte
	 * @largeur --> largeur carte
	 * @hauteur -->hauteur de la carte
	 * @tab --> tableau a deux dimensions, représentation x y de la carte aka bataille navale*/
	private String nom;
	private double largeur;
	private double hauteur;
	private Terrain[][] tab;
	
	/**@getNom,
	 * @getLargeur,
	 * @getHauteur,
	 * Méthodes permettant de récupérer les valeurs sur la carte ainsi que le nom de celle-ci
	 * */
	public String getNom() {
		return nom;
	}
	public double getLargeur() {
		return largeur;
	}
	public double getHauteur() {
		return hauteur;
	}
	
	public Terrain getTerrain(int x, int y) throws TerrainInexistant {
		if(x<0 || x>=tab.length || y<0 || y>=tab[0].length) {
			throw new TerrainInexistant("Hors des limites du tableau");
		}
		return tab[x][y];
	}
	
	
	
}
