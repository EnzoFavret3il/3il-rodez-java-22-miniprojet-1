package fr.ecole3il.rodez2023.perlin.terrain.generation;
import java.util.Random;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoire extends GenerateurCarte {
	private Random ran;
	public GenerateurAleatoire(long graine) {
		super(graine);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		double altitude = ran.nextDouble();
		double hydrometrie= ran.nextDouble();
		double temperature= ran.nextDouble();
	}*/

	

}
