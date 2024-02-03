package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.util.Scanner;

import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

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
	private GenerateurCarte generateurCarte;
	
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
	/**@getTerrain */
	public Terrain getTerrain(int x, int y) throws TerrainInexistant {
		if(x<0 || x>=tab.length || y<0 || y>=tab[0].length) {
			throw new TerrainInexistant("Hors des limites du tableau");
		}
		return tab[x][y];
	}
	/** Constructeur de carte
	 * @nom nom de la carte
	 * @largeur de la carte
	 * @hauteur de la carte
	 * @generateurCarte ???*/
	public Carte(String nom, double largeur, double hauteur, GenerateurCarte generateurCarte) {
		super();
		this.nom = nom;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.generateurCarte=generateurCarte;
	}
	
	public Carte(String donnesCarte) {
		Scanner scanner = new Scanner(donnesCarte);
		this.nom = scanner.nextLine();
		this.largeur = scanner.nextDouble();
		this.hauteur= scanner.nextDouble();
		
		while(scanner.hasNext()) {
			double altitude = scanner.nextDouble();
			double hydrometrie = scanner.nextDouble();
			double temperature=scanner.nextDouble();
			
		}
	}
	
	
}
