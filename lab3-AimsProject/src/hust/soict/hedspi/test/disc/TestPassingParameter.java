package AimsProject.src.hust.soict.hedspi.test.disc;

import AimsProject.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderalla");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("cinderella DVD title: " + cinderellaDVD.getTitle());
        swapfix(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd Title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    public static void swapfix(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        String temp1 = o1.getTitle();
        String temp2 = o2.getTitle();
        o1.setTitle(temp2);
        o2.setTitle(temp1);

    }
}
