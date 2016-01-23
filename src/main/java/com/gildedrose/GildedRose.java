package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	for (Item currentItem : items) {
    		if (currentItem.name.equals("Aged Brie")) {
    			if(currentItem.quality < 50) {
    				currentItem.quality++;
    			}
    			currentItem.sellIn--;
    		}
    		else if(currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
    		}
    		else if(currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    			if(currentItem.sellIn <= 0) {
    				currentItem.quality = 0;
    			}
    			else if(currentItem.sellIn <= 5) {
    				if(currentItem.quality < 50) {
    					currentItem.quality += 3;
    				}
    			}
    			else if(currentItem.sellIn <= 10) {
    				if(currentItem.quality < 50) {
    					currentItem.quality += 2;
    				}
    			}
    			else {
    				if(currentItem.quality < 50) {
    					currentItem.quality ++;
    				}
    			}
    			currentItem.sellIn--;
    		}
    		else {
    			if (currentItem.quality > 0) {
    				currentItem.quality--;
    			}
    			currentItem.sellIn--;
    			
    			if (currentItem.sellIn < 0 && currentItem.quality > 0) {
					currentItem.quality--;
    			}    			
    		}
    		
        }
    }
}