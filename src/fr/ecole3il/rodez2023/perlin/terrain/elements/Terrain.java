package fr.ecole3il.rodez2023.perlin.terrain.elements;
import java.awt.image.BufferedImage;
public class Terrain {
	/**@param hydrometrie Hydrometrie du terrain
	 * @param altitude altitude du terrain
	 * @param température du terrain (du biome)
	 * */
	private double hydrometrie;
	private double altitude;
	private double temperature;
	
	
	
	
	/**Constructeur pour l'objet Terrain
	 * @throws Exception */
	public Terrain(double hydrometrie, double altitude, double temperature) throws Exception {
		super();
		/**Check si les valeurs sont correctes
		 * @MauvaiseValeurException --> exception de la classe MauvaiseValeurException*/
		if(!badvalues(hydrometrie,0,1)||!badvalues(altitude,-1,1)||!badvalues(temperature,0,1)) {
			throw new MauvaiseValeurException("Une ou plusieurs valeurs sont incorrectes, veuillez vérifier vos données");
		}
		else {
			this.hydrometrie = hydrometrie;
			this.altitude = altitude;
			this.temperature = temperature;
		}
		
	}
	/**Getters pour les variables */
	public double getHydrometrie() {
		return hydrometrie;
	}
	public double getAltitude() {
		return altitude;
	}
	public double getTemperature() {
		return temperature;
	}

	/**Petite fonction pour vérifier les valeurs hydro, temp et alititude
	 * Merci StackOverflow
	 * @param attribut => hydrometrie, temperature ou altitude
	 * @param min => valeur minimum
	 * @param max=> valeur max
	 * @return boolean yes/no après vérification des infos
	 * */
	private boolean badvalues(double attribut, double min, double max) {
		return attribut>= min && attribut <=max;
	}

	
	
}
