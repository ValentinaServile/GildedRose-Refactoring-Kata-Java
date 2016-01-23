package com.gildedrose;

public class AgedBrieUpdater {

	public void update(Item item) {
		if(item.quality < 50) {
			item.quality++;
		}
		item.sellIn--;
	}

}
