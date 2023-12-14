package fr.ecole3il.rodez2023.perlin.terrain.elements;
import java.awt.image.BufferedImage;
enum Terrain{
	Collines, 
	Desert,
	Foret_de_Coniferes,
	Foret_de_Feuillus,
	Marais,
	Montagne,
	Ocean,
	Plaine,
	Toundra}
public class TypeTerrain {
	/**@param hydrometrie Hydrometrie du terrain
	 * @param altitude altitude du terrain
	 * @param température du terrain (du biome)
	 * */
	private double hydrometrie;
	private double altitude;
	private double temperature;
	private Terrain Type;
	private BufferedImage image= new BufferedImage( 2,3,5);
	
	
	
	/**Constructeur pour l'objet TypeTerrain
	 * @throws Exception */
	public TypeTerrain(double hydrometrie, double altitude, double temperature, Terrain type, BufferedImage image) throws Exception {
		super();
		if(!badvalues(hydrometrie,0,1)||!badvalues(altitude,-1,1)||!badvalues(temperature,0,1)) {
			throw new Exception("Les valeurs ne sont pas correctes");
		}
		else {
			this.hydrometrie = hydrometrie;
			this.altitude = altitude;
			this.temperature = temperature;
			Type = type;
			this.image = image;
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
	public Terrain getType() {
		return Type;
	}
	public BufferedImage getImage() {
		return image;
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
