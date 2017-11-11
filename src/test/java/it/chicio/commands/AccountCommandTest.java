package it.chicio.commands;

import org.mockito.Mockito;

public class AccountCommandTest extends CommandContract {

    protected Command givenACommand(MenuActionsListener menuActionsListener) {
        return new AccountCommand(menuActionsListener);
    }

    protected void thenTheCorrectMenuActionIsInvoked(MenuActionsListener menuActionsListener) {
        Mockito.verify(menuActionsListener).onAccountSelected();
    }
}
