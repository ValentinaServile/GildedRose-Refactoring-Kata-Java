package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	for (Item currentItem : items) {
    		Updater updater = null;
    		if (currentItem.name.equals("Aged Brie")) {
    			updater = new AgedBrieUpdater();
    		}
    		else if(currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
    			updater = new SulfurasUpdater();
    		}
    		else if(currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    			updater = new BackstagePassesUpdater();
    		}
    		else {
    			updater = new CommonItemUpdater();    			
    		}
    		
    		updater.update(currentItem);
    		
        }
    }
}