package com.gildedrose;

import static java.util.Arrays.asList;

import java.util.List;

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
		else if(isConjured(currentItem)) {
			return new ConjuredItemUpdater();
		}
		else {
			return new CommonUpdater();    			
		}
	}

	private static boolean isConjured(Item item) {
		return conjuredItems().contains(item.name);
	}

	private static boolean isBackstagePass(Item item) {
		return backStagePasses().contains(item.name);
	}

	private static boolean isLegendary(Item item) {
		return legendaryItems().contains(item.name);
	}

	private static boolean improvesWithAge(Item item) {
		return itemsThatImproveWithAge().contains(item.name);
	}

	private static List<String> backStagePasses() {
		return asList(
				"Backstage passes to a TAFKAL80ETC concert"
				);
	}
	
	private static List<String> legendaryItems() {
		return asList(
				"Sulfuras, Hand of Ragnaros"
				);
	}
	
	private static List<String> itemsThatImproveWithAge() {
		return asList(
				"Aged Brie"
				);
	}
	
	private static List<String> conjuredItems() {
		return asList(
				"Soulstones"
				);
	}
}
