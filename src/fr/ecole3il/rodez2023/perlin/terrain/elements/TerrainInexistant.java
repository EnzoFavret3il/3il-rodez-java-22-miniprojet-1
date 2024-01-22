package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class TerrainInexistant extends RuntimeException{
	public TerrainInexistant(String info) {
		super(info);
	}
}
