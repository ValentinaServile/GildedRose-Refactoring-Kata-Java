package com.gildedrose;

public class UpdaterFactory {

	public static Updater updaterFor(Item currentItem) {
		if ("Aged Brie".equals(currentItem.name)) {
			return new AgedBrieUpdater();
		}
		else if("Sulfuras, Hand of Ragnaros".equals(currentItem.name)) {
			return new SulfurasUpdater();
		}
		else if("Backstage passes to a TAFKAL80ETC concert".equals(currentItem.name)) {
			return new BackstagePassesUpdater();
		}
		else {
			return new CommonItemUpdater();    			
		}
	}

}
