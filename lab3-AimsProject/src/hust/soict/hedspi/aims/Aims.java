package AimsProject.src.hust.soict.hedspi.aims;

import AimsProject.src.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.print("Total cost before: ");
		System.out.println(anOrder.Totalcost());
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.print("Total cost after: ");
		System.out.println(anOrder.Totalcost());
	}
}