package com.java.javanotes.concepts;

public class Laptop implements Comparable<Laptop> {
	private int price;
	private int ram;
	private String brand;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + ", brand=" + brand + "]";
	}

	public Laptop(int price, int ram, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}

	@Override
	public int compareTo(Laptop lp) {
		// this > lp = +
		// this <lp = -
		// this = 0

		if (this.getRam() > lp.getRam()) {
			return 1;
		} else if (this.getRam() < lp.getRam()) {
			return -1;
		} else {
			return 0;
		}
	}

}
