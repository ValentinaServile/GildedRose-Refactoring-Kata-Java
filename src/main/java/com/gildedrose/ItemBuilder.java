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
	
	public ItemBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public ItemBuilder withQuality(int quality) {
		this.quality = quality;
		return this;
	}
	
	public ItemBuilder withSellIn(int sellIn) {
		this.sellIn = sellIn;
		return this;
	}
	
	public Item build() {
		return new Item(name, sellIn, quality);
	}
}
