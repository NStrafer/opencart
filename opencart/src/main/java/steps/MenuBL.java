package steps;

import pages.Menu;

public class MenuBL {

    private Menu menu;

    public MenuBL() {
        menu = new Menu();
    }

    public MenuBL clickOnDesktopsButton() {
       menu.getDesktopsButton().click();
        return this;
    }

    public MenuBL clickOnDesktopsPcButton() {
        menu.getDesktopsPCButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnDesktopsMacButton() {
        menu.getDesktopsMacButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnShowAllDesktopsButton() {
        menu.getAllDesktopsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnLaptopsAndNotebooksButton() {
        menu.getLaptopsAndNotebooksButton().click();
        return this;
    }

    public MenuBL clickOnLaptopsAndNotebooksMacsButton() {
        menu.getLaptopsAndNotebooksMacsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnLaptopsAndNotebooksWindowsButton() {
        menu.getLaptopsAndNotebooksWindowsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnShowAllLaptopsAndNotebooksButton() {
        menu.getAllLaptopsAndNotebooksButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnComponentsButton() {
        menu.getComponentsButton().click();
        return this;
    }

    public MenuBL clickOnMonitorsButton() {
        menu.getMonitorsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnShowAllComponentsButton() {
        menu.getAllComponentsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnTabletsButton() {
        menu.getTabletsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnSoftwareButton() {
        menu.getSoftwareButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnPhonesAndPDAsButton() {
        menu.getPhonesAndPDAsButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnCamerasButton() {
        menu.getCamerasButton().click();
        return new MenuBL();
    }

    public MenuBL clickOnMp3PlayersButton() {
        menu.getMp3PlayersButton().click();
        return this;
    }

    public MenuBL clickOnShowAllMp3PlayersButton() {
        menu.getAllMp3PlayersButton().click();
        return new MenuBL();
    }
}
