package com.gildedrose;

public class ItemBuilder {

	private int quality;
	private int sellIn;
	private String name;

	public ItemBuilder() {
		this.name = "";
		this.quality = 0;
		this.sellIn = 0;
	}
	
	public ItemBuilder called(String name) {
		this.name = name;
		return this;
	}
	
	public ItemBuilder ofQuality(int quality) {
		this.quality = quality;
		return this;
	}
	
	public ItemBuilder toBeSoldIn(int sellIn) {
		this.sellIn = sellIn;
		return this;
	}

	public ItemBuilder pastExpirationDate() {
		this.sellIn = 0;
		return this;
	}
	
	public Item build() {
		return new Item(name, sellIn, quality);
	}
}
