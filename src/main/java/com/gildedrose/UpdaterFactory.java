package com.gildedrose;

public class UpdaterFactory {

	public static Updater updaterFor(Item currentItem) {
		if (improvesWithAge(currentItem)) {
			return new ImprovesWithAgeUpdater();
		}
		else if(isLegendary(currentItem)) {
			return new LegendaryUpdater();
		}
		else if(isBackstagePass(currentItem)) {
			return new BackstagePassesUpdater();
		}
		else {
			return new CommonUpdater();    			
		}
	}

	private static boolean isBackstagePass(Item item) {
		return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
	}

	private static boolean isLegendary(Item item) {
		return "Sulfuras, Hand of Ragnaros".equals(item.name);
	}

	private static boolean improvesWithAge(Item item) {
		return "Aged Brie".equals(item.name);
	}

}
