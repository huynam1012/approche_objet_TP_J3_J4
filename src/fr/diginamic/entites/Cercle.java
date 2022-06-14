package fr.diginamic.entites;

public class Cercle {

	double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double perimetre() {
		return Math.PI * rayon * 2;
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

	@Override
	public String toString() {
		return "rayon=" + rayon + ", perimetre =" + perimetre() + ", surface =" + surface();
	}
	
	
}
