package it.chicio.commands;

class AccountCommand implements Command {
    private MenuActionsListener menuActionsListener;

    AccountCommand(MenuActionsListener menuActionsListener) {
        this.menuActionsListener = menuActionsListener;
    }

    public void execute() {
        menuActionsListener.onAccountSelected();
    }
}
