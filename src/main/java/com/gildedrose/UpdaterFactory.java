package com.gildedrose;

public class UpdaterFactory {

	public static Updater updaterFor(Item currentItem) {
		if (currentItem.name.equals("Aged Brie")) {
			return new AgedBrieUpdater();
		}
		else if(currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new SulfurasUpdater();
		}
		else if(currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new BackstagePassesUpdater();
		}
		else {
			return new CommonItemUpdater();    			
		}
	}

}
