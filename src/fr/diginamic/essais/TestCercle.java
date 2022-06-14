package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle c1 = new Cercle(5.8);
		Cercle c2 = CercleFactory.createCercle(1.5);

		System.out.println(c1);
		System.out.println(c2);
	}

}
