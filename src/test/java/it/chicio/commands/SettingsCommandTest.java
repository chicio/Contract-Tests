package it.chicio.commands;

import org.mockito.Mockito;

public class SettingsCommandTest extends CommandContract {

    protected Command givenACommand(MenuActionsListener menuActionsListener) {
        return new SettingsCommand(menuActionsListener);
    }

    protected void thenTheCorrectMenuActionIsInvoked(MenuActionsListener menuActionsListener) {
        Mockito.verify(menuActionsListener).onSettingsSelected();
    }
}
