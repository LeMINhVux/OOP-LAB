package AimsProject.src.hust.soict.hedspi.test.cart;

import java.util.Scanner;

import AimsProject.src.hust.soict.hedspi.aims.cart.Cart;
import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        // create a new dvd object and set the fields
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // add the dvd to the order
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        // anOrder.printListOrder();
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your title: ");
        System.out.print("Enter your ID: ");
        String searchId = sc.nextLine();
        sc.close();
        anOrder.SearchDiscbyID(searchId);
        // anOrder.SearchDiscbyTitle(searchTitle);

    }
}
