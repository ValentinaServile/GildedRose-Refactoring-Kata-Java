package com.gildedrose;

import com.google.common.collect.ImmutableMap;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Map;

public class UpdaterFactory {

	private static Map<String, List<String>> itemTypes = ImmutableMap.<String, List<String>>builder()
			.put("backstage-passes", asList("Backstage passes to a TAFKAL80ETC concert"))
			.put("legendary", asList("Sulfuras, Hand of Ragnaros"))
			.put("improves-with-age", asList("Aged Brie"))
			.put("conjured", asList("Conjured Mana Cake"))
			.build();

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
		return itemTypes.get("conjured").contains(item.name);
	}

	private static boolean isBackstagePass(Item item) {
		return itemTypes.get("backstage-passes").contains(item.name);
	}

	private static boolean isLegendary(Item item) {
		return itemTypes.get("legendary").contains(item.name);
	}

	private static boolean improvesWithAge(Item item) {
		return itemTypes.get("improves-with-age").contains(item.name);
	}

}
