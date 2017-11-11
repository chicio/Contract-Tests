package it.chicio.commands;

import org.junit.Test;
import static org.mockito.Mockito.mock;

abstract class CommandContract {
    private Command command;
    private MenuActionsListener menuActionsListener;

    @Test
    public void commandIsExecuted() throws Exception {
        givenAMenuActionListener();
        command = givenACommand(menuActionsListener);
        whenACommandIsExecuted();
        thenTheCorrectMenuActionIsInvoked(menuActionsListener);
    }

    private void givenAMenuActionListener() {
        menuActionsListener = mock(MenuActionsListener.class);
    }

    protected abstract Command givenACommand(MenuActionsListener menuActionsListener);

    private void whenACommandIsExecuted() {
        command.execute();
    }

    protected abstract void thenTheCorrectMenuActionIsInvoked(MenuActionsListener menuActionsListener);
}
