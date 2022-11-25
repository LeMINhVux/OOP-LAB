package AimsProject.src.hust.soict.hedspi.test.store;

import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store anOrder = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        anOrder.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);
        anOrder.addDVD(dvd3);
        // Print List of Disk for test
        System.out.println("List before delete:\n");
        anOrder.printTest();
        anOrder.removeDVD(dvd3);
        System.out.println("List after delete:\n");
        anOrder.printTest();

    }
}
