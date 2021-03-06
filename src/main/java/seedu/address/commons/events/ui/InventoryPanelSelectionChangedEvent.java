package seedu.address.commons.events.ui;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.drink.Drink;

/**
 * Represents a selection change in the Inventory List Panel
 */
public class InventoryPanelSelectionChangedEvent extends BaseEvent {
    private final Drink newSelection;

    public InventoryPanelSelectionChangedEvent(Drink newSelection) {
        this.newSelection = newSelection;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public Drink getNewSelection() {
        return newSelection;
    }
}
