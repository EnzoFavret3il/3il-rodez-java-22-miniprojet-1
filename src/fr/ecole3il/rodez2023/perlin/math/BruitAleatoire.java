package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe BruitAleatoire étend la classe Bruit2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {

	/**Constructeur du BruitAleatoire*/
    public BruitAleatoire(long graine, double resolution) {
    	super(graine,resolution);
    	
    }

	@Override
	/**@return renvoie d'une valeur aléatoire
	 * @Override réecriture de la fonction de la classe Bruit2D
	 * therandom => Valeur aleatoire pour le bruit
	 * */
	public double bruit2D(double x, double y) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		double therandom= rand.nextDouble();
		return therandom;
	}
    
}
