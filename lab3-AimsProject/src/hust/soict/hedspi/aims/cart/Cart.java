package AimsProject.src.hust.soict.hedspi.aims.cart;

import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
            System.out.println("Sorry, the list is full\n");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added Disk Sucessfully\n");
        }
    }

    public void printListOrder() {
        System.out.println("*****************Cart*****************");
        System.out.println("Title \t- Category \t- Director \t- Length: \t- Price");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].getTitle() + '\t'
                    + itemsOrdered[i].getCategory() + '\t'
                    + itemsOrdered[i].getDirector() + '\t'
                    + itemsOrdered[i].getLength() + " min: \t"
                    + itemsOrdered[i].getCost() + '$');
        }
        System.out.println("Total cost: " + this.Totalcost());
        System.out.println("***************************************");
    }

    // Tim kiem DVD bang Ten
    public void SearchDiscbyTitle(String searchTitle) {
        int count = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].Search(searchTitle)) {
                System.out.print(itemsOrdered[i]);
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("No disc found.");
        }
    }

    // Tìm kiếm theo Id
    public void SearchDiscbyID(String searchId) {
        int count = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getid().equals(searchId)) {
                System.out.print(itemsOrdered[i]);
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("No disc found.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] discList) {
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED || this.qtyOrdered + discList.length > MAX_NUMBERS_ORDERED) {
            System.out.print("The order is full.");
        } else {
            for (int i = 0; i < discList.length; i++)
                this.addDigitalVideoDisc(discList[i]);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
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

    public float Totalcost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;

    }
}
