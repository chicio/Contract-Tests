package it.chicio.commands;

public class SettingsCommand implements Command {
    private MenuActionsListener menuActionsListener;

    SettingsCommand(MenuActionsListener menuActionsListener) {
        this.menuActionsListener = menuActionsListener;
    }

    public void execute() {
        menuActionsListener.onSettingsSelected();
    }
}
