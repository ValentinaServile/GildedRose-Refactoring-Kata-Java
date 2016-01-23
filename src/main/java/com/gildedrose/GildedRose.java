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
    			continue;
    		}
    		else if(currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
    			continue;
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
    			continue;
    		}
    		
            if (currentItem.quality > 0) {
                currentItem.quality = currentItem.quality - 1;
            }

            currentItem.sellIn = currentItem.sellIn - 1;

            if (currentItem.sellIn < 0) {
                if (currentItem.quality > 0) {
                    currentItem.quality = currentItem.quality - 1;
                }
            }
        }
    }
}