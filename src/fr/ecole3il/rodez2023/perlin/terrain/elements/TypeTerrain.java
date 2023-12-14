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
	
	
	
	
	public TypeTerrain(double hydrometrie, double altitude, double temperature, Terrain type, BufferedImage image) {
		super();
		this.hydrometrie = hydrometrie;
		this.altitude = altitude;
		this.temperature = temperature;
		Type = type;
		this.image = image;
	}
	/**Getter pour les variables */
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
	
	

	
	
}
