package AimsProject.src.hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private String id;
	private static int nbDigitalVideoDiscs = 0;

	public String getCount() {
		nbDigitalVideoDiscs++;
		id = String.format("%d", nbDigitalVideoDiscs);
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public String getid() {
		return id;
	}

	public static int getnbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String category, String title, float cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = getCount();
	}

	public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = getCount();
	}

	public String toString() {
		return "Title: " + this.title + "\nCategory: " + this.category + "\nDirector: " + this.director + "\nLength: "
				+ this.length + "\nCost: " + this.cost;
	}

	public boolean Search(String string) {
		// Tach title cua DVD can tim thanh cac tu
		int count = 0;

		String sTitle[] = title.split(" ");
		String getTitle[] = string.split(" ");
		for (int i = 0; i < getTitle.length; i++) {
			for (int j = 0; j < sTitle.length; j++) {
				if (sTitle[j].equalsIgnoreCase(getTitle[i])) {
					count++;
				}
			}
		}

		if (count == sTitle.length)
			return true;
		return false;
	}
}
