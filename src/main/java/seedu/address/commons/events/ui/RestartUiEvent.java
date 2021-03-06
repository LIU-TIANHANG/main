package seedu.address.commons.events.ui;

import javafx.stage.Stage;
import seedu.address.commons.events.BaseEvent;

/**
 * Indicates a request from login page to main app
 */
public class RestartUiEvent extends BaseEvent {

    public final Stage mainStage;

    public RestartUiEvent (Stage stage) {
        this.mainStage = stage;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
