package AimsProject.src.hust.soict.hedspi.aims.store;

import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
            System.out.println("Sorry, the list is full\n");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added Disk Sucessfully\n");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean check = false;
        if (qtyOrdered > 0) {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                    for (int j = i; j < qtyOrdered; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    check = true;
                    qtyOrdered--;
                    break;
                }
            }
        } else {
            System.out.println("Sorry, no Disk left\n");
        }
        if (check == true) {
            System.out.println("Removed Disk Sucessfully!");
        } else {
            System.out.println("Disk not found");
        }
    }

    public void printTest() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.print(itemsOrdered[i] + "\n");
        }
    }

}
