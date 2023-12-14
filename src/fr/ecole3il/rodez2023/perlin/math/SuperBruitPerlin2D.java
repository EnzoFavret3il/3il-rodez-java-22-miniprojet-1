
package fr.ecole3il.rodez2023.perlin.math;

//Les classes sont crées et belles mais pas fonctionnelles
//J'ai aqua poney du coup...

public class SuperBruitPerlin2D extends BruitPerlin2D {

	public SuperBruitPerlin2D(long graine, double resolution) {
		super(graine, resolution);
		// TODO Auto-generated constructor stub
	}
	public double produitScalaire(double[] vecteur, double x, double y) {
		
		return 1;
	}
	public double lissage(double t) {
		
		return 2;
	}
	public double interpolation(double t, double a, double b) {
		
		return 3;
	}

}
