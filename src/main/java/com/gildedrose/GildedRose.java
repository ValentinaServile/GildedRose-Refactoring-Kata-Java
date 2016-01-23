package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	for (Item currentItem : items) {
    		if (currentItem.name.equals("Aged Brie")) {
    			new AgedBrieUpdater().update(currentItem);
    		}
    		else if(currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
    			new SulfurasUpdater().update(currentItem);
    		}
    		else if(currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    			new BackstagePassesUpdater().update(currentItem);
    		}
    		else {
    			new CommonItemUpdater().update(currentItem);    			
    		}
    		
        }
    }
}