package com.gildedrose;

public class BackstagePassesUpdater implements Updater{

	public void update(Item item) {
		if(isAfterTheConcert(item)) {
			item.quality = 0;
		}
		else if(item.quality < 50) {
			Integer qualityIncrease = qualityIncreaseBy(item.sellIn);
			item.quality += qualityIncrease;
		}
		item.sellIn--;
	}

	private Integer qualityIncreaseBy(Integer remainingDaysBeforeConcert) {
		if(remainingDaysBeforeConcert <= 5) {
			return 3;
		}
		else if (remainingDaysBeforeConcert <= 10) {
			return 2;
		}
		else {
			return 1;
		}
	}

	private boolean isAfterTheConcert(Item item) {
		return item.sellIn <= 0;
	}

}
