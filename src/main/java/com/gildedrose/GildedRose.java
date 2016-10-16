package com.gildedrose;

import static com.gildedrose.UpdaterFactory.updaterFor;
import static java.util.Arrays.asList;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        asList(items).forEach(item -> updaterFor(item).update(item));
    }
}